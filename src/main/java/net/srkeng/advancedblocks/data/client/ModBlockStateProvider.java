package net.srkeng.advancedblocks.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.srkeng.advancedblocks.AdvancedBlocks;
import net.srkeng.advancedblocks.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, AdvancedBlocks.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.BLOCK_1.get());
        simpleBlock(ModBlocks.BLOCK_2.get());
        simpleBlock(ModBlocks.BLOCK_3.get());
    }
}

