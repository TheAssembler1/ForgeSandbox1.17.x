package com.forgesandbox.common.Elevator;

import com.forgesandbox.common.Register;
import com.forgesandbox.core.Entry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraft.world.level.block.state.BlockState;

public class Elevator{
    private static String elevatorID = "elevator";

    //NOTE::This funcitons is used for the elevatorBlockEntityConstrucotr to set its first super's params.
    private static BlockEntityType<?> elevatorBlockEntityType = null;

    public static void registerElevator(){
        final RegistryObject<Block> elevatorBlock = Register.getDefferedRegisterBLOCKS().register(elevatorID, ElevatorBlock::new);
        
        elevatorBlockEntityType = BlockEntityType.Builder.of(ElevatorBlockEntity::new, elevatorBlock.get()).build(null);

        if(elevatorBlockEntityType == null)
            Entry.LOGGER.info("ERROR::elevatorBlockEntityType was null");

        Register.getDefferedRegisterBLOCK_ENTITY_TYPES().register(elevatorID, () -> elevatorBlockEntityType);
        Register.getDefferedRegisterITEMS().register(elevatorID, () -> new ElevatorBlockItem(elevatorBlock));
    }

    //NOTE::This funcitons is used for the elevatorBlockEntityConstrucotr to set its first super's params.
    public static BlockEntityType<?> getElevatorBlockType(){
        return elevatorBlockEntityType;
    }
}
