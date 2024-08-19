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

    public static final Item ADISC_MUSIC_DISC_TOGETOGE_1 = registerItems("adisc_music_disc_togetoge_1", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_1)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_10 = registerItems("adisc_music_disc_togetoge_10", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_10)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_11 = registerItems("adisc_music_disc_togetoge_11", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_11)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_12 = registerItems("adisc_music_disc_togetoge_12", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_12)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_13 = registerItems("adisc_music_disc_togetoge_13", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_13)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_14 = registerItems("adisc_music_disc_togetoge_14", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_14)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_15 = registerItems("adisc_music_disc_togetoge_15", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_15)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_16 = registerItems("adisc_music_disc_togetoge_16", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_16)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_17 = registerItems("adisc_music_disc_togetoge_17", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_17)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_18 = registerItems("adisc_music_disc_togetoge_18", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_18)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_19 = registerItems("adisc_music_disc_togetoge_19", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_19)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_2 = registerItems("adisc_music_disc_togetoge_2", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_2)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_20 = registerItems("adisc_music_disc_togetoge_20", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_20)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_21 = registerItems("adisc_music_disc_togetoge_21", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_21)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_3 = registerItems("adisc_music_disc_togetoge_3", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_3)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_4 = registerItems("adisc_music_disc_togetoge_4", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_4)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_5 = registerItems("adisc_music_disc_togetoge_5", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_5)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_6 = registerItems("adisc_music_disc_togetoge_6", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_6)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_7 = registerItems("adisc_music_disc_togetoge_7", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_7)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_8 = registerItems("adisc_music_disc_togetoge_8", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_8)));
    public static final Item ADISC_MUSIC_DISC_TOGETOGE_9 = registerItems("adisc_music_disc_togetoge_9", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_TOGETOGE_9)));

    public static final Item ADISC_MUSIC_DISC_COMEWITHME_1 = registerItems("adisc_music_disc_comewithme_1", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_1)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_10 = registerItems("adisc_music_disc_comewithme_10", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_10)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_11 = registerItems("adisc_music_disc_comewithme_11", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_11)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_12 = registerItems("adisc_music_disc_comewithme_12", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_12)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_13 = registerItems("adisc_music_disc_comewithme_13", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_13)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_14 = registerItems("adisc_music_disc_comewithme_14", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_14)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_15 = registerItems("adisc_music_disc_comewithme_15", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_15)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_16 = registerItems("adisc_music_disc_comewithme_16", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_16)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_17 = registerItems("adisc_music_disc_comewithme_17", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_17)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_18 = registerItems("adisc_music_disc_comewithme_18", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_18)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_19 = registerItems("adisc_music_disc_comewithme_19", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_19)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_2 = registerItems("adisc_music_disc_comewithme_2", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_2)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_20 = registerItems("adisc_music_disc_comewithme_20", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_20)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_21 = registerItems("adisc_music_disc_comewithme_21", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_21)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_22 = registerItems("adisc_music_disc_comewithme_22", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_22)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_23 = registerItems("adisc_music_disc_comewithme_23", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_23)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_24 = registerItems("adisc_music_disc_comewithme_24", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_24)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_25 = registerItems("adisc_music_disc_comewithme_25", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_25)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_26 = registerItems("adisc_music_disc_comewithme_26", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_26)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_27 = registerItems("adisc_music_disc_comewithme_27", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_27)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_28 = registerItems("adisc_music_disc_comewithme_28", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_28)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_29 = registerItems("adisc_music_disc_comewithme_29", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_29)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_3 = registerItems("adisc_music_disc_comewithme_3", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_3)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_30 = registerItems("adisc_music_disc_comewithme_30", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_30)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_4 = registerItems("adisc_music_disc_comewithme_4", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_4)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_5 = registerItems("adisc_music_disc_comewithme_5", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_5)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_6 = registerItems("adisc_music_disc_comewithme_6", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_6)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_7 = registerItems("adisc_music_disc_comewithme_7", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_7)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_8 = registerItems("adisc_music_disc_comewithme_8", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_8)));
    public static final Item ADISC_MUSIC_DISC_COMEWITHME_9 = registerItems("adisc_music_disc_comewithme_9", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ADISC_COMEWITHME_9)));



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

        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_1);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_10);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_11);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_12);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_13);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_14);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_15);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_16);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_17);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_18);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_19);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_2);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_20);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_21);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_3);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_4);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_5);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_6);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_7);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_8);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_TOGETOGE_9);

        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_1);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_10);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_11);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_12);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_13);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_14);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_15);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_16);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_17);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_18);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_19);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_2);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_20);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_21);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_22);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_23);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_24);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_25);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_26);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_27);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_28);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_29);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_3);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_30);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_4);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_5);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_6);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_7);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_8);
        fabricItemGroupEntries.add(ADISC_MUSIC_DISC_COMEWITHME_9);


    }
    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemToTOOLS);
    }
}
