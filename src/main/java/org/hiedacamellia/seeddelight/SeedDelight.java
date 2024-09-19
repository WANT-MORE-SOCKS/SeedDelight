package org.hiedacamellia.seeddelight;


import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.hiedacamellia.seeddelight.registry.BlockRegistry;
import org.hiedacamellia.seeddelight.registry.ItemRegistry;
import org.slf4j.Logger;

import javax.annotation.Nonnull;


@Mod(SeedDelight.MODID)
public class SeedDelight {
    public static final String MODID = "seeddelight";
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final CreativeModeTab SeedDelightTab = new CreativeModeTab(SeedDelight.MODID)
    {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.Acorn.get());
        }
    };
    public SeedDelight() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemRegistry.ITEMS.register(eventBus);
        BlockRegistry.BLOCKS.register(eventBus);
        eventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

    }
    private void commonSetup(final FMLCommonSetupEvent event) {
    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            LOGGER.info("HELLO FROM CLIENT SETUP");
        }
    }
}
