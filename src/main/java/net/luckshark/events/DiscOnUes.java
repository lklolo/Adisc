package net.luckshark.events;

import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.luckshark.sound.ModSoundEvents;
import net.luckshark.tags.ModItemTags;
import net.minecraft.block.Blocks;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.ActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DiscOnUes {
    private static TypedActionResult<ItemStack> onUse(PlayerEntity player, World world, Hand hand) {

        ItemStack itemStack = player.getStackInHand(hand);
        ItemStack offHandStack = player.getOffHandStack();

        if (world.isClient) {
            if (isRight(itemStack) && isOffHand(offHandStack)) {
                Optional<RegistryEntry<JukeboxSong>> optional = JukeboxSong.getSongEntryFromStack(world.getRegistryManager(), itemStack);
                RegistryEntry<JukeboxSong> song = (RegistryEntry<JukeboxSong>)optional.get();
                SoundEvent songSoundEvent = ModSoundEvents.getSoundEventReference(getSoundEventToString(String.valueOf(song.value()))).value();
                player.playSound(songSoundEvent);
                //我想写一个随身唱片机的功能，但是原版的jukebox的方法只能在世界的某一点播放声音。
                //所以我将JukeboxSong转换为了SoundEvent，试图用playSound()方法播放，但是playSound()方法画蛇添足自动判断如果SoundEvent是个唱片，依旧用jukebox的方法播放。
                //我就想不明白了我都传入SoundEvent了，凭什么不能用SoundEvent的方法播放，playSound()方法简直就是自作多情。
                //
                //就算我成功用playSound()播放了，但是游戏原版并没有Manager的一些方法来管理playSound()
                //所以只能用其他方法（如果有提供的话），或者我只能自己写音乐播放器了。
            }
        }
        return new TypedActionResult<>(ActionResult.PASS, itemStack);
    }

    private static boolean isRight(ItemStack itemStack){
        return itemStack.isIn(ModItemTags.ADISC) || itemStack.isIn(ModItemTags.MINECRAFT_DISC);
    }

    private static boolean isOffHand(ItemStack offHandStack) {
        if (offHandStack.isEmpty()) {
            return false;
        }
        if (offHandStack.getItem() instanceof BlockItem) {
            BlockItem blockItem = (BlockItem) offHandStack.getItem();
            return blockItem.getBlock() == Blocks.JUKEBOX;
        }
        return false;
    }

    public static String getSoundEventToString(String input) {
        String regex = "soundEvent=Reference\\{ResourceKey\\[minecraft:sound_event / adisc:(.+?)\\]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            String result =  matcher.group(1);
            System.out.println("SoundEventName: " + result);
            return result;
        }
        return null;
    }

    public static void register() {
        UseItemCallback.EVENT.register(DiscOnUes::onUse);
    }
}
