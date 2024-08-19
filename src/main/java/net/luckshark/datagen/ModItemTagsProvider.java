package net.luckshark.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.luckshark.item.ModItems;
import net.luckshark.tags.ModItemTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModItemTags.ADISC)
                .add(ModItems.ADISC_MUSIC_DISC_TEST)
                .add(ModItems.ADISC_MUSIC_DISC_UTAKOTOBA)
                .add(ModItems.ADISC_MUSIC_DISC_SINGANDPLAYTOGETHER)
                .add(ModItems.ADISC_MUSIC_DISC_SILHOUETTEDANCE)
                .add(ModItems.ADISC_MUSIC_DISC_SENZAIHYOUMEI)
                .add(ModItems.ADISC_MUSIC_DISC_SASURAI)
                .add(ModItems.ADISC_MUSIC_DISC_SHIORI)
                .add(ModItems.ADISC_MUSIC_DISC_REFRAIN)
                .add(ModItems.ADISC_MUSIC_DISC_PANORAMA)
                .add(ModItems.ADISC_MUSIC_DISC_OTOICHIE)
                .add(ModItems.ADISC_MUSIC_DISC_NOROSHI)
                .add(ModItems.ADISC_MUSIC_DISC_NAMONAKI)
                .add(ModItems.ADISC_MUSIC_DISC_KOKYUU)
                .add(ModItems.ADISC_MUSIC_DISC_KAISOU)
                .add(ModItems.ADISC_MUSIC_DISC_HEKITENBANSOU)
                .add(ModItems.ADISC_MUSIC_DISC_HARUHIKAGE)
                .add(ModItems.ADISC_MUSIC_DISC_MAYOIUTA)
                .add(ModItems.ADISC_MUSIC_DISC_MELODY)
                .add(ModItems.ADISC_MUSIC_DISC_TANEBI)

                .add(ModItems.ADISC_MUSIC_DISC_WANTTOBEHUMAN)
                .add(ModItems.ADISC_MUSIC_DISC_CRYCHICHARUHIKAGE)

                .add(ModItems.ADISC_MUSIC_DISC_WELCOMETOAVEMUJICA)
                .add(ModItems.ADISC_MUSIC_DISC_BLACKBIRTH)
                .add(ModItems.ADISC_MUSIC_DISC_ANGLES)

                .add(ModItems.ADISC_MUSIC_DISC_BOND_EIGHTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_ELEVENTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_FIFTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_FIRST)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_FOURTEENTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_FOURTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_NINTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_SECOND)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_SEVENTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_SIXTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_TENTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_THIRD)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_THIRTEENTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_TWELFTH)
        ;
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .addTag(ModItemTags.ADISC)
        ;
    }
}
