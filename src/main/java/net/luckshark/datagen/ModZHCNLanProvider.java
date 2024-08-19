package net.luckshark.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.luckshark.item.ModItemGroups;
import net.luckshark.item.ModItems;
import net.luckshark.tags.ModItemTags;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModZHCNLanProvider extends FabricLanguageProvider {
    public ModZHCNLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItemGroups.ADISC_GROUP, "ADisc唱片");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TEST, "AdiscTest唱片");
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
        translationBuilder.add("jukebox_song.adisc.adisc_singandplaytogether", "It's MyGO!!!!! - 歌いましょう鳴らしましょう（一同歌唱一同奏响）");
        translationBuilder.add("jukebox_song.adisc.adisc_hekitenbansou", "It's MyGO!!!!! - 碧天伴走");
        translationBuilder.add("jukebox_song.adisc.adisc_otoichie", "It's MyGO!!!!! - 音一会");
        translationBuilder.add("jukebox_song.adisc.adisc_haruhikage", "It's MyGO!!!!! - 春日影");

        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_CRYCHICHARUHIKAGE, "CRYCHIC");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_WANTTOBEHUMAN, "CRYCHIC");
        translationBuilder.add("jukebox_song.adisc.adisc_crychicharuhikage", "CRYCHIC - 春日影");
        translationBuilder.add("jukebox_song.adisc.adisc_wanttobehuman", "CRYCHIC - 人間になりたいうた（想成为人类）");

        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BLACKBIRTH, "Ave Mujica");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_ANGLES, "Ave Mujica");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_WELCOMETOAVEMUJICA, "Ave Mujica");
        translationBuilder.add("jukebox_song.adisc.adisc_blackbirth", "Ave Mujica - 黒のバースデイ (黑色生日)");
        translationBuilder.add("jukebox_song.adisc.adisc_angles", "Ave Mujica - Angles");
        translationBuilder.add("jukebox_song.adisc.adisc_welcometoavemujica", "Ave Mujica - 素晴らしき世界でもどこにもない場所（欢迎来到Ave Mujica的世界）");

        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_EIGHTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_eighth", "结束バンド - カラカラ（卡拉卡拉）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_ELEVENTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_eleventh", "结束バンド - 忘れてやらない（绝不会忘记）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_FIFTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_fifth", "结束バンド - ギターと孤独と蒼い惑星（吉他与孤独与蓝色星球）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_FIRST, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_first", "结束バンド - 青春コンプレックス（青春症候群）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_FOURTEENTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_fourteenth", "结束バンド - 転がる岩、君に朝が降る（翻转岩石，晨光洒落你身）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_FOURTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_fourth", "结束バンド - ひみつ基地（秘密基地）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_NINTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_ninth", "结束バンド - 小さな海（小小的海）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_SECOND, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_second", "结束バンド - ひとりぼっち東京（孤独东京）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_SEVENTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_seventh", "结束バンド - あのバンド（那个乐队）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_SIXTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_sixth", "结束バンド - ラブソングが歌えない（不会唱情歌）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_TENTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_tenth", "结束バンド - なにが悪い（有什么不好）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_THIRD, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_third", "结束バンド - Distortion!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_THIRTEENTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_thirteenth", "结束バンド - フラッシュバッカー（往日重现）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_TWELFTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_twelfth", "结束バンド - 星座になれたら（若能化作星座）");
    }}
