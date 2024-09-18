package org.hiedacamellia.seeddelight.registry;

import io.github.fabricators_of_create.porting_lib.util.DeferredRegister;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.hiedacamellia.seeddelight.SeedDelight;

import java.util.function.Supplier;

public class CreativeModeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SeedDelight.MODID);
    public static final Supplier<CreativeModeTab> TAB_SEED_DELIGHT = CREATIVE_MODE_TABS.register(SeedDelight.MODID,
            () -> FabricItemGroup.builder()
                    .title(Component.translatable("item_group.seeddelight.seed_delight_table"))
                    .icon(() -> new ItemStack(ItemRegistry.Acorn.get()))
                    .displayItems((parameters, output) -> ItemRegistry.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept(item.get())))
                    .build());
}
