package com.dynko.nature_revolved.item;

import com.dynko.nature_revolved.NatureRevolved;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NatureRevolved.MOD_ID);

    public static final DeferredItem<Item> PERMIAN_FOSSIL = ITEMS.registerSimpleItem("permian_fossil");
    public static final DeferredItem<Item> CRETACEOUS_FOSSIL = ITEMS.registerSimpleItem("cretaceous_fossil");


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
