package edu.nlewi26.common.objects.SlimeVariant;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;

public class SlimeVariantBlockItem extends BlockItem{
    public static final String[] slimeIDS = {"slimevariantitem1", "slimevariantitem2", "slimevariantitem3"};

    public SlimeVariantBlockItem(RegistryObject<Block> slimeVariantBlock) {
        super(slimeVariantBlock.get(), new Properties().tab(CreativeModeTab.TAB_MISC));
    }
}
