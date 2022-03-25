package net.srkeng.advancedblocks.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.srkeng.advancedblocks.AdvancedBlocks;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, AdvancedBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("block_1", modLoc("block/block_1"));
        withExistingParent("block_2", modLoc("block/block_2"));

    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}