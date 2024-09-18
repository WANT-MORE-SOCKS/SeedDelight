package org.hiedacamellia.seeddelight;

import net.fabricmc.api.ModInitializer;
import org.hiedacamellia.seeddelight.registry.BlockRegistry;
import org.hiedacamellia.seeddelight.registry.CreativeModeTabRegistry;
import org.hiedacamellia.seeddelight.registry.ItemRegistry;

public class SeedDelight implements ModInitializer {
    public static final String MODID = "seeddelight";
    @Override
    public void onInitialize() {
        ItemRegistry.ITEMS.register();
        BlockRegistry.BLOCKS.register();
        CreativeModeTabRegistry.CREATIVE_MODE_TABS.register();
    }
}
