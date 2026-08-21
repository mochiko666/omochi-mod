package net.mochiko.omochimod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.mochiko.omochimod.OmochiMod;
import net.mochiko.omochimod.block.ModBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OmochiMod.MOD_ID);

    public static final DeferredItem<Item> OMOCHI = ITEMS.register("omochi",
            () -> new Item(new Item.Properties().food(ModFoods.OMOCHI)));
    public static final DeferredItem<Item> MOCHI_RICE_SEEDS = ITEMS.register("mochi_rice_seeds",
            () -> new ItemNameBlockItem(ModBlocks.MOCHI_RICE_CROP.get(), new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
