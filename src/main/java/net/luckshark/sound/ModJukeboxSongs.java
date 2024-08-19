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

    }
}
