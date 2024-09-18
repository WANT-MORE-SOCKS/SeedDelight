package org.hiedacamellia.seeddelight.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.hiedacamellia.seeddelight.SeedDelight;

public class CreativeModeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SeedDelight.MODID);
    public static final RegistryObject<CreativeModeTab> TAB_SEED_DELIGHT = CREATIVE_MODE_TABS.register(SeedDelight.MODID,
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item_group.seeddelight.seed_delight_table"))
                    .icon(() -> new ItemStack(ItemRegistry.Acorn.get()))
                    .displayItems((parameters, output) -> ItemRegistry.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept(item.get())))
                    .build());
}
