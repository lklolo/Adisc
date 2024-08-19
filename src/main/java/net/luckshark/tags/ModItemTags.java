package net.luckshark.tags;

import net.luckshark.ADisc;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static TagKey<Item> ADISC = of("adisc");
    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(ADisc.MOD_ID, id));
    }
    public static void registerModItemTags() {
    }
}
