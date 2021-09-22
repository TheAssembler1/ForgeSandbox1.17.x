package com.forgesandbox.common;

import com.forgesandbox.common.Elevator.Elevator;
import com.forgesandbox.common.objects.SlimeVariant.SlimeVariant;
import com.forgesandbox.core.Entry;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Register {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Entry.getMOD_ID());
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Entry.getMOD_ID());
                                                                            
    public static void registerRegistries(){    
        //NOTE::Registering slime variant blocks/items
        SlimeVariant.registerSlimeVariants();
        //NOTE::Registering elevator block/item
        //Elevator.registerElevator();

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static DeferredRegister<Item> getDefferedRegisterITEMS(){
        return ITEMS;
    }

    public static DeferredRegister<Block> getDefferedRegisterBLOCKS(){
        return BLOCKS;
    }
}
