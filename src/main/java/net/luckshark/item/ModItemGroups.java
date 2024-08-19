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

                            entries.add(ModItems.ADISC_MUSIC_DISC_BOND_EIGHTH);
                            entries.add(ModItems.ADISC_MUSIC_DISC_BOND_ELEVENTH);
                            entries.add(ModItems.ADISC_MUSIC_DISC_BOND_FIFTH);
                            entries.add(ModItems.ADISC_MUSIC_DISC_BOND_FIRST);
                            entries.add(ModItems.ADISC_MUSIC_DISC_BOND_FOURTEENTH);
                            entries.add(ModItems.ADISC_MUSIC_DISC_BOND_FOURTH);
                            entries.add(ModItems.ADISC_MUSIC_DISC_BOND_NINTH);
                            entries.add(ModItems.ADISC_MUSIC_DISC_BOND_SECOND);
                            entries.add(ModItems.ADISC_MUSIC_DISC_BOND_SEVENTH);
                            entries.add(ModItems.ADISC_MUSIC_DISC_BOND_SIXTH);
                            entries.add(ModItems.ADISC_MUSIC_DISC_BOND_TENTH);
                            entries.add(ModItems.ADISC_MUSIC_DISC_BOND_THIRD);
                            entries.add(ModItems.ADISC_MUSIC_DISC_BOND_THIRTEENTH);
                            entries.add(ModItems.ADISC_MUSIC_DISC_BOND_TWELFTH);

                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_1);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_10);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_11);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_12);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_13);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_14);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_15);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_16);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_17);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_18);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_19);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_2);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_20);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_21);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_3);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_4);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_5);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_6);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_7);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_8);
                            entries.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_9);

                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_1);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_10);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_11);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_12);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_13);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_14);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_15);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_16);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_17);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_18);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_19);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_2);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_20);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_21);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_22);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_23);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_24);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_25);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_26);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_27);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_28);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_29);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_3);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_30);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_4);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_5);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_6);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_7);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_8);
                            entries.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_9);

                        })
                        .build()
        );
    }
}
