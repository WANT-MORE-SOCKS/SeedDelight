package org.hiedacamellia.seedsdelight.fabric;

import fuzs.puzzleslib.api.core.v1.ModConstructor;
import org.hiedacamellia.seedsdelight.Seedsdelight;
import net.fabricmc.api.ModInitializer;

public final class SeedsdelightFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ModConstructor.construct(Seedsdelight.MOD_ID, Seedsdelight::new);
    }
}
