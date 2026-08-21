package net.mochiko.omochimod.datagen;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.mochiko.omochimod.block.ModBlocks;
import net.mochiko.omochimod.block.custom.MochiRiceBlock;
import net.mochiko.omochimod.item.ModItems;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.STONE_MORTAR.get());

        LootItemCondition.Builder lootItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.MOCHI_RICE_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(MochiRiceBlock.AGE, 7));


        this.add(ModBlocks.MOCHI_RICE_CROP.get(), this.createCropDrops(ModBlocks.MOCHI_RICE_CROP.get(),
                ModItems.MOCHI_RICE_SEEDS.get(), ModItems.MOCHI_RICE_SEEDS.get(), lootItemConditionBuilder));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
