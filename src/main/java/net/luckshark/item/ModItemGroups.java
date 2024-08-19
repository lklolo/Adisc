package net.luckshark.item;

import net.luckshark.ADisc;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> ADISC_GROUP = register("adisc_group");
    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(ADisc.MOD_ID, id));
    }
    public static void registerModItemGroups(){
        Registry.register(
                Registries.ITEM_GROUP,
                ADISC_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, -1)
                        .displayName(Text.translatable("itemGroup.adisc.adisc_group"))
                        .icon(() -> new ItemStack(ModItems.ADISC_MUSIC_DISC_TEST))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.ADISC_MUSIC_DISC_HARUHIKAGE);
                            entries.add(ModItems.ADISC_MUSIC_DISC_HEKITENBANSOU);
                            entries.add(ModItems.ADISC_MUSIC_DISC_KAISOU);
                            entries.add(ModItems.ADISC_MUSIC_DISC_KOKYUU);
                            entries.add(ModItems.ADISC_MUSIC_DISC_MAYOIUTA);
                            entries.add(ModItems.ADISC_MUSIC_DISC_MELODY);
                            entries.add(ModItems.ADISC_MUSIC_DISC_NAMONAKI);
                            entries.add(ModItems.ADISC_MUSIC_DISC_NOROSHI);
                            entries.add(ModItems.ADISC_MUSIC_DISC_OTOICHIE);
                            entries.add(ModItems.ADISC_MUSIC_DISC_PANORAMA);
                            entries.add(ModItems.ADISC_MUSIC_DISC_REFRAIN);
                            entries.add(ModItems.ADISC_MUSIC_DISC_SASURAI);
                            entries.add(ModItems.ADISC_MUSIC_DISC_SENZAIHYOUMEI);
                            entries.add(ModItems.ADISC_MUSIC_DISC_SHIORI);
                            entries.add(ModItems.ADISC_MUSIC_DISC_SILHOUETTEDANCE);
                            entries.add(ModItems.ADISC_MUSIC_DISC_SINGANDPLAYTOGETHER);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TANEBI);
                            entries.add(ModItems.ADISC_MUSIC_DISC_UTAKOTOBA);

                            entries.add(ModItems.ADISC_MUSIC_DISC_WANTTOBEHUMAN);
                            entries.add(ModItems.ADISC_MUSIC_DISC_CRYCHICHARUHIKAGE);

                            entries.add(ModItems.ADISC_MUSIC_DISC_WELCOMETOAVEMUJICA);
                            entries.add(ModItems.ADISC_MUSIC_DISC_ANGLES);
                            entries.add(ModItems.ADISC_MUSIC_DISC_BLACKBIRTH);

                        })
                        .build()
        );
    }
}
