package com.forgesandbox.common.objects.SlimeVariant.Elevator;

import static net.minecraft.world.item.CreativeModeTab.TAB_MISC;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;

public class ElevatorBlockItem extends BlockItem{
    public ElevatorBlockItem(RegistryObject<Block> elevatorBlock) {
        super(elevatorBlock.get(), new Properties().tab(TAB_MISC));
    }
}
