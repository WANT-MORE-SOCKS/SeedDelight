package org.hiedacamellia.seedsdelight;

import fuzs.puzzleslib.api.core.v1.ModConstructor;
import fuzs.puzzleslib.api.core.v1.context.CreativeModeTabContext;
import fuzs.puzzleslib.api.item.v2.CreativeModeTabConfigurator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.hiedacamellia.seedsdelight.core.ModRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Seedsdelight implements ModConstructor {
    public static final String MOD_ID = "seedsdelight";
    public static final String MOD_NAME = "Seeds Delight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    @Override
    public void onConstructMod() {
        ModRegistry.touch();
    }

    @Override
    public void onRegisterCreativeModeTabs(CreativeModeTabContext context) {
        context.registerCreativeModeTab(CreativeModeTabConfigurator.from(MOD_ID, () -> new ItemStack(ModRegistry.ACORN_BAG.value())).displayItems((itemDisplayParameters, output) -> {
            output.accept(ModRegistry.ACORN_BAG.value());
            output.accept(ModRegistry.CHERRY_CRATE.value());
            output.accept(ModRegistry.ROSEHIP_CRATE.value());
            output.accept(ModRegistry.PINECONE_BAG.value());
            output.accept(ModRegistry.ROSEHIP_PIE.value());

            output.accept(ModRegistry.ACORN_BREAD.value());
            output.accept(ModRegistry.ACORN_KERNEL.value());
            output.accept(ModRegistry.ACORN_TOFU.value());
            output.accept(ModRegistry.ACORN.value());
            output.accept(ModRegistry.CHERRY_ICE_CREAM.value());
            output.accept(ModRegistry.CHERRY_JAM_JAR.value());
            output.accept(ModRegistry.CHERRY_JAM_SANDWICH.value());
            output.accept(ModRegistry.CHERRY_PORK.value());
            output.accept(ModRegistry.CHERRY_WINE.value());
            output.accept(ModRegistry.CHERRY.value());
            output.accept(ModRegistry.DRIED_PUMPKIN_SEED.value());
            output.accept(ModRegistry.DRIED_WATERMELON_SEED.value());
            output.accept(ModRegistry.FRIED_SUNFLOWER_SEED.value());
            output.accept(ModRegistry.MILK_CHERRY_MOUSS.value());
            output.accept(ModRegistry.PINE_NEEDLE_WINE.value());
            output.accept(ModRegistry.PINE_NUT_KERNEL.value());
            output.accept(ModRegistry.PINECONE.value());
            output.accept(ModRegistry.PINENUT_CAKE.value());
            output.accept(ModRegistry.PINENUT_GRUEL.value());
            output.accept(ModRegistry.PINENUT_WITH_MEATBALLS.value());
            output.accept(ModRegistry.RAW_ACORN_NOODLE.value());
            output.accept(ModRegistry.ROASTED_BEEF_WITH_SEED.value());
            output.accept(ModRegistry.ROSE_COOKIE.value());
            output.accept(ModRegistry.ROSEHIP_CAKE.value());
            output.accept(ModRegistry.ROSEHIP_JAM_JAR.value());
            output.accept(ModRegistry.ROSEHIP_JAM_SANDWICH.value());
            output.accept(ModRegistry.ROSEHIP_PIE_SLICE.value());
            output.accept(ModRegistry.ROSEHIP_TEA.value());
            output.accept(ModRegistry.ROSEHIP.value());
            output.accept(ModRegistry.SEED_ROSEHIP_PIE.value());
            output.accept(ModRegistry.SEED_TART.value());
            output.accept(ModRegistry.STIR_FRIED_CABBAGE_WITH_ACORN.value());
            output.accept(ModRegistry.SUNFLOWER_SEED_CRISP.value());
            output.accept(ModRegistry.SUNFLOWER_SEED_TOAST.value());
            output.accept(ModRegistry.SUNFLOWER_SEED.value());
        }));
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}