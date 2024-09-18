package org.hiedacamellia.seeddelight.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public enum FoodList {
    AcornKernel(new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.1F)
            .build()),
    PineNutKernel(new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.1F)
            .build()),
    FriedSunflowerSeed(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.1F)
            .build()),
    DriedWatermelonSeed(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.1F)
            .build()),
    DriedPumpkinSeed(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.1F)
            .build()),
    Rosehip(new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.5F)
            .build()),
    Cherry(new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.5F)
            .build()),
    RawAcornNoodle(new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.6F)
            .build()),
    RosehipTea(new FoodProperties.Builder()
            .nutrition(0)
            .saturationModifier(0.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 1)
            .alwaysEdible()
            .build()),
    CherryWine(new FoodProperties.Builder()
            .nutrition(0)
            .saturationModifier(0.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1800, 0), 1)
            .alwaysEdible()
            .build()),
    PineNeedleWine(new FoodProperties.Builder()
            .nutrition(0)
            .saturationModifier(0.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 0), 1)
            .alwaysEdible()
            .build()),
    RosehipJamSandwich(new FoodProperties.Builder()
            .nutrition(7)
            .saturationModifier(0.6F)
            .build()),
    CherryJamSandwich(new FoodProperties.Builder()
            .nutrition(7)
            .saturationModifier(0.6F)
            .build()),
    SunflowerSeedCrisp(new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.8F)
            .build()),
    SunflowerSeedToast(new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.6F)
            .build()),
    SeedRosehipPie(new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.5F)
            .build()),
    RoastedBeefWithSeed(new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(0.6F)
            .build()),
    AcornTofu(new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.6F)
            .build()),
    StirFriedCabbageWithAcorn(new FoodProperties.Builder()
            .nutrition(7)
            .saturationModifier(0.6F)
            .build()),
    AcornBread(new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.5F)
            .build()),
    PinenutGruel(new FoodProperties.Builder()
            .nutrition(7)
            .saturationModifier(0.6F)
            .build()),
    PinenutCake(new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.6F)
            .build()),
    SeedTart(new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.6F)
            .build()),
    PinenutWithMeatballs(new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(0.8F)
            .build()),
    RoseCookie(new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.6F)
            .build()),
    RosehipCake(new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.6F)
            .build()),
    CherryIceCream(new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 0), 1)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 0), 1)
            .build()),
    CherryPork(new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(0.8F)
            .build()),
    MilkCherryMouss(new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.6F)
            .build()),
    RosehipPieSlice(new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.2F)
            .build());

    private final FoodProperties properties;

    FoodList(FoodProperties properties) {
        this.properties = properties;
    }

    public FoodProperties get() {
        return properties;
    }
}