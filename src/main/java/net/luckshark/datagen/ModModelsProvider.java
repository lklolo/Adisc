package net.luckshark.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.luckshark.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_TEST, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_MELODY, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_SINGANDPLAYTOGETHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_SILHOUETTEDANCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_SENZAIHYOUMEI, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_SHIORI, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_SASURAI, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_REFRAIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_PANORAMA, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_OTOICHIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_NOROSHI, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_NAMONAKI, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_MAYOIUTA, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_KOKYUU, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_UTAKOTOBA, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_TANEBI, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_KAISOU, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_HEKITENBANSOU, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_HARUHIKAGE, Models.GENERATED);

        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_CRYCHICHARUHIKAGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_WANTTOBEHUMAN, Models.GENERATED);

        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_BLACKBIRTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_ANGLES, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADISC_MUSIC_DISC_WELCOMETOAVEMUJICA, Models.GENERATED);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }
}
