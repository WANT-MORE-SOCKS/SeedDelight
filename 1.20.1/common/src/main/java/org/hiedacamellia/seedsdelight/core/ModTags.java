package org.hiedacamellia.seedsdelight.core;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public final class ModTags {

    public static final TagKey<Item> KNIVES = modItemTag("tools/knives");

    public ModTags() {
    }

    private static TagKey<Item> modItemTag(String path) {
        return TagKey.create(Registries.ITEM,new ResourceLocation("farmersdelight", path));
    }

}
