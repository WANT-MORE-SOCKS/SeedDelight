package org.hiedacamellia.seeddelight.block;

import net.minecraft.world.item.Item;
import vectorwing.farmersdelight.common.block.PieBlock;

import java.util.function.Supplier;
//虽然没用，但是加上好看（bus
public class RosehipPieBlock extends PieBlock {
    public RosehipPieBlock(Properties properties, Supplier<Item> pieSlice) {
        super(properties, pieSlice);
    }
}
