package net.luckshark.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class Menu extends Item {
    public Menu(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);

        if (!world.isClient) {
            player.sendMessage(Text.translatable("item.adisc.menu.tooltip_menu"));
            player.sendMessage(Text.translatable("item.adisc.menu.tooltip_null"));
            player.sendMessage(Text.translatable("item.adisc.menu.tooltip_band"));
            player.sendMessage(Text.translatable("item.adisc.menu.tooltip_band_1"));
            player.sendMessage(Text.translatable("item.adisc.menu.tooltip_band_2"));
            player.sendMessage(Text.translatable("item.adisc.menu.tooltip_band_3"));
            player.sendMessage(Text.translatable("item.adisc.menu.tooltip_band_4"));
            player.sendMessage(Text.translatable("item.adisc.menu.tooltip_band_5"));
            player.sendMessage(Text.translatable("item.adisc.menu.tooltip_band_6"));
            player.sendMessage(Text.translatable("item.adisc.menu.tooltip_null"));
            player.sendMessage(Text.translatable("item.adisc.menu.tooltip_album"));
            player.sendMessage(Text.translatable("item.adisc.menu.tooltip_album_1"));
            player.sendMessage(Text.translatable("item.adisc.menu.tooltip_album_2"));
            player.sendMessage(Text.translatable("item.adisc.menu.tooltip_album_3"));
            player.sendMessage(Text.translatable("item.adisc.menu.tooltip_album_4"));
            player.sendMessage(Text.translatable("item.adisc.menu.tooltip_null"));
            player.sendMessage(Text.translatable("item.adisc.menu.tooltip_end_1"));
            player.sendMessage(Text.translatable("item.adisc.menu.tooltip_end_2"));
        }
        return TypedActionResult.success(itemStack);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if (Screen.hasShiftDown()){
            tooltip.add(Text.translatable("item.adisc.menu.tooltip_null"));
            tooltip.add(Text.translatable("item.adisc.menu.tooltip_band"));
            tooltip.add(Text.translatable("item.adisc.menu.tooltip_band_1"));
            tooltip.add(Text.translatable("item.adisc.menu.tooltip_band_2"));
            tooltip.add(Text.translatable("item.adisc.menu.tooltip_band_3"));
            tooltip.add(Text.translatable("item.adisc.menu.tooltip_band_4"));
            tooltip.add(Text.translatable("item.adisc.menu.tooltip_band_5"));
            tooltip.add(Text.translatable("item.adisc.menu.tooltip_band_6"));
            tooltip.add(Text.translatable("item.adisc.menu.tooltip_null"));
            tooltip.add(Text.translatable("item.adisc.menu.tooltip_album"));
            tooltip.add(Text.translatable("item.adisc.menu.tooltip_album_1"));
            tooltip.add(Text.translatable("item.adisc.menu.tooltip_album_2"));
            tooltip.add(Text.translatable("item.adisc.menu.tooltip_album_3"));
            tooltip.add(Text.translatable("item.adisc.menu.tooltip_album_4"));
            tooltip.add(Text.translatable("item.adisc.menu.tooltip_null"));
            tooltip.add(Text.translatable("item.adisc.menu.tooltip_end_1"));
            tooltip.add(Text.translatable("item.adisc.menu.tooltip_end_2"));
        }else {
            tooltip.add(Text.translatable("item.adisc.menu.tooltip_1"));
            tooltip.add(Text.translatable("item.adisc.menu.tooltip_2"));
        }

    }
}
