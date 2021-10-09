package com.forgesandbox.common.Elevator;

import com.forgesandbox.core.Entry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class ElevatorBlockEntity extends BlockEntity{
    public ElevatorBlockEntity(BlockPos blockPos, BlockState blockState) {
        //FIXME::
        /*
        NOTE::Getting a crash when running code at this point,
              might be because we are passsing null as first arg 
              here?
        */
        super(Elevator.getElevatorBlockType(), blockPos, blockState);
        //super(null, blockPos, blockState);
    }
}
