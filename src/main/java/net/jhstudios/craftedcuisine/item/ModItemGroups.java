package net.jhstudios.craftedcuisine.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jhstudios.craftedcuisine.CraftedCuisine;
import net.jhstudios.craftedcuisine.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {

    public static final ItemGroup Crafted_Cuisine_Item_Group = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CraftedCuisine.MOD_ID, "crafted_cuisine_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CORN))
                    .displayName(Text.translatable("itemgroup.craftedcuisine.crafted_cuisine_items"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.CORN);
                        entries.add(ModItems.CORN_SEEDS);
                        entries.add(ModItems.POPCORN);

                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.TOMATO_SEEDS);
                        entries.add(ModItems.TOMATO_SAUCE);

                        entries.add(ModItems.VANILLA_BEAN);
                        entries.add(ModItems.VANILLA_SEEDS);

                        entries.add(ModItems.POPPY_SEEDS);

                        entries.add(ModItems.RICE_SEEDS);
                        entries.add(ModItems.RICE_BOWL);

                        entries.add(ModItems.HONEY_COOKIE);

                        entries.add(ModItems.MILK_CHOCOLATE);
                        entries.add(ModItems.DARK_CHOCOLATE);
                        entries.add(ModItems.WHITE_CHOCOLATE);

                        entries.add(ModItems.CHOCOLATE_CAKE);

                        entries.add(ModItems.MILK_CHOCOLATE_APPLE);
                        entries.add(ModItems.DARK_CHOCOLATE_APPLE);
                        entries.add(ModItems.WHITE_CHOCOLATE_APPLE);

                        entries.add(ModItems.BUTTER);

                        entries.add(ModItems.SALT);
                        entries.add(ModItems.FLOUR);
                        entries.add(ModItems.YEAST_JAR);
                        entries.add(ModItems.FERMENTED_YEAST_JAR);

                        entries.add(ModItems.ROCK);

                        entries.add(ModItems.JAR);

                        entries.add(ModBlocks.COOKING_POT);
                        entries.add(ModBlocks.CORN_GRINDER);


                    }).build());



    public static void registerItemGroups() {
        CraftedCuisine.LOGGER.info("Registering Item Groups for " + CraftedCuisine.MOD_ID);
    }
}
