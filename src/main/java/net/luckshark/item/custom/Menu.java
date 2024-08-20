package net.luckshark.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class Menu extends Item {
    public Menu(Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("item.adisc.menu.tooltip_null"));
        tooltip.add(Text.translatable("item.adisc.menu.tooltip_2"));
        tooltip.add(Text.translatable("item.adisc.menu.tooltip_20"));
        tooltip.add(Text.translatable("item.adisc.menu.tooltip_21"));
        tooltip.add(Text.translatable("item.adisc.menu.tooltip_22"));
        tooltip.add(Text.translatable("item.adisc.menu.tooltip_23"));
        tooltip.add(Text.translatable("item.adisc.menu.tooltip_24"));
        tooltip.add(Text.translatable("item.adisc.menu.tooltip_25"));
        tooltip.add(Text.translatable("item.adisc.menu.tooltip_26"));
        tooltip.add(Text.translatable("item.adisc.menu.tooltip_null"));
        tooltip.add(Text.translatable("item.adisc.menu.tooltip_3"));
        tooltip.add(Text.translatable("item.adisc.menu.tooltip_31"));
        tooltip.add(Text.translatable("item.adisc.menu.tooltip_32"));
        tooltip.add(Text.translatable("item.adisc.menu.tooltip_33"));
        tooltip.add(Text.translatable("item.adisc.menu.tooltip_34"));
        tooltip.add(Text.translatable("item.adisc.menu.tooltip_null"));
        tooltip.add(Text.translatable("item.adisc.menu.tooltip_end1"));
        tooltip.add(Text.translatable("item.adisc.menu.tooltip_end2"));



    }
}
