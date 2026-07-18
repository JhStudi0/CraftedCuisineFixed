package net.jhstudios.craftedcuisine.block.entity;

import net.jhstudios.craftedcuisine.CraftedCuisine;
import net.jhstudios.craftedcuisine.block.ModBlocks;
import net.jhstudios.craftedcuisine.block.entity.custom.CookingPotBlockEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<CookingPotBlockEntity> COOKING_POT_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(CraftedCuisine.MOD_ID, "cooking_pot_be"),
                    BlockEntityType.Builder.create(CookingPotBlockEntity::new, ModBlocks.COOKING_POT).build(null));




    public static void registerBlockEntities(){
        CraftedCuisine.LOGGER.info("Registering Block Entities for" + CraftedCuisine.MOD_ID);
    }
}
