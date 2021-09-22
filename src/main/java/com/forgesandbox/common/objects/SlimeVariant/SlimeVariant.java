package com.forgesandbox.common.objects.SlimeVariant;

import com.forgesandbox.common.Register;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;

public class SlimeVariant {
    public static void registerSlimeVariantBlocks(){    
        //NOTE::Creating the three variants of the slime blocks
        final RegistryObject<Block> slimeVarientBlock1 = Register.getDefferedRegisterBLOCKS().register(SlimeVariantBlock.slimeIDS[0], 
                                                                                                       () -> new SlimeVariantBlock(0));
        final RegistryObject<Block> slimeVarientBlock2 = Register.getDefferedRegisterBLOCKS().register(SlimeVariantBlock.slimeIDS[1], 
                                                                                                       () -> new SlimeVariantBlock(1));
        final RegistryObject<Block> slimeVarientBlock3 = Register.getDefferedRegisterBLOCKS().register(SlimeVariantBlock.slimeIDS[2],
                                                                                                       () -> new SlimeVariantBlock(2));

        //NOTE::Adding the items to the registry
        Register.getDefferedRegisterITEMS().register(SlimeVariantBlockItem.slimeIDS[0], 
                                                     () -> new SlimeVariantBlockItem(slimeVarientBlock1));
        Register.getDefferedRegisterITEMS().register(SlimeVariantBlockItem.slimeIDS[1], 
                                                     () -> new SlimeVariantBlockItem(slimeVarientBlock2)); 
        Register.getDefferedRegisterITEMS().register(SlimeVariantBlockItem.slimeIDS[2], 
                                                     () -> new SlimeVariantBlockItem(slimeVarientBlock3));
    }                                                                         
}
