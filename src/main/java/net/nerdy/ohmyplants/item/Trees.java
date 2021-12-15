package net.nerdy.ohmyplants.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nerdy.ohmyplants.OhMyPlants;

public class Trees {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OhMyPlants.MOD_ID);

    public static final RegistryObject<Item> APPLE_TREE_SAPLING = ITEMS.register("apple_tree_sapling",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> LIME_TREE_SAPLING = ITEMS.register("lime_tree_sapling",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> PEACH_TREE_SAPLING = ITEMS.register("peach_tree_sapling",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> PLUM_TREE_SAPLING = ITEMS.register("plum_tree_sapling",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DATE_TREE_SAPLING = ITEMS.register("date_tree_sapling",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
