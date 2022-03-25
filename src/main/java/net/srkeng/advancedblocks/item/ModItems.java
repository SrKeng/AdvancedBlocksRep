package net.srkeng.advancedblocks.item;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.srkeng.advancedblocks.AdvancedBlocks;

public class ModItems {


    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, AdvancedBlocks.MOD_ID);



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}



