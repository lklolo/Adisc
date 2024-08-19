package net.luckshark.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.luckshark.item.ModItemGroups;
import net.luckshark.item.ModItems;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModJAJPanProvider extends FabricLanguageProvider {
    public ModJAJPanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "ja_jp", registryLookup);
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
        translationBuilder.add("jukebox_song.adisc.adisc_kokyuu", "It's MyGO!!!!! - 処救生");
        translationBuilder.add("jukebox_song.adisc.adisc_kaisou", "It's MyGO!!!!! - 回層浮");
        translationBuilder.add("jukebox_song.adisc.adisc_namonaki", "It's MyGO!!!!! - 名無声");
        translationBuilder.add("jukebox_song.adisc.adisc_senzaihyoumei", "It's MyGO!!!!! - 潜在表明");
        translationBuilder.add("jukebox_song.adisc.adisc_sasurai", "It's MyGO!!!!! - 砂寸奏");
        translationBuilder.add("jukebox_song.adisc.adisc_refrain", "It's MyGO!!!!! - 輪符雨");
        translationBuilder.add("jukebox_song.adisc.adisc_melody", "It's MyGO!!!!! - 迷路日々");
        translationBuilder.add("jukebox_song.adisc.adisc_shiori", "It's MyGO!!!!! - 栞");
        translationBuilder.add("jukebox_song.adisc.adisc_silhouettedance", "It's MyGO!!!!! - 影色舞");
        translationBuilder.add("jukebox_song.adisc.adisc_utakotoba", "It's MyGO!!!!! - 詩超絆");
        translationBuilder.add("jukebox_song.adisc.adisc_tanebi", "It's MyGO!!!!! - 焚音打");
        translationBuilder.add("jukebox_song.adisc.adisc_noroshi", "It's MyGO!!!!! - 無路矢");
        translationBuilder.add("jukebox_song.adisc.adisc_mayoiuta", "It's MyGO!!!!! - 迷星叫");
        translationBuilder.add("jukebox_song.adisc.adisc_panorama", "It's MyGO!!!!! - 端程山");
        translationBuilder.add("jukebox_song.adisc.adisc_singandplaytogether", "It's MyGO!!!!! - 歌いましょう鳴らしましょう");
        translationBuilder.add("jukebox_song.adisc.adisc_hekitenbansou", "It's MyGO!!!!! - 碧天伴走");
        translationBuilder.add("jukebox_song.adisc.adisc_otoichie", "It's MyGO!!!!! - 音一会");
        translationBuilder.add("jukebox_song.adisc.adisc_haruhikage", "It's MyGO!!!!! - 春日影");

        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_CRYCHICHARUHIKAGE, "CRYCHIC");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_WANTTOBEHUMAN, "CRYCHIC");
        translationBuilder.add("jukebox_song.adisc.adisc_crychicharuhikage", "CRYCHIC - 春日影");
        translationBuilder.add("jukebox_song.adisc.adisc_wanttobehuman", "CRYCHIC - 人間になりたいうた");

        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BLACKBIRTH, "Ave Mujica");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_ANGLES, "Ave Mujica");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_WELCOMETOAVEMUJICA, "Ave Mujica");
        translationBuilder.add("jukebox_song.adisc.adisc_blackbirth", "Ave Mujica - 黒のバースデイ");
        translationBuilder.add("jukebox_song.adisc.adisc_angles", "Ave Mujica - Angles");
        translationBuilder.add("jukebox_song.adisc.adisc_welcometoavemujica", "Ave Mujica - 素晴らしき世界でもどこにもない場所");

    }
}
