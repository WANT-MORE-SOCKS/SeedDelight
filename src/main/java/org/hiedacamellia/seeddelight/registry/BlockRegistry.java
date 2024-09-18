package org.hiedacamellia.seeddelight.registry;

import io.github.fabricators_of_create.porting_lib.util.DeferredRegister;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import java.util.function.Supplier;
import org.hiedacamellia.seeddelight.SeedDelight;
import vectorwing.farmersdelight.common.block.PieBlock;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.createBlocks(SeedDelight.MODID);
    public static final Supplier<Block> RosehipPie = BLOCKS.register("rosehip_pie",
            () -> new PieBlock(Block.Properties.ofFullCopy(Blocks.CAKE), ItemRegistry.RosehipPieSlice));
    public static final Supplier<Block> AcornBag = BLOCKS.register("acorn_bag",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> PineconeBag = BLOCKS.register("pinecone_bag",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> CherryCrate = BLOCKS.register("cherry_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> RosehipCrate = BLOCKS.register("rosehip_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
}

