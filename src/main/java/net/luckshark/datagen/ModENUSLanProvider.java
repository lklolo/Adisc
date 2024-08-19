package net.luckshark.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.luckshark.item.ModItemGroups;
import net.luckshark.item.ModItems;
import net.luckshark.tags.ModItemTags;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModENUSLanProvider extends FabricLanguageProvider {
    public ModENUSLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItemGroups.ADISC_GROUP, "ADisc");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TEST, "Adisc Test");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_KOKYUU, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_KAISOU, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_NAMONAKI, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_SENZAIHYOUMEI, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_SASURAI, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_REFRAIN, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_MELODY, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_SHIORI, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_SILHOUETTEDANCE, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_UTAKOTOBA, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TANEBI, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_NOROSHI, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_MAYOIUTA, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_PANORAMA, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_SINGANDPLAYTOGETHER, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_HEKITENBANSOU, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_OTOICHIE, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_HARUHIKAGE, "It's MyGO!!!!!");
        translationBuilder.add("jukebox_song.adisc.adisc_test", "Test");
        translationBuilder.add("jukebox_song.adisc.adisc_kokyuu", "It's MyGO!!!!! - Kokyuu");
        translationBuilder.add("jukebox_song.adisc.adisc_kaisou", "It's MyGO!!!!! - Kaisou");
        translationBuilder.add("jukebox_song.adisc.adisc_namonaki", "It's MyGO!!!!! - Namonaki");
        translationBuilder.add("jukebox_song.adisc.adisc_senzaihyoumei", "It's MyGO!!!!! - Senzaihyoumei");
        translationBuilder.add("jukebox_song.adisc.adisc_sasurai", "It's MyGO!!!!! - Sasurai");
        translationBuilder.add("jukebox_song.adisc.adisc_refrain", "It's MyGO!!!!! - Refrain");
        translationBuilder.add("jukebox_song.adisc.adisc_melody", "It's MyGO!!!!! - Melody");
        translationBuilder.add("jukebox_song.adisc.adisc_shiori", "It's MyGO!!!!! - Shiori");
        translationBuilder.add("jukebox_song.adisc.adisc_silhouettedance", "It's MyGO!!!!! - Silhouette Dance");
        translationBuilder.add("jukebox_song.adisc.adisc_utakotoba", "It's MyGO!!!!! - Utakotoba");
        translationBuilder.add("jukebox_song.adisc.adisc_tanebi", "It's MyGO!!!!! - Tanebi");
        translationBuilder.add("jukebox_song.adisc.adisc_noroshi", "It's MyGO!!!!! - Noroshi");
        translationBuilder.add("jukebox_song.adisc.adisc_mayoiuta", "It's MyGO!!!!! - Mayoiuta");
        translationBuilder.add("jukebox_song.adisc.adisc_panorama", "It's MyGO!!!!! - Panorama");
        translationBuilder.add("jukebox_song.adisc.adisc_singandplaytogether", "It's MyGO!!!!! - Sing and play together");
        translationBuilder.add("jukebox_song.adisc.adisc_hekitenbansou", "It's MyGO!!!!! - Hekitenbansou");
        translationBuilder.add("jukebox_song.adisc.adisc_otoichie", "It's MyGO!!!!! - Otoichie");
        translationBuilder.add("jukebox_song.adisc.adisc_haruhikage", "It's MyGO!!!!! - Haruhikage");

        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_CRYCHICHARUHIKAGE, "CRYCHIC");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_WANTTOBEHUMAN, "CRYCHIC");
        translationBuilder.add("jukebox_song.adisc.adisc_crychicharuhikage", "CRYCHIC - Haruhikage");
        translationBuilder.add("jukebox_song.adisc.adisc_wanttobehuman", "CRYCHIC - Want to be human");

        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BLACKBIRTH, "Ave Mujica");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_ANGLES, "Ave Mujica");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_WELCOMETOAVEMUJICA, "Ave Mujica");
        translationBuilder.add("jukebox_song.adisc.adisc_blackbirth", "Ave Mujica - BlackBirth");
        translationBuilder.add("jukebox_song.adisc.adisc_angles", "Ave Mujica - Angles");
        translationBuilder.add("jukebox_song.adisc.adisc_welcometoavemujica", "Ave Mujica - Welcome to AveMujica");

        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_EIGHTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_eighth", "结束バンド - カラカラ");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_ELEVENTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_eleventh", "结束バンド - 忘れてやらない");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_FIFTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_fifth", "结束バンド - ギターと孤独と蒼い惑星");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_FIRST, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_first", "结束バンド - 青春コンプレックス");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_FOURTEENTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_fourteenth", "结束バンド - 転がる岩、君に朝が降る");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_FOURTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_fourth", "结束バンド - ひみつ基地");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_NINTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_ninth", "结束バンド - 小さな海");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_SECOND, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_second", "结束バンド - ひとりぼっち東京");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_SEVENTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_seventh", "结束バンド - あのバンド");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_SIXTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_sixth", "结束バンド - ラブソングが歌えない");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_TENTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_tenth", "结束バンド - なにが悪い");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_THIRD, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_third", "结束バンド - Distortion!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_THIRTEENTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_thirteenth", "结束バンド - フラッシュバッカー");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_TWELFTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_twelfth", "结束バンド - 星座になれたら");

    }
}