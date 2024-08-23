package net.luckshark.sound;

import net.luckshark.ADisc;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public interface ModJukeboxSongs {
    RegistryKey<JukeboxSong> ADISC_TEST = of("adisc_test");
    RegistryKey<JukeboxSong> ADISC_KOKYUU = of("adisc_kokyuu");
    RegistryKey<JukeboxSong> ADISC_KAISOU = of("adisc_kaisou");
    RegistryKey<JukeboxSong> ADISC_NAMONAKI = of("adisc_namonaki");
    RegistryKey<JukeboxSong> ADISC_SENZAIHYOUMEI = of("adisc_senzaihyoumei");
    RegistryKey<JukeboxSong> ADISC_SASURAI = of("adisc_sasurai");
    RegistryKey<JukeboxSong> ADISC_REFRAIN = of("adisc_refrain");
    RegistryKey<JukeboxSong> ADISC_MELODY = of("adisc_melody");
    RegistryKey<JukeboxSong> ADISC_SHIORI = of("adisc_shiori");
    RegistryKey<JukeboxSong> ADISC_SILHOUETTEDANCE = of("adisc_silhouettedance");
    RegistryKey<JukeboxSong> ADISC_UTAKOTOBA = of("adisc_utakotoba");
    RegistryKey<JukeboxSong> ADISC_TANEBI = of("adisc_tanebi");
    RegistryKey<JukeboxSong> ADISC_NOROSHI = of("adisc_noroshi");
    RegistryKey<JukeboxSong> ADISC_MAYOIUTA = of("adisc_mayoiuta");
    RegistryKey<JukeboxSong> ADISC_PANORAMA = of("adisc_panorama");
    RegistryKey<JukeboxSong> ADISC_SINGANDPLAYTOGETHER = of("adisc_singandplaytogether");
    RegistryKey<JukeboxSong> ADISC_HEKITENBANSOU = of("adisc_hekitenbansou");
    RegistryKey<JukeboxSong> ADISC_OTOICHIE = of("adisc_otoichie");
    RegistryKey<JukeboxSong> ADISC_HARUHIKAGE = of("adisc_haruhikage");

    RegistryKey<JukeboxSong> ADISC_CRYCHICHARUHIKAGE = of("adisc_crychicharuhikage");
    RegistryKey<JukeboxSong> ADISC_WANTTOBEHUMAN = of("adisc_wanttobehuman");

    RegistryKey<JukeboxSong> ADISC_BLACKBIRTH = of("adisc_blackbirth");
    RegistryKey<JukeboxSong> ADISC_ANGLES = of("adisc_angles");
    RegistryKey<JukeboxSong> ADISC_WELCOMETOAVEMUJICA = of("adisc_welcometoavemujica");

    RegistryKey<JukeboxSong> ADISC_BOND_EIGHTH = of("adisc_bond_eighth");
    RegistryKey<JukeboxSong> ADISC_BOND_ELEVENTH = of("adisc_bond_eleventh");
    RegistryKey<JukeboxSong> ADISC_BOND_FIFTH = of("adisc_bond_fifth");
    RegistryKey<JukeboxSong> ADISC_BOND_FIRST = of("adisc_bond_first");
    RegistryKey<JukeboxSong> ADISC_BOND_FOURTEENTH = of("adisc_bond_fourteenth");
    RegistryKey<JukeboxSong> ADISC_BOND_FOURTH = of("adisc_bond_fourth");
    RegistryKey<JukeboxSong> ADISC_BOND_NINTH = of("adisc_bond_ninth");
    RegistryKey<JukeboxSong> ADISC_BOND_SECOND = of("adisc_bond_second");
    RegistryKey<JukeboxSong> ADISC_BOND_SEVENTH = of("adisc_bond_seventh");
    RegistryKey<JukeboxSong> ADISC_BOND_SIXTH = of("adisc_bond_sixth");
    RegistryKey<JukeboxSong> ADISC_BOND_TENTH = of("adisc_bond_tenth");
    RegistryKey<JukeboxSong> ADISC_BOND_THIRD = of("adisc_bond_third");
    RegistryKey<JukeboxSong> ADISC_BOND_THIRTEENTH = of("adisc_bond_thirteenth");
    RegistryKey<JukeboxSong> ADISC_BOND_TWELFTH = of("adisc_bond_twelfth");

    RegistryKey<JukeboxSong> ADISC_TOGETOGE_1 = of("adisc_togetoge_1");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_10 = of("adisc_togetoge_10");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_11 = of("adisc_togetoge_11");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_12 = of("adisc_togetoge_12");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_13 = of("adisc_togetoge_13");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_14 = of("adisc_togetoge_14");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_15 = of("adisc_togetoge_15");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_16 = of("adisc_togetoge_16");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_17 = of("adisc_togetoge_17");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_18 = of("adisc_togetoge_18");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_19 = of("adisc_togetoge_19");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_2 = of("adisc_togetoge_2");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_20 = of("adisc_togetoge_20");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_21 = of("adisc_togetoge_21");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_3 = of("adisc_togetoge_3");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_4 = of("adisc_togetoge_4");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_5 = of("adisc_togetoge_5");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_6 = of("adisc_togetoge_6");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_7 = of("adisc_togetoge_7");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_8 = of("adisc_togetoge_8");
    RegistryKey<JukeboxSong> ADISC_TOGETOGE_9 = of("adisc_togetoge_9");

    RegistryKey<JukeboxSong> ADISC_COMEWITHME_1 = of("adisc_comewithme_1");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_10 = of("adisc_comewithme_10");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_11 = of("adisc_comewithme_11");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_12 = of("adisc_comewithme_12");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_13 = of("adisc_comewithme_13");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_14 = of("adisc_comewithme_14");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_15 = of("adisc_comewithme_15");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_16 = of("adisc_comewithme_16");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_17 = of("adisc_comewithme_17");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_18 = of("adisc_comewithme_18");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_19 = of("adisc_comewithme_19");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_2 = of("adisc_comewithme_2");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_20 = of("adisc_comewithme_20");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_21 = of("adisc_comewithme_21");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_22 = of("adisc_comewithme_22");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_23 = of("adisc_comewithme_23");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_24 = of("adisc_comewithme_24");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_25 = of("adisc_comewithme_25");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_26 = of("adisc_comewithme_26");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_27 = of("adisc_comewithme_27");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_28 = of("adisc_comewithme_28");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_29 = of("adisc_comewithme_29");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_3 = of("adisc_comewithme_3");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_30 = of("adisc_comewithme_30");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_4 = of("adisc_comewithme_4");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_5 = of("adisc_comewithme_5");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_6 = of("adisc_comewithme_6");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_7 = of("adisc_comewithme_7");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_8 = of("adisc_comewithme_8");
    RegistryKey<JukeboxSong> ADISC_COMEWITHME_9 = of("adisc_comewithme_9");

    RegistryKey<JukeboxSong> ADISC_THANK17_1 = of("adisc_thank17_1");
    RegistryKey<JukeboxSong> ADISC_THANK17_10 = of("adisc_thank17_10");
    RegistryKey<JukeboxSong> ADISC_THANK17_11 = of("adisc_thank17_11");
    RegistryKey<JukeboxSong> ADISC_THANK17_12 = of("adisc_thank17_12");
    RegistryKey<JukeboxSong> ADISC_THANK17_13 = of("adisc_thank17_13");
    RegistryKey<JukeboxSong> ADISC_THANK17_14 = of("adisc_thank17_14");
    RegistryKey<JukeboxSong> ADISC_THANK17_2 = of("adisc_thank17_2");
    RegistryKey<JukeboxSong> ADISC_THANK17_3 = of("adisc_thank17_3");
    RegistryKey<JukeboxSong> ADISC_THANK17_4 = of("adisc_thank17_4");
    RegistryKey<JukeboxSong> ADISC_THANK17_5 = of("adisc_thank17_5");
    RegistryKey<JukeboxSong> ADISC_THANK17_6 = of("adisc_thank17_6");
    RegistryKey<JukeboxSong> ADISC_THANK17_7 = of("adisc_thank17_7");
    RegistryKey<JukeboxSong> ADISC_THANK17_8 = of("adisc_thank17_8");
    RegistryKey<JukeboxSong> ADISC_THANK17_9 = of("adisc_thank17_9");

    RegistryKey<JukeboxSong> ADISC_BOOK1_1 = of("adisc_book1_1");
    RegistryKey<JukeboxSong> ADISC_BOOK1_2 = of("adisc_book1_2");
    RegistryKey<JukeboxSong> ADISC_BOOK1_3 = of("adisc_book1_3");
    RegistryKey<JukeboxSong> ADISC_BOOK1_4 = of("adisc_book1_4");
    RegistryKey<JukeboxSong> ADISC_BOOK1_5 = of("adisc_book1_5");
    RegistryKey<JukeboxSong> ADISC_BOOK1_6 = of("adisc_book1_6");
    RegistryKey<JukeboxSong> ADISC_BOOK1_7 = of("adisc_book1_7");
    RegistryKey<JukeboxSong> ADISC_BOOK1_8 = of("adisc_book1_8");
    RegistryKey<JukeboxSong> ADISC_BOOK1_9 = of("adisc_book1_9");
    RegistryKey<JukeboxSong> ADISC_BOOK2_1 = of("adisc_book2_1");
    RegistryKey<JukeboxSong> ADISC_BOOK2_2 = of("adisc_book2_2");
    RegistryKey<JukeboxSong> ADISC_BOOK2_3 = of("adisc_book2_3");
    RegistryKey<JukeboxSong> ADISC_BOOK2_4 = of("adisc_book2_4");
    RegistryKey<JukeboxSong> ADISC_BOOK2_5 = of("adisc_book2_5");
    RegistryKey<JukeboxSong> ADISC_BOOK2_6 = of("adisc_book2_6");
    RegistryKey<JukeboxSong> ADISC_BOOK2_7 = of("adisc_book2_7");
    RegistryKey<JukeboxSong> ADISC_BOOK2_8 = of("adisc_book2_8");
    RegistryKey<JukeboxSong> ADISC_BOOK3_1 = of("adisc_book3_1");
    RegistryKey<JukeboxSong> ADISC_BOOK3_10 = of("adisc_book3_10");
    RegistryKey<JukeboxSong> ADISC_BOOK3_2 = of("adisc_book3_2");
    RegistryKey<JukeboxSong> ADISC_BOOK3_3 = of("adisc_book3_3");
    RegistryKey<JukeboxSong> ADISC_BOOK3_4 = of("adisc_book3_4");
    RegistryKey<JukeboxSong> ADISC_BOOK3_5 = of("adisc_book3_5");
    RegistryKey<JukeboxSong> ADISC_BOOK3_6 = of("adisc_book3_6");
    RegistryKey<JukeboxSong> ADISC_BOOK3_7 = of("adisc_book3_7");
    RegistryKey<JukeboxSong> ADISC_BOOK3_8 = of("adisc_book3_8");
    RegistryKey<JukeboxSong> ADISC_BOOK3_9 = of("adisc_book3_9");

    private static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ADisc.MOD_ID, id));
    }
    private static void register(
            Registerable<JukeboxSong> registry, RegistryKey<JukeboxSong> key, RegistryEntry.Reference<SoundEvent> soundEvent, int lengthInSeconds, int comparatorOutput
    ) {
        registry.register(
                key, new JukeboxSong(soundEvent, Text.translatable(Util.createTranslationKey("jukebox_song", key.getValue())), (float)lengthInSeconds, comparatorOutput)
        );
    }

     static void bootstrap(Registerable<JukeboxSong> registry) {
        register(registry, ADISC_TEST, ModSoundEvents.ADISC_MUSIC_DISC_TEST, 252, 15);
        register(registry, ADISC_KOKYUU, ModSoundEvents.ADISC_MUSIC_DISC_KOKYUU, 219, 15);
        register(registry, ADISC_KAISOU, ModSoundEvents.ADISC_MUSIC_DISC_KAISOU, 261, 15);
        register(registry, ADISC_NAMONAKI, ModSoundEvents.ADISC_MUSIC_DISC_NAMONAKI, 268, 15);
        register(registry, ADISC_SENZAIHYOUMEI, ModSoundEvents.ADISC_MUSIC_DISC_SENZAIHYOUMEI, 266, 15);
        register(registry, ADISC_SASURAI, ModSoundEvents.ADISC_MUSIC_DISC_SASURAI, 226, 15);
        register(registry, ADISC_REFRAIN, ModSoundEvents.ADISC_MUSIC_DISC_REFRAIN, 209, 15);
        register(registry, ADISC_MELODY, ModSoundEvents.ADISC_MUSIC_DISC_MELODY, 215, 15);
        register(registry, ADISC_SHIORI, ModSoundEvents.ADISC_MUSIC_DISC_SHIORI, 266, 15);
        register(registry, ADISC_SILHOUETTEDANCE, ModSoundEvents.ADISC_MUSIC_DISC_SILHOUETTEDANCE, 210, 15);
        register(registry, ADISC_UTAKOTOBA, ModSoundEvents.ADISC_MUSIC_DISC_UTAKOTOBA, 240, 15);
        register(registry, ADISC_TANEBI, ModSoundEvents.ADISC_MUSIC_DISC_TANEBI, 243, 15);
        register(registry, ADISC_NOROSHI, ModSoundEvents.ADISC_MUSIC_DISC_NOROSHI, 226, 15);
        register(registry, ADISC_MAYOIUTA, ModSoundEvents.ADISC_MUSIC_DISC_MAYOIUTA, 216, 15);
        register(registry, ADISC_PANORAMA, ModSoundEvents.ADISC_MUSIC_DISC_PANORAMA, 261, 15);
        register(registry, ADISC_SINGANDPLAYTOGETHER, ModSoundEvents.ADISC_MUSIC_DISC_SINGANDPLAYTOGETHER, 180, 15);
        register(registry, ADISC_HEKITENBANSOU, ModSoundEvents.ADISC_MUSIC_DISC_HEKITENBANSOU, 228, 15);
        register(registry, ADISC_OTOICHIE, ModSoundEvents.ADISC_MUSIC_DISC_OTOICHIE, 288, 15);
        register(registry, ADISC_HARUHIKAGE, ModSoundEvents.ADISC_MUSIC_DISC_HARUHIKAGE, 259, 15);

        register(registry, ADISC_CRYCHICHARUHIKAGE, ModSoundEvents.ADISC_MUSIC_DISC_CRYCHICHARUHIKAGE, 258, 15);
        register(registry, ADISC_WANTTOBEHUMAN, ModSoundEvents.ADISC_MUSIC_DISC_WANTTOBEHUMAN, 140, 15);

        register(registry, ADISC_BLACKBIRTH, ModSoundEvents.ADISC_MUSIC_DISC_BLACKBIRTH, 223, 15);
        register(registry, ADISC_ANGLES, ModSoundEvents.ADISC_MUSIC_DISC_ANGLES, 276, 15);
        register(registry, ADISC_WELCOMETOAVEMUJICA, ModSoundEvents.ADISC_MUSIC_DISC_WELCOMETOAVEMUJICA, 258, 15);

        register(registry, ADISC_BOND_EIGHTH, ModSoundEvents.ADISC_MUSIC_DISC_BOND_EIGHTH, 265, 15);
        register(registry, ADISC_BOND_ELEVENTH, ModSoundEvents.ADISC_MUSIC_DISC_BOND_ELEVENTH, 223, 15);
        register(registry, ADISC_BOND_FIFTH, ModSoundEvents.ADISC_MUSIC_DISC_BOND_FIFTH, 229, 15);
        register(registry, ADISC_BOND_FIRST, ModSoundEvents.ADISC_MUSIC_DISC_BOND_FIRST, 203, 15);
        register(registry, ADISC_BOND_FOURTEENTH, ModSoundEvents.ADISC_MUSIC_DISC_BOND_FOURTEENTH, 271, 15);
        register(registry, ADISC_BOND_FOURTH, ModSoundEvents.ADISC_MUSIC_DISC_BOND_FOURTH, 232, 15);
        register(registry, ADISC_BOND_NINTH, ModSoundEvents.ADISC_MUSIC_DISC_BOND_NINTH, 223, 15);
        register(registry, ADISC_BOND_SECOND, ModSoundEvents.ADISC_MUSIC_DISC_BOND_SECOND, 232, 15);
        register(registry, ADISC_BOND_SEVENTH, ModSoundEvents.ADISC_MUSIC_DISC_BOND_SEVENTH, 213, 15);
        register(registry, ADISC_BOND_SIXTH, ModSoundEvents.ADISC_MUSIC_DISC_BOND_SIXTH, 189, 15);
        register(registry, ADISC_BOND_TENTH, ModSoundEvents.ADISC_MUSIC_DISC_BOND_TENTH, 227, 15);
        register(registry, ADISC_BOND_THIRD, ModSoundEvents.ADISC_MUSIC_DISC_BOND_THIRD, 203, 15);
        register(registry, ADISC_BOND_THIRTEENTH, ModSoundEvents.ADISC_MUSIC_DISC_BOND_THIRTEENTH, 275, 15);
        register(registry, ADISC_BOND_TWELFTH, ModSoundEvents.ADISC_MUSIC_DISC_BOND_TWELFTH, 258, 15);

        register(registry, ADISC_TOGETOGE_1, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_1, 198, 15);
        register(registry, ADISC_TOGETOGE_10, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_10, 228, 15);
        register(registry, ADISC_TOGETOGE_11, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_11, 188, 15);
        register(registry, ADISC_TOGETOGE_12, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_12, 185, 15);
        register(registry, ADISC_TOGETOGE_13, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_13, 196, 15);
        register(registry, ADISC_TOGETOGE_14, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_14, 180, 15);
        register(registry, ADISC_TOGETOGE_15, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_15, 188, 15);
        register(registry, ADISC_TOGETOGE_16, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_16, 189, 15);
        register(registry, ADISC_TOGETOGE_17, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_17, 189, 15);
        register(registry, ADISC_TOGETOGE_18, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_18, 178, 15);
        register(registry, ADISC_TOGETOGE_19, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_19, 195, 15);
        register(registry, ADISC_TOGETOGE_2, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_2, 204, 15);
        register(registry, ADISC_TOGETOGE_20, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_20, 195, 15);
        register(registry, ADISC_TOGETOGE_21, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_21, 184, 15);
        register(registry, ADISC_TOGETOGE_3, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_3, 155, 15);
        register(registry, ADISC_TOGETOGE_4, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_4, 221, 15);
        register(registry, ADISC_TOGETOGE_5, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_5, 162, 15);
        register(registry, ADISC_TOGETOGE_6, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_6, 155, 15);
        register(registry, ADISC_TOGETOGE_7, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_7, 184, 15);
        register(registry, ADISC_TOGETOGE_8, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_8, 190, 15);
        register(registry, ADISC_TOGETOGE_9, ModSoundEvents.ADISC_MUSIC_DISC_TOGETOGE_9, 189, 15);

        register(registry, ADISC_COMEWITHME_1, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_1, 279, 15);
        register(registry, ADISC_COMEWITHME_10, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_10, 91, 15);
        register(registry, ADISC_COMEWITHME_11, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_11, 91, 15);
        register(registry, ADISC_COMEWITHME_12, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_12, 91, 15);
        register(registry, ADISC_COMEWITHME_13, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_13, 91, 15);
        register(registry, ADISC_COMEWITHME_14, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_14, 91, 15);
        register(registry, ADISC_COMEWITHME_15, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_15, 105, 15);
        register(registry, ADISC_COMEWITHME_16, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_16, 104, 15);
        register(registry, ADISC_COMEWITHME_17, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_17, 216, 15);
        register(registry, ADISC_COMEWITHME_18, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_18, 252, 15);
        register(registry, ADISC_COMEWITHME_19, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_19, 209, 15);
        register(registry, ADISC_COMEWITHME_2, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_2, 238, 15);
        register(registry, ADISC_COMEWITHME_20, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_20, 246, 15);
        register(registry, ADISC_COMEWITHME_21, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_21, 273, 15);
        register(registry, ADISC_COMEWITHME_22, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_22, 202, 15);
        register(registry, ADISC_COMEWITHME_23, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_23, 239, 15);
        register(registry, ADISC_COMEWITHME_24, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_24, 283, 15);
        register(registry, ADISC_COMEWITHME_25, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_25, 271, 15);
        register(registry, ADISC_COMEWITHME_26, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_26, 192, 15);
        register(registry, ADISC_COMEWITHME_27, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_27, 126, 15);
        register(registry, ADISC_COMEWITHME_28, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_28, 238, 15);
        register(registry, ADISC_COMEWITHME_29, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_29, 264, 15);
        register(registry, ADISC_COMEWITHME_3, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_3, 192, 15);
        register(registry, ADISC_COMEWITHME_30, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_30, 267, 15);
        register(registry, ADISC_COMEWITHME_4, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_4, 274, 15);
        register(registry, ADISC_COMEWITHME_5, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_5, 214, 15);
        register(registry, ADISC_COMEWITHME_6, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_6, 248, 15);
        register(registry, ADISC_COMEWITHME_7, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_7, 232, 15);
        register(registry, ADISC_COMEWITHME_8, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_8, 252, 15);
        register(registry, ADISC_COMEWITHME_9, ModSoundEvents.ADISC_MUSIC_DISC_COMEWITHME_9, 90, 15);

        register(registry, ADISC_THANK17_1, ModSoundEvents.ADISC_MUSIC_DISC_THANK17_1, 289, 15);
        register(registry, ADISC_THANK17_10, ModSoundEvents.ADISC_MUSIC_DISC_THANK17_10, 177, 15);
        register(registry, ADISC_THANK17_11, ModSoundEvents.ADISC_MUSIC_DISC_THANK17_11, 229, 15);
        register(registry, ADISC_THANK17_12, ModSoundEvents.ADISC_MUSIC_DISC_THANK17_12, 271, 15);
        register(registry, ADISC_THANK17_13, ModSoundEvents.ADISC_MUSIC_DISC_THANK17_13, 245, 15);
        register(registry, ADISC_THANK17_14, ModSoundEvents.ADISC_MUSIC_DISC_THANK17_14, 264, 15);
        register(registry, ADISC_THANK17_2, ModSoundEvents.ADISC_MUSIC_DISC_THANK17_2, 256, 15);
        register(registry, ADISC_THANK17_3, ModSoundEvents.ADISC_MUSIC_DISC_THANK17_3, 224, 15);
        register(registry, ADISC_THANK17_4, ModSoundEvents.ADISC_MUSIC_DISC_THANK17_4, 269, 15);
        register(registry, ADISC_THANK17_5, ModSoundEvents.ADISC_MUSIC_DISC_THANK17_5, 262, 15);
        register(registry, ADISC_THANK17_6, ModSoundEvents.ADISC_MUSIC_DISC_THANK17_6, 219, 15);
        register(registry, ADISC_THANK17_7, ModSoundEvents.ADISC_MUSIC_DISC_THANK17_7, 200, 15);
        register(registry, ADISC_THANK17_8, ModSoundEvents.ADISC_MUSIC_DISC_THANK17_8, 226, 15);
        register(registry, ADISC_THANK17_9, ModSoundEvents.ADISC_MUSIC_DISC_THANK17_9, 340, 15);

        register(registry, ADISC_BOOK1_1, ModSoundEvents.ADISC_MUSIC_DISC_BOOK1_1, 50, 15);
        register(registry, ADISC_BOOK1_2, ModSoundEvents.ADISC_MUSIC_DISC_BOOK1_2, 271, 15);
        register(registry, ADISC_BOOK1_3, ModSoundEvents.ADISC_MUSIC_DISC_BOOK1_3, 198, 15);
        register(registry, ADISC_BOOK1_4, ModSoundEvents.ADISC_MUSIC_DISC_BOOK1_4, 240, 15);
        register(registry, ADISC_BOOK1_5, ModSoundEvents.ADISC_MUSIC_DISC_BOOK1_5, 256, 15);
        register(registry, ADISC_BOOK1_6, ModSoundEvents.ADISC_MUSIC_DISC_BOOK1_6, 248, 15);
        register(registry, ADISC_BOOK1_7, ModSoundEvents.ADISC_MUSIC_DISC_BOOK1_7, 243, 15);
        register(registry, ADISC_BOOK1_8, ModSoundEvents.ADISC_MUSIC_DISC_BOOK1_8, 258, 15);
        register(registry, ADISC_BOOK1_9, ModSoundEvents.ADISC_MUSIC_DISC_BOOK1_9, 35, 15);
        register(registry, ADISC_BOOK2_1, ModSoundEvents.ADISC_MUSIC_DISC_BOOK2_1, 216, 15);
        register(registry, ADISC_BOOK2_2, ModSoundEvents.ADISC_MUSIC_DISC_BOOK2_2, 220, 15);
        register(registry, ADISC_BOOK2_3, ModSoundEvents.ADISC_MUSIC_DISC_BOOK2_3, 166, 15);
        register(registry, ADISC_BOOK2_4, ModSoundEvents.ADISC_MUSIC_DISC_BOOK2_4, 218, 15);
        register(registry, ADISC_BOOK2_5, ModSoundEvents.ADISC_MUSIC_DISC_BOOK2_5, 213, 15);
        register(registry, ADISC_BOOK2_6, ModSoundEvents.ADISC_MUSIC_DISC_BOOK2_6, 205, 15);
        register(registry, ADISC_BOOK2_7, ModSoundEvents.ADISC_MUSIC_DISC_BOOK2_7, 201, 15);
        register(registry, ADISC_BOOK2_8, ModSoundEvents.ADISC_MUSIC_DISC_BOOK2_8, 210, 15);
        register(registry, ADISC_BOOK3_1, ModSoundEvents.ADISC_MUSIC_DISC_BOOK3_1, 194, 15);
        register(registry, ADISC_BOOK3_10, ModSoundEvents.ADISC_MUSIC_DISC_BOOK3_10, 217, 15);
        register(registry, ADISC_BOOK3_2, ModSoundEvents.ADISC_MUSIC_DISC_BOOK3_2, 48, 15);
        register(registry, ADISC_BOOK3_3, ModSoundEvents.ADISC_MUSIC_DISC_BOOK3_3, 192, 15);
        register(registry, ADISC_BOOK3_4, ModSoundEvents.ADISC_MUSIC_DISC_BOOK3_4, 256, 15);
        register(registry, ADISC_BOOK3_5, ModSoundEvents.ADISC_MUSIC_DISC_BOOK3_5, 185, 15);
        register(registry, ADISC_BOOK3_6, ModSoundEvents.ADISC_MUSIC_DISC_BOOK3_6, 67, 15);
        register(registry, ADISC_BOOK3_7, ModSoundEvents.ADISC_MUSIC_DISC_BOOK3_7, 211, 15);
        register(registry, ADISC_BOOK3_8, ModSoundEvents.ADISC_MUSIC_DISC_BOOK3_8, 198, 15);
        register(registry, ADISC_BOOK3_9, ModSoundEvents.ADISC_MUSIC_DISC_BOOK3_9, 198, 15);

    }
}
