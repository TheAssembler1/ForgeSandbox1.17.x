package com.forgesandbox.common.objects.SlimeVariant.Elevator;

import com.forgesandbox.common.Register;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;

public class Elevator {
    private static String elevatorID = "elevator";

    public static void registerElevator(){
        final RegistryObject<Block> elevatorBlock = Register.getDefferedRegisterBLOCKS().register(elevatorID, () -> new ElevatorBlock());

        Register.getDefferedRegisterITEMS().register(elevatorID, () -> new ElevatorBlockItem(elevatorBlock));
    }
}
