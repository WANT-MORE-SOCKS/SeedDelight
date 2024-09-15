package org.hiedacamellia.seedsdelight.core;

import fuzs.puzzleslib.api.init.v2.RegistryManager;
import fuzs.puzzleslib.api.init.v2.RegistryReference;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import org.hiedacamellia.seedsdelight.Seedsdelight;
import org.jetbrains.annotations.NotNull;

public class ModRegistry {

    private static final RegistryManager REGISTRY = RegistryManager.instant(Seedsdelight.MOD_ID);

    public static final RegistryReference<Item> ACORN_BREAD = REGISTRY.registerItem("acorn_bread", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.5F).build())));
    public static final RegistryReference<Item> ACORN_KERNEL = REGISTRY.registerItem("acorn_kernel", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1F).build())));
    public static final RegistryReference<Item> ACORN_TOFU = REGISTRY.registerItem("acorn_tofu", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).build())));
    public static final RegistryReference<Item> ACORN = REGISTRY.registerItem("acorn", () -> new Item(new Item.Properties()));
    public static final RegistryReference<Item> CHERRY_ICE_CREAM = REGISTRY.registerItem("cherry_ice_cream", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.8F).build())){
        @Override
        public @NotNull ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
            super.finishUsingItem(stack, level, entity);
            if (entity instanceof Player player) {
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 0));
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 0));
            }
            return Items.BOWL.getDefaultInstance();
        }
    });
    public static final RegistryReference<Item> CHERRY_JAM_JAR = REGISTRY.registerItem("cherry_jam_jar", () -> new Item(new Item.Properties()));
    public static final RegistryReference<Item> CHERRY_JAM_SANDWICH = REGISTRY.registerItem("cherry_jam_sandwich", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(0.6F).build())){
        @Override
        public @NotNull ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
            if (entity instanceof Player player) {
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1800, 0));
            }
            return super.finishUsingItem(stack, level, entity);
        }
    });
    public static final RegistryReference<Item> CHERRY_PORK = REGISTRY.registerItem("cherry_pork", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(0.8F).build())));
    public static final RegistryReference<Item> CHERRY_WINE = REGISTRY.registerItem("cherry_wine", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).saturationMod(0.0F).build())){
        @Override
        public @NotNull ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
            super.finishUsingItem(stack, level, entity);
            if (entity instanceof Player player) {
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1800, 0));
            }
            return Items.GLASS_BOTTLE.getDefaultInstance();
        }
        @Override
        public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
            return UseAnim.DRINK;
        }
    });
    public static final RegistryReference<Item> CHERRY = REGISTRY.registerItem("cherry", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.5F).build())));
    public static final RegistryReference<Item> DRIED_PUMPKIN_SEED = REGISTRY.registerItem("dried_pumpkin_seed", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).build())));
    public static final RegistryReference<Item> DRIED_WATERMELON_SEED = REGISTRY.registerItem("dried_watermelon_seed", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).build())));
    public static final RegistryReference<Item> FRIED_SUNFLOWER_SEED = REGISTRY.registerItem("fried_sunflower_seed", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).build())));
    public static final RegistryReference<Item> MILK_CHERRY_MOUSS = REGISTRY.registerItem("milk_cherry_mouss", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.6F).build())));
    public static final RegistryReference<Item> PINE_NEEDLE_WINE = REGISTRY.registerItem("pine_needle_wine", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).saturationMod(0.0F).build())){
        @Override
        public @NotNull ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
            super.finishUsingItem(stack, level, entity);
            if (entity instanceof Player player) {
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 0));
            }
            return Items.GLASS_BOTTLE.getDefaultInstance();
        }
    });
    public static final RegistryReference<Item> PINE_NUT_KERNEL = REGISTRY.registerItem("pine_nut_kernel", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1F).build())));
    public static final RegistryReference<Item> PINECONE = REGISTRY.registerItem("pinecone", () -> new Item(new Item.Properties()));
    public static final RegistryReference<Item> PINENUT_CAKE = REGISTRY.registerItem("pinenut_cake", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.6F).build())));
    public static final RegistryReference<Item> PINENUT_GRUEL = REGISTRY.registerItem("pinenut_gruel", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(0.5F).build())));
    public static final RegistryReference<Item> PINENUT_WITH_MEATBALLS = REGISTRY.registerItem("pinenut_with_meatballs", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(0.8F).build())){
        @Override
        public @NotNull ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
            super.finishUsingItem(stack, level, entity);
            return Items.BOWL.getDefaultInstance();
        }
    });
    public static final RegistryReference<Item> RAW_ACORN_NOODLE = REGISTRY.registerItem("raw_acorn_noodle", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).build())));
    public static final RegistryReference<Item> ROASTED_BEEF_WITH_SEED = REGISTRY.registerItem("roasted_beef_with_seed", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(0.6F).build())){
        @Override
        public @NotNull ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
            super.finishUsingItem(stack, level, entity);
            return Items.BOWL.getDefaultInstance();
        }
    });
    public static final RegistryReference<Item> ROSE_COOKIE = REGISTRY.registerItem("rose_cookie", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.6F).build())));
    public static final RegistryReference<Item> ROSEHIP_CAKE = REGISTRY.registerItem("rosehip_cake", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).build())));
    public static final RegistryReference<Item> ROSEHIP_JAM_JAR = REGISTRY.registerItem("rosehip_jam_jar", () -> new Item(new Item.Properties()));
    public static final RegistryReference<Item> ROSEHIP_JAM_SANDWICH = REGISTRY.registerItem("rosehip_jam_sandwich", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(0.6F).build())){
        @Override
        public @NotNull ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
            if (entity instanceof Player player) {
                player.addEffect(new MobEffectInstance(MobEffects.HEAL, 200, 0));
            }
            return super.finishUsingItem(stack, level, entity);
        }
    });
    public static final RegistryReference<Item> ROSEHIP_PIE_SLICE = REGISTRY.registerItem("rosehip_pie_slice", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.6F).build())));
    public static final RegistryReference<Item> ROSEHIP_TEA = REGISTRY.registerItem("rosehip_tea", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.5F).build())){
        @Override
        public @NotNull ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
            super.finishUsingItem(stack, level, entity);
            if (entity instanceof Player player) {
                player.addEffect(new MobEffectInstance(MobEffects.HEAL, 200, 0));
            }
            return Items.GLASS_BOTTLE.getDefaultInstance();
        }
    });
    public static final RegistryReference<Item> ROSEHIP = REGISTRY.registerItem("rosehip", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.5F).build())));
    public static final RegistryReference<Item> SEED_ROSEHIP_PIE = REGISTRY.registerItem("seed_rosehip_pie", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.5F).build())){
        @Override
        public @NotNull ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
            if (entity instanceof Player player) {
                player.addEffect(new MobEffectInstance(MobEffects.HEAL, 100, 0));
            }
            return super.finishUsingItem(stack, level, entity);
        }
    });
    public static final RegistryReference<Item> SEED_TART = REGISTRY.registerItem("seed_tart", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).build())));
    public static final RegistryReference<Item> STIR_FRIED_CABBAGE_WITH_ACORN = REGISTRY.registerItem("stir_fried_cabbage_with_acorn", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(0.7F).build())){
        @Override
        public @NotNull ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
            super.finishUsingItem(stack, level, entity);
            return Items.BOWL.getDefaultInstance();
        }
    });
    public static final RegistryReference<Item> SUNFLOWER_SEED_CRISP = REGISTRY.registerItem("sunflower_seed_crisp", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.8F).build())));
    public static final RegistryReference<Item> SUNFLOWER_SEED_TOAST = REGISTRY.registerItem("sunflower_seed_toast", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).build())));
    public static final RegistryReference<Item> SUNFLOWER_SEED = REGISTRY.registerItem("sunflower_seed", () -> new Item(new Item.Properties()));

    public static final RegistryReference<Block> ACORN_BAG_BLOCK = REGISTRY.registerBlock("acorn_bag", () -> new Block(Block.Properties.of().sound(SoundType.WOOL)));
    public static final RegistryReference<Block> CHERRY_CRATE_BLOCK = REGISTRY.registerBlock("cherry_crate", () -> new Block(Block.Properties.of().sound(SoundType.WOOL)));
    public static final RegistryReference<Block> ROSEHIP_CRATE_BLOCK = REGISTRY.registerBlock("rosehip_crate", () -> new Block(Block.Properties.of().sound(SoundType.WOOL)));
    public static final RegistryReference<Block> PINECONE_BAG_BLOCK = REGISTRY.registerBlock("pinecone_bag", () -> new Block(Block.Properties.of().sound(SoundType.WOOL)));
    public static final RegistryReference<Block> ROSEHIP_PIE_BLOCK = REGISTRY.registerBlock("rosehip_pie", () -> new PieBlock(Block.Properties.of().noOcclusion().sound(SoundType.WOOL),ROSEHIP_PIE_SLICE));

    public static final RegistryReference<Item> ACORN_BAG  = REGISTRY.registerBlockItem(ACORN_BAG_BLOCK);
    public static final RegistryReference<Item> CHERRY_CRATE  = REGISTRY.registerBlockItem(CHERRY_CRATE_BLOCK);
    public static final RegistryReference<Item> ROSEHIP_CRATE = REGISTRY.registerBlockItem(ROSEHIP_CRATE_BLOCK);
    public static final RegistryReference<Item> PINECONE_BAG = REGISTRY.registerBlockItem(PINECONE_BAG_BLOCK);
    public static final RegistryReference<Item> ROSEHIP_PIE = REGISTRY.registerBlockItem(ROSEHIP_PIE_BLOCK);



    public static void touch() {

    }


}
