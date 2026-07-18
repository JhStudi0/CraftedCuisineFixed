package net.jhstudios.craftedcuisine;

import net.fabricmc.api.ModInitializer;

import net.jhstudios.craftedcuisine.block.ModBlocks;
import net.jhstudios.craftedcuisine.block.custom.CornGrinderBlock;
import net.jhstudios.craftedcuisine.block.entity.ModBlockEntities;
import net.jhstudios.craftedcuisine.entity.ModEntities;
import net.jhstudios.craftedcuisine.item.ModItemGroups;
import net.jhstudios.craftedcuisine.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CraftedCuisine implements ModInitializer {

	public static final String MOD_ID = "craftedcuisine";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModEntities.registerModEntities();
		ModBlockEntities.registerBlockEntities();

		CornGrinderBlock.registerRecipes();
	}
}