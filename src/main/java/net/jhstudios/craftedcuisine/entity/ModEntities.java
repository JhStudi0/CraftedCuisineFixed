package net.jhstudios.craftedcuisine.entity;

import net.jhstudios.craftedcuisine.CraftedCuisine;
import net.jhstudios.craftedcuisine.entity.custom.RockProjectileEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<RockProjectileEntity> ROCK = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(CraftedCuisine.MOD_ID, "tomahawk"),
            EntityType.Builder.<RockProjectileEntity>create(RockProjectileEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 1.15f).build());


    public static void registerModEntities() {
        CraftedCuisine.LOGGER.info("Registering Mod Entities for " + CraftedCuisine.MOD_ID);
    }
}
