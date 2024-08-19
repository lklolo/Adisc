package net.luckshark.sound;

import net.luckshark.ADisc;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSoundEvents {
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_TEST = registerReference("adisc_music_disc.test");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_MAYOIUTA = registerReference("adisc_music_disc.mayoiuta");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_NAMONAKI = registerReference("adisc_music_disc.namonaki");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_SENZAIHYOUMEI = registerReference("adisc_music_disc.senzaihyoumei");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_SILHOUETTEDANCE = registerReference("adisc_music_disc.silhouettedance");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_HEKITENBANSOU = registerReference("adisc_music_disc.hekitenbansou");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_KOKYUU = registerReference("adisc_music_disc.kokyuu");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_PANORAMA = registerReference("adisc_music_disc.panorama");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_TANEBI = registerReference("adisc_music_disc.tanebi");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_SINGANDPLAYTOGETHER = registerReference("adisc_music_disc.singandplaytogether");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_KAISOU = registerReference("adisc_music_disc.kaisou");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_SHIORI = registerReference("adisc_music_disc.shiori");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_REFRAIN = registerReference("adisc_music_disc.refrain");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_MELODY = registerReference("adisc_music_disc.melody");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_SASURAI = registerReference("adisc_music_disc.sasurai");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_UTAKOTOBA = registerReference("adisc_music_disc.utakotoba");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_NOROSHI = registerReference("adisc_music_disc.noroshi");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_OTOICHIE = registerReference("adisc_music_disc.otoichie");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_HARUHIKAGE = registerReference("adisc_music_disc.haruhikage");

    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_CRYCHICHARUHIKAGE = registerReference("adisc_music_disc.crychicharuhikage");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_WANTTOBEHUMAN = registerReference("adisc_music_disc.wanttobehuman");

    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_ANGLES = registerReference("adisc_music_disc.angles");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_BLACKBIRTH = registerReference("adisc_music_disc.blackbirth");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_WELCOMETOAVEMUJICA = registerReference("adisc_music_disc.welcometoavemujica");

    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_BOND_EIGHTH = registerReference("adisc_music_disc.bond_eighth");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_BOND_ELEVENTH = registerReference("adisc_music_disc.bond_eleventh");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_BOND_FIFTH = registerReference("adisc_music_disc.bond_fifth");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_BOND_FIRST = registerReference("adisc_music_disc.bond_first");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_BOND_FOURTEENTH = registerReference("adisc_music_disc.bond_fourteenth");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_BOND_FOURTH = registerReference("adisc_music_disc.bond_fourth");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_BOND_NINTH = registerReference("adisc_music_disc.bond_ninth");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_BOND_SECOND = registerReference("adisc_music_disc.bond_second");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_BOND_SEVENTH = registerReference("adisc_music_disc.bond_seventh");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_BOND_SIXTH = registerReference("adisc_music_disc.bond_sixth");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_BOND_TENTH = registerReference("adisc_music_disc.bond_tenth");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_BOND_THIRD = registerReference("adisc_music_disc.bond_third");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_BOND_THIRTEENTH = registerReference("adisc_music_disc.bond_thirteenth");
    public static final RegistryEntry.Reference<SoundEvent> ADISC_MUSIC_DISC_BOND_TWELFTH = registerReference("adisc_music_disc.bond_twelfth");


    private static RegistryEntry.Reference<SoundEvent> registerReference(String name) {
        Identifier id = Identifier.of(ADisc.MOD_ID, name);
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerModSoundEvents() {
    }
}
