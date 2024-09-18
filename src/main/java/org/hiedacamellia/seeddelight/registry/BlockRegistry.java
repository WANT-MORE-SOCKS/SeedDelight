package org.hiedacamellia.seeddelight.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.hiedacamellia.seeddelight.SeedDelight;
import vectorwing.farmersdelight.common.block.PieBlock;

public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SeedDelight.MODID);
    public static final DeferredBlock<Block> RosehipPie = BLOCKS.register("rosehip_pie",
            () -> new PieBlock(Block.Properties.ofFullCopy(Blocks.CAKE), ItemRegistry.RosehipPieSlice));
    public static final DeferredBlock<Block> AcornBag = BLOCKS.register("acorn_bag",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> PineconeBag = BLOCKS.register("pinecone_bag",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CherryCrate = BLOCKS.register("cherry_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> RosehipCrate = BLOCKS.register("rosehip_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
}

