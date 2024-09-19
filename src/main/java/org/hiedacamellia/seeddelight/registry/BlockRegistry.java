package org.hiedacamellia.seeddelight.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.hiedacamellia.seeddelight.SeedDelight;
import vectorwing.farmersdelight.common.block.PieBlock;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SeedDelight.MODID);
    public static final RegistryObject<Block> RosehipPie = BLOCKS.register("rosehip_pie",
            () -> new PieBlock(Block.Properties.copy(Blocks.CAKE), ItemRegistry.RosehipPieSlice));
    public static final RegistryObject<Block> AcornBag = BLOCKS.register("acorn_bag",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PineconeBag = BLOCKS.register("pinecone_bag",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CherryCrate = BLOCKS.register("cherry_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RosehipCrate = BLOCKS.register("rosehip_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
}

