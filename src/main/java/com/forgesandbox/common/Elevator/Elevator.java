package com.forgesandbox.common.Elevator;

import com.forgesandbox.common.Register;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraft.world.level.block.state.BlockState;

public class Elevator{
    private static String elevatorID = "elevator";

    public static void registerElevator(){
        final RegistryObject<Block> elevatorBlock = Register.getDefferedRegisterBLOCKS().register(elevatorID, () -> new ElevatorBlock());
        
        Register.getDefferedRegisterBLOCK_ENTITY_TYPES().register(elevatorID, 
        () -> BlockEntityType.Builder.of(ElevatorBlockEntity::new, elevatorBlock.get()).build(null));
        Register.getDefferedRegisterITEMS().register(elevatorID, () -> new ElevatorBlockItem(elevatorBlock));
    }
}
