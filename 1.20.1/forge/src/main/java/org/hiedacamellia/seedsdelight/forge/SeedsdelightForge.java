package org.hiedacamellia.seedsdelight.forge;

import fuzs.puzzleslib.api.core.v1.ModConstructor;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import org.hiedacamellia.seedsdelight.Seedsdelight;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Seedsdelight.MOD_ID)
@Mod.EventBusSubscriber(modid = Seedsdelight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class SeedsdelightForge {

    @SubscribeEvent
    public static void onConstructMod(final FMLConstructModEvent evt) {
        ModConstructor.construct(Seedsdelight.MOD_ID, Seedsdelight::new);
    }

}
