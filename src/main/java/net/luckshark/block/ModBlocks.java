package net.luckshark.block;

import net.luckshark.ADisc;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static void registerBlockItems(String id, Block block) {
        Item item =  Registry.register(Registries.ITEM, Identifier.of(ADisc.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if(item instanceof BlockItem){
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }
    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ADisc.MOD_ID, id), block);
    }
    public static void registerModBlocks() {
    }
}
