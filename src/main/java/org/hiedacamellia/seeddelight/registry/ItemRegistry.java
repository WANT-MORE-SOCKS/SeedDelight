package org.hiedacamellia.seeddelight.registry;

import com.google.common.collect.Sets;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.hiedacamellia.seeddelight.SeedDelight;
import org.hiedacamellia.seeddelight.item.FoodList;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SeedDelight.MODID);
    public static LinkedHashSet<DeferredItem<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();
    public static DeferredItem<Item> registerWithTab(final String name, final Supplier<Item> supplier) {
        DeferredItem<Item> block = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(block);
        return block;
    }
    public static Item.Properties basicItem() {
        return new Item.Properties();
    }
//Helper
    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties().food(food);
    }

    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16);
    }

    public static Item.Properties drinkItem() {
        return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
    }
//Registry
    public static final DeferredItem<Item> Acorn = registerWithTab("acorn",
            ()-> new ConsumableItem(basicItem()));
    public static final DeferredItem<Item> AcornKernel = registerWithTab("acorn_kernel",
            ()-> new ConsumableItem(foodItem(FoodList.AcornKernel.get())));
    public static final DeferredItem<Item> Pinecone = registerWithTab("pinecone",
            ()-> new ConsumableItem(basicItem()));
    public static final DeferredItem<Item> PineNutKernel = registerWithTab("pine_nut_kernel",
            ()-> new ConsumableItem(foodItem(FoodList.PineNutKernel.get())));
    public static final DeferredItem<Item> SunflowerSeed = registerWithTab("sunflower_seed",
            ()-> new ConsumableItem(basicItem()));
    public static final DeferredItem<Item> FriedSunflowerSeed = registerWithTab("fried_sunflower_seed",
            ()-> new ConsumableItem(foodItem(FoodList.FriedSunflowerSeed.get())));
    public static final DeferredItem<Item> DriedWatermelonSeed = registerWithTab("dried_watermelon_seed",
            ()-> new ConsumableItem(foodItem(FoodList.DriedWatermelonSeed.get())));
    public static final DeferredItem<Item> DriedPumpkinSeed = registerWithTab("dried_pumpkin_seed",
            ()-> new ConsumableItem(foodItem(FoodList.DriedPumpkinSeed.get())));
    public static final DeferredItem<Item> Rosehip = registerWithTab("rosehip",
            ()-> new ConsumableItem(foodItem(FoodList.Rosehip.get())));
    public static final DeferredItem<Item> Cherry = registerWithTab("cherry",
            ()-> new ConsumableItem(foodItem(FoodList.Cherry.get())));
    public static final DeferredItem<Item> RawAcornNoodle = registerWithTab("raw_acorn_noodle",
            ()-> new ConsumableItem(foodItem(FoodList.RawAcornNoodle.get())));
    public static final DeferredItem<Item> CherryJamJar = registerWithTab("cherry_jam_jar",
            ()-> new ConsumableItem(basicItem().craftRemainder(Items.GLASS_BOTTLE)));
    public static final DeferredItem<Item> RosehipJamJar = registerWithTab("rosehip_jam_jar",
            ()-> new ConsumableItem(basicItem().craftRemainder(Items.GLASS_BOTTLE)));
    public static final DeferredItem<Item> RosehipTea = registerWithTab("rosehip_tea",
            ()-> new DrinkableItem(drinkItem().food(FoodList.RosehipTea.get()), true, false));
    public static final DeferredItem<Item> CherryWine = registerWithTab("cherry_wine",
            ()-> new DrinkableItem(drinkItem().food(FoodList.CherryWine.get()), true, false));
    public static final DeferredItem<Item> PineNeedleWine = registerWithTab("pine_needle_wine",
            ()-> new DrinkableItem(drinkItem().food(FoodList.PineNeedleWine.get()), true, false));
    public static final DeferredItem<Item> RosehipJamSandwich = registerWithTab("rosehip_jam_sandwich",
            ()-> new ConsumableItem(foodItem(FoodList.RosehipJamSandwich.get())));
    public static final DeferredItem<Item> CherryJamSandwich = registerWithTab("cherry_jam_sandwich",
            ()-> new ConsumableItem(foodItem(FoodList.CherryJamSandwich.get())));
    public static final DeferredItem<Item> SunflowerSeedCrisp = registerWithTab("sunflower_seed_crisp",
            ()-> new ConsumableItem(foodItem(FoodList.SunflowerSeedCrisp.get())));
    public static final DeferredItem<Item> SunflowerSeedToast = registerWithTab("sunflower_seed_toast",
            ()-> new ConsumableItem(foodItem(FoodList.SunflowerSeedToast.get())));
    public static final DeferredItem<Item> SeedRosehipPie = registerWithTab("seed_rosehip_pie",
            ()-> new ConsumableItem(foodItem(FoodList.SeedRosehipPie.get())));
    public static final DeferredItem<Item> RoastedBeefWithSeed = registerWithTab("roasted_beef_with_seed",
            ()-> new ConsumableItem(bowlFoodItem(FoodList.RoastedBeefWithSeed.get())));
    public static final DeferredItem<Item> AcornTofu = registerWithTab("acorn_tofu",
            ()-> new ConsumableItem(foodItem(FoodList.AcornTofu.get())));
    public static final DeferredItem<Item> StirFriedCabbageWithAcorn = registerWithTab("stir_fried_cabbage_with_acorn",
            ()-> new ConsumableItem(bowlFoodItem(FoodList.StirFriedCabbageWithAcorn.get())));
    public static final DeferredItem<Item> AcornBread = registerWithTab("acorn_bread",
            ()-> new ConsumableItem(foodItem(FoodList.AcornBread.get())));
    public static final DeferredItem<Item> PinenutGruel = registerWithTab("pinenut_gruel",
            ()-> new ConsumableItem(foodItem(FoodList.PinenutGruel.get())));
    public static final DeferredItem<Item> PinenutCake = registerWithTab("pinenut_cake",
            ()-> new ConsumableItem(foodItem(FoodList.PinenutCake.get())));
    public static final DeferredItem<Item> SeedTart = registerWithTab("seed_tart",
            ()-> new ConsumableItem(foodItem(FoodList.SeedTart.get())));
    public static final DeferredItem<Item> PinenutWithMeatballs = registerWithTab("pinenut_with_meatballs",
            ()-> new ConsumableItem(bowlFoodItem(FoodList.PinenutWithMeatballs.get())));
    public static final DeferredItem<Item> RoseCookie = registerWithTab("rose_cookie",
            ()-> new ConsumableItem(foodItem(FoodList.RoseCookie.get())));
    public static final DeferredItem<Item> RosehipCake = registerWithTab("rosehip_cake",
            ()-> new ConsumableItem(foodItem(FoodList.RosehipCake.get())));
    public static final DeferredItem<Item> CherryIceCream = registerWithTab("cherry_ice_cream",
            ()-> new ConsumableItem(foodItem(FoodList.CherryIceCream.get())));
    public static final DeferredItem<Item> CherryPork = registerWithTab("cherry_pork",
            ()-> new ConsumableItem(bowlFoodItem(FoodList.CherryPork.get())));
    public static final DeferredItem<Item> MilkCherryMouss = registerWithTab("milk_cherry_mouss",
            ()-> new ConsumableItem(foodItem(FoodList.MilkCherryMouss.get())));
    public static final DeferredItem<Item> RosehipPie = registerWithTab("rosehip_pie",
            ()-> new BlockItem(BlockRegistry.RosehipPie.get(),basicItem()));
    public static final DeferredItem<Item> RosehipPieSlice = registerWithTab("rosehip_pie_slice",
            ()-> new ConsumableItem(foodItem(FoodList.RosehipPieSlice.get())));
    public static final DeferredItem<Item> AcornBag = registerWithTab("acorn_bag",
            ()-> new BlockItem(BlockRegistry.AcornBag.get(),basicItem()));
    public static final DeferredItem<Item> PineconeBag = registerWithTab("pinecone_bag",
            ()-> new BlockItem(BlockRegistry.PineconeBag.get(),basicItem()));
    public static final DeferredItem<Item> CherryCrate = registerWithTab("cherry_crate",
            ()-> new BlockItem(BlockRegistry.CherryCrate.get(),basicItem()));
    public static final DeferredItem<Item> RosehipCrate = registerWithTab("rosehip_crate",
            ()-> new BlockItem(BlockRegistry.RosehipCrate.get(),basicItem()));
}
