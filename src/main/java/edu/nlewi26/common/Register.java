package edu.nlewi26.common;

import edu.nlewi26.common.objects.SlimeVariant.SlimeVariantBlock;
import edu.nlewi26.common.objects.SlimeVariant.SlimeVariantBlockItem;
import edu.nlewi26.core.Entry;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Register {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Entry.getMOD_ID());
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Entry.getMOD_ID());

    //NOTE::Slime block variant 1
    private static RegistryObject<Block> slimeVarientBlock1 = BLOCKS.register(SlimeVariantBlock.slimeIDS[0], 
                                                                              () -> new SlimeVariantBlock(0));
    private static RegistryObject<Item>  slimeVarientItem1 = ITEMS.register(SlimeVariantBlockItem.slimeIDS[0], 
                                                                            () -> new SlimeVariantBlockItem(slimeVarientBlock1));

    //NOTE::Slime block varient2
    private static RegistryObject<Block> slimeVarientBlock2 = BLOCKS.register(SlimeVariantBlock.slimeIDS[1], 
                                                                              () -> new SlimeVariantBlock(1));
    private static RegistryObject<Item>  slimeVarientItem2 = ITEMS.register(SlimeVariantBlockItem.slimeIDS[1], 
                                                                            () -> new SlimeVariantBlockItem(slimeVarientBlock2)); 

    //NOTE::Slime block variant3
    private static RegistryObject<Block> slimeVarientBlock3 = BLOCKS.register(SlimeVariantBlock.slimeIDS[2],
                                                                              () -> new SlimeVariantBlock(2));
    private static RegistryObject<Item>  slimeVarientItem3 = ITEMS.register(SlimeVariantBlockItem.slimeIDS[2], 
                                                                            () -> new SlimeVariantBlockItem(slimeVarientBlock3));
                                                                            
    public static void registerRegistries(){    
        //NOTE::Registering the registries
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
