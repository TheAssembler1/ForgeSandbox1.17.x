package com.forgesandbox.common.Elevator;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.fmllegacy.RegistryObject;


public class ElevatorBlockItem extends BlockItem{
    public ElevatorBlockItem(RegistryObject<Block> block) {
        super(block.get(), new Properties().tab(CreativeModeTab.TAB_MISC));
    }
}
