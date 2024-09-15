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
        context.registerCreativeModeTab(CreativeModeTabConfigurator.from(MOD_ID, () -> new ItemStack(ModRegistry.ACORN_BAG.get())).displayItems((itemDisplayParameters, output) -> {
            output.accept(ModRegistry.ACORN_BAG.get());
            output.accept(ModRegistry.CHERRY_CRATE.get());
            output.accept(ModRegistry.ROSEHIP_CRATE.get());
            output.accept(ModRegistry.PINECONE_BAG.get());
            output.accept(ModRegistry.ROSEHIP_PIE.get());

            output.accept(ModRegistry.ACORN_BREAD.get());
            output.accept(ModRegistry.ACORN_KERNEL.get());
            output.accept(ModRegistry.ACORN_TOFU.get());
            output.accept(ModRegistry.ACORN.get());
            output.accept(ModRegistry.CHERRY_ICE_CREAM.get());
            output.accept(ModRegistry.CHERRY_JAM_JAR.get());
            output.accept(ModRegistry.CHERRY_JAM_SANDWICH.get());
            output.accept(ModRegistry.CHERRY_PORK.get());
            output.accept(ModRegistry.CHERRY_WINE.get());
            output.accept(ModRegistry.CHERRY.get());
            output.accept(ModRegistry.DRIED_PUMPKIN_SEED.get());
            output.accept(ModRegistry.DRIED_WATERMELON_SEED.get());
            output.accept(ModRegistry.FRIED_SUNFLOWER_SEED.get());
            output.accept(ModRegistry.MILK_CHERRY_MOUSS.get());
            output.accept(ModRegistry.PINE_NEEDLE_WINE.get());
            output.accept(ModRegistry.PINE_NUT_KERNEL.get());
            output.accept(ModRegistry.PINECONE.get());
            output.accept(ModRegistry.PINENUT_CAKE.get());
            output.accept(ModRegistry.PINENUT_GRUEL.get());
            output.accept(ModRegistry.PINENUT_WITH_MEATBALLS.get());
            output.accept(ModRegistry.RAW_ACORN_NOODLE.get());
            output.accept(ModRegistry.ROASTED_BEEF_WITH_SEED.get());
            output.accept(ModRegistry.ROSE_COOKIE.get());
            output.accept(ModRegistry.ROSEHIP_CAKE.get());
            output.accept(ModRegistry.ROSEHIP_JAM_JAR.get());
            output.accept(ModRegistry.ROSEHIP_JAM_SANDWICH.get());
            output.accept(ModRegistry.ROSEHIP_PIE_SLICE.get());
            output.accept(ModRegistry.ROSEHIP_TEA.get());
            output.accept(ModRegistry.ROSEHIP.get());
            output.accept(ModRegistry.SEED_ROSEHIP_PIE.get());
            output.accept(ModRegistry.SEED_TART.get());
            output.accept(ModRegistry.STIR_FRIED_CABBAGE_WITH_ACORN.get());
            output.accept(ModRegistry.SUNFLOWER_SEED_CRISP.get());
            output.accept(ModRegistry.SUNFLOWER_SEED_TOAST.get());
            output.accept(ModRegistry.SUNFLOWER_SEED.get());
        }));
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}