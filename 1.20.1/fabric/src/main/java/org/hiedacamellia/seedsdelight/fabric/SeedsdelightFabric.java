package org.hiedacamellia.seedsdelight.fabric;

import fuzs.puzzleslib.api.core.v1.ModConstructor;
import org.hiedacamellia.seedsdelight.Seedsdelight;
import net.fabricmc.api.ModInitializer;

public final class SeedsdelightFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        ModConstructor.construct(Seedsdelight.MOD_ID, Seedsdelight::new);
    }
}
