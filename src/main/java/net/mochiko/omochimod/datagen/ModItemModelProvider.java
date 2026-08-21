package net.mochiko.omochimod.datagen;

import net.minecraft.data.PackOutput;
import net.mochiko.omochimod.OmochiMod;
import net.mochiko.omochimod.item.ModItems;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, OmochiMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.OMOCHI.get());
        basicItem(ModItems.MOCHI_RICE_SEEDS.get());
    }
}
