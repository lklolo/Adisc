package net.luckshark;

import net.fabricmc.api.ModInitializer;

import net.luckshark.block.ModBlocks;
import net.luckshark.item.ModItemGroups;
import net.luckshark.item.ModItems;
import net.luckshark.sound.ModSoundEvents;
import net.luckshark.tags.ModItemTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ADisc implements ModInitializer {
	public static final String MOD_ID = "adisc";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerModItemGroups();
		ModSoundEvents.registerModSoundEvents();
		ModItemTags.registerModItemTags();
	}
}