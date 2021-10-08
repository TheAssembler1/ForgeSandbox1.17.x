package com.forgesandbox.common;

import com.forgesandbox.common.Elevator.Elevator;
import com.forgesandbox.common.objects.SlimeVariant.SlimeVariant;
import com.forgesandbox.core.Entry;

import io.netty.handler.codec.http.websocketx.extensions.compression.DeflateFrameClientExtensionHandshaker;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Register {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Entry.getMOD_ID());
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Entry.getMOD_ID());
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Entry.getMOD_ID());
                                                                            
    public static void registerRegistries(){    
        //NOTE::Registering slime variant blocks/items
        SlimeVariant.registerSlimeVariants();
        //NOTE::Registering elevator block/item
        Elevator.registerElevator();

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCK_ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static DeferredRegister<Item> getDefferedRegisterITEMS(){
        return ITEMS;
    }

    public static DeferredRegister<Block> getDefferedRegisterBLOCKS(){
        return BLOCKS;
    }

    public static DeferredRegister<BlockEntityType<?>> getDefferedRegisterBLOCK_ENTITY_TYPES(){
        return BLOCK_ENTITY_TYPES;
    }
}
