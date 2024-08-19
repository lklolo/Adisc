package net.luckshark.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.luckshark.ADisc;
import net.luckshark.sound.ModJukeboxSongs;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item ADISC_MUSIC_DISC_TEST = registerItems("adisc_music_disc_test", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TEST)));
    public static final Item ADISC_MUSIC_DISC_HARUHIKAGE = registerItems("adisc_music_disc_haruhikage", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_HARUHIKAGE)));
    public static final Item ADISC_MUSIC_DISC_HEKITENBANSOU = registerItems("adisc_music_disc_hekitenbansou", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_HEKITENBANSOU)));
    public static final Item ADISC_MUSIC_DISC_KAISOU = registerItems("adisc_music_disc_kaisou", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_KAISOU)));
    public static final Item ADISC_MUSIC_DISC_KOKYUU = registerItems("adisc_music_disc_kokyuu", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_KOKYUU)));
    public static final Item ADISC_MUSIC_DISC_MAYOIUTA = registerItems("adisc_music_disc_mayoiuta", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_MAYOIUTA)));
    public static final Item ADISC_MUSIC_DISC_MELODY = registerItems("adisc_music_disc_melody", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_MELODY)));
    public static final Item ADISC_MUSIC_DISC_NAMONAKI = registerItems("adisc_music_disc_namonaki", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_NAMONAKI)));
    public static final Item ADISC_MUSIC_DISC_NOROSHI = registerItems("adisc_music_disc_noroshi", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_NOROSHI)));
    public static final Item ADISC_MUSIC_DISC_OTOICHIE = registerItems("adisc_music_disc_otoichie", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_OTOICHIE)));
    public static final Item ADISC_MUSIC_DISC_PANORAMA = registerItems("adisc_music_disc_panorama", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_PANORAMA)));
    public static final Item ADISC_MUSIC_DISC_REFRAIN = registerItems("adisc_music_disc_refrain", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_REFRAIN)));
    public static final Item ADISC_MUSIC_DISC_SASURAI = registerItems("adisc_music_disc_sasurai", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_SASURAI)));
    public static final Item ADISC_MUSIC_DISC_SENZAIHYOUMEI = registerItems("adisc_music_disc_senzaihyoumei", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_SENZAIHYOUMEI)));
    public static final Item ADISC_MUSIC_DISC_SHIORI = registerItems("adisc_music_disc_shiori", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_SHIORI)));
    public static final Item ADISC_MUSIC_DISC_SILHOUETTEDANCE = registerItems("adisc_music_disc_silhouettedance", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_SILHOUETTEDANCE)));
    public static final Item ADISC_MUSIC_DISC_SINGANDPLAYTOGETHER = registerItems("adisc_music_disc_singandplaytogether", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_SINGANDPLAYTOGETHER)));
    public static final Item ADISC_MUSIC_DISC_TANEBI = registerItems("adisc_music_disc_tanebi", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TANEBI)));
    public static final Item ADISC_MUSIC_DISC_UTAKOTOBA = registerItems("adisc_music_disc_utakotoba", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_UTAKOTOBA)));

    public static final Item ADISC_MUSIC_DISC_CRYCHICHARUHIKAGE= registerItems("adisc_music_disc_crychicharuhikage", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_CRYCHICHARUHIKAGE)));
    public static final Item ADISC_MUSIC_DISC_WANTTOBEHUMAN = registerItems("adisc_music_disc_wanttobehuman", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_WANTTOBEHUMAN)));

    public static final Item ADISC_MUSIC_DISC_WELCOMETOAVEMUJICA = registerItems("adisc_music_disc_welcometoavemujica", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_WELCOMETOAVEMUJICA)));
    public static final Item ADISC_MUSIC_DISC_BLACKBIRTH = registerItems("adisc_music_disc_blackbirth", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_BLACKBIRTH)));
    public static final Item ADISC_MUSIC_DISC_ANGLES = registerItems("adisc_music_disc_angles", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_ANGLES)));

    public static final Item ADISC_MUSIC_DISC_BOND_EIGHTH = registerItems("adisc_music_disc_bond_eighth", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_BOND_EIGHTH)));
    public static final Item ADISC_MUSIC_DISC_BOND_ELEVENTH = registerItems("adisc_music_disc_bond_eleventh", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_BOND_ELEVENTH)));
    public static final Item ADISC_MUSIC_DISC_BOND_FIFTH = registerItems("adisc_music_disc_bond_fifth", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_BOND_FIFTH)));
    public static final Item ADISC_MUSIC_DISC_BOND_FIRST = registerItems("adisc_music_disc_bond_first", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_BOND_FIRST)));
    public static final Item ADISC_MUSIC_DISC_BOND_FOURTEENTH = registerItems("adisc_music_disc_bond_fourteenth", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_BOND_FOURTEENTH)));
    public static final Item ADISC_MUSIC_DISC_BOND_FOURTH = registerItems("adisc_music_disc_bond_fourth", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_BOND_FOURTH)));
    public static final Item ADISC_MUSIC_DISC_BOND_NINTH = registerItems("adisc_music_disc_bond_ninth", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_BOND_NINTH)));
    public static final Item ADISC_MUSIC_DISC_BOND_SECOND = registerItems("adisc_music_disc_bond_second", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_BOND_SECOND)));
    public static final Item ADISC_MUSIC_DISC_BOND_SEVENTH = registerItems("adisc_music_disc_bond_seventh", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_BOND_SEVENTH)));
    public static final Item ADISC_MUSIC_DISC_BOND_SIXTH = registerItems("adisc_music_disc_bond_sixth", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_BOND_SIXTH)));
    public static final Item ADISC_MUSIC_DISC_BOND_TENTH = registerItems("adisc_music_disc_bond_tenth", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_BOND_TENTH)));
    public static final Item ADISC_MUSIC_DISC_BOND_THIRD = registerItems("adisc_music_disc_bond_third", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_BOND_THIRD)));
    public static final Item ADISC_MUSIC_DISC_BOND_THIRTEENTH = registerItems("adisc_music_disc_bond_thirteenth", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_BOND_THIRTEENTH)));
    public static final Item ADISC_MUSIC_DISC_BOND_TWELFTH = registerItems("adisc_music_disc_bond_twelfth", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_BOND_TWELFTH)));

    public static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ADisc.MOD_ID, id), item);
    }
    public static void addItemToTOOLS(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_HARUHIKAGE);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_HEKITENBANSOU);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_KAISOU);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_KOKYUU);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_MAYOIUTA);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_MELODY);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_NAMONAKI);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_NOROSHI);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_OTOICHIE);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_PANORAMA);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_REFRAIN);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_SASURAI);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_SENZAIHYOUMEI);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_SHIORI);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_SILHOUETTEDANCE);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_SINGANDPLAYTOGETHER);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TANEBI);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_UTAKOTOBA);

        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_CRYCHICHARUHIKAGE);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_WANTTOBEHUMAN);

        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_WELCOMETOAVEMUJICA);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_BLACKBIRTH);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_ANGLES);

        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_BOND_EIGHTH);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_BOND_ELEVENTH);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_BOND_FIFTH);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_BOND_FIRST);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_BOND_FOURTEENTH);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_BOND_FOURTH);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_BOND_NINTH);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_BOND_SECOND);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_BOND_SEVENTH);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_BOND_SIXTH);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_BOND_TENTH);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_BOND_THIRD);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_BOND_THIRTEENTH);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_BOND_TWELFTH);
    }
    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemToTOOLS);
    }
}
