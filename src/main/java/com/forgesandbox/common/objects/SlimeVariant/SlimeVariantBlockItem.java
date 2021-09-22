package com.forgesandbox.common.objects.SlimeVariant;

import static net.minecraft.world.item.CreativeModeTab.TAB_MISC;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;

public class SlimeVariantBlockItem extends BlockItem{
    public static final String[] slimeIDS = {"slimevariantitem1", "slimevariantitem2", "slimevariantitem3"};

    public SlimeVariantBlockItem(RegistryObject<Block> slimeVariantBlock) {
        super(slimeVariantBlock.get(), new Properties().tab(TAB_MISC));
    }
}
