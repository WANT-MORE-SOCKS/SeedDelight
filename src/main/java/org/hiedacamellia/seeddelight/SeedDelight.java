package org.hiedacamellia.seeddelight;

import net.fabricmc.api.ModInitializer;
import org.hiedacamellia.seeddelight.registry.BlockRegistry;
import org.hiedacamellia.seeddelight.registry.CreativeModeTabRegistry;
import org.hiedacamellia.seeddelight.registry.ItemRegistry;

public class SeedDelight implements ModInitializer {
    public static final String MODID = "seeddelight";
    @Override
    public void onInitialize() {
        BlockRegistry.BLOCKS.register();
        ItemRegistry.ITEMS.register();
        CreativeModeTabRegistry.CREATIVE_MODE_TABS.register();
    }
}
