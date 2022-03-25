package net.srkeng.advancedblocks.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.srkeng.advancedblocks.block.ModBlocks;

public class ModItemGroup {

    public static final ItemGroup ADVANCEDBLOCKS_GROUP = new ItemGroup("AdvancedBlocksTab") {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModBlocks.BLOCK_1.get());
        }
    };


}
