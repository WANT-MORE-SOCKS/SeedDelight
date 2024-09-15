package org.hiedacamellia.seedsdelight.neoforge;

import fuzs.puzzleslib.api.core.v1.ModConstructor;
import org.hiedacamellia.seedsdelight.Seedsdelight;
import net.neoforged.fml.common.Mod;

@Mod(Seedsdelight.MOD_ID)
public final class SeedsdelightNeoForge {
    public SeedsdelightNeoForge() {
        // Run our common setup.
        ModConstructor.construct(Seedsdelight.MOD_ID, Seedsdelight::new);
    }
}
