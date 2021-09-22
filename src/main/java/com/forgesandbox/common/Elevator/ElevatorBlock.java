package com.forgesandbox.common.Elevator;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import java.lang.Object;
import net.minecraft.world.level.block.ChestBlock;

public class ElevatorBlock extends Block{
    public ElevatorBlock() {
        super(Properties.of(Material.SPONGE));
    }

    public boolean hasTileEntity(BlockState blockState){
        return true;
    }
}
