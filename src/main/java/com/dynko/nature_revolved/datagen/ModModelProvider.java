package com.dynko.nature_revolved.datagen;

import com.dynko.nature_revolved.NatureRevolved;
import com.dynko.nature_revolved.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, NatureRevolved.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.PERMIAN_FOSSIL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CRETACEOUS_FOSSIL.get(), ModelTemplates.FLAT_ITEM);

    }
}
