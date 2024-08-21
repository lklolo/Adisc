package net.luckshark.events;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.luckshark.tags.ModItemTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.JukeboxBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DiscUesOnJukebox {

    private static ActionResult onUseBlock(PlayerEntity player, World world, Hand hand, BlockHitResult hitResult) {

        ItemStack itemStack = player.getStackInHand(hand);

        if (isRight(itemStack)) {
            Block clickedBlock = world.getBlockState(hitResult.getBlockPos()).getBlock();
            if (clickedBlock == Blocks.JUKEBOX) {
                if (!jukeboxStatus(world, hitResult.getBlockPos())){
                    MinecraftServer server = world.getServer();
                    if (server != null) {
                        server.execute(() -> decrementItem(player, itemStack));
                    }
                }
            }
        }
        return ActionResult.PASS;
    }

    private static boolean isRight(ItemStack itemStack){
        return itemStack.isIn(ModItemTags.ADISC) || itemStack.isIn(ModItemTags.MINECRAFT_DISC);
    }

    private static void decrementItem(PlayerEntity player, ItemStack itemStack) {
        itemStack.decrement(1);
    }

    public static boolean jukeboxStatus(World world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos);
        Block block = blockState.getBlock();
        if (block instanceof JukeboxBlock jukeboxBlock) {
            return blockState.get(JukeboxBlock.HAS_RECORD);
        }
        return false;
    }

    public static void register() {
        UseBlockCallback.EVENT.register(DiscUesOnJukebox::onUseBlock);
    }
}

