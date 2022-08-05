package net.overtek.tekoutilities.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.overtek.tekoutilities.TekoUtilities;

public class ModItems {
    public static final DeferredRegister<Item> ITEM =
            DeferredRegister.create(ForgeRegistries.ITEMS, TekoUtilities.MOD_ID);

    public static final RegistryObject<Item> TEKO_INGOT = ITEM.register("teko_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tekoutilitiestab)));

    public static final RegistryObject<Item> TEKO_SCRAP = ITEM.register("teko_scrap",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tekoutilitiestab)));

    public static final RegistryObject<Item> TEKO_SWORD = ITEM.register("teko_sword",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tekoutilitiestab)));

    public static final RegistryObject<Item> TEKO_SWORD_PART = ITEM.register("teko_sword_part",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tekoutilitiestab)));

    public static final RegistryObject<Item> TEKO_PICKAXE = ITEM.register("teko_pickaxe",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tekoutilitiestab)));

    public static final RegistryObject<Item> TEKO_PICKAXE_PART = ITEM.register("teko_pickaxe_part",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tekoutilitiestab)));

    public static final RegistryObject<Item> TEKO_AXE = ITEM.register("teko_axe",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tekoutilitiestab)));

    public static final RegistryObject<Item> TEKO_AXE_PART = ITEM.register("teko_axe_part",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tekoutilitiestab)));

    public static final RegistryObject<Item> TEKO_SHOVEL = ITEM.register("teko_shovel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tekoutilitiestab)));

    public static final RegistryObject<Item> TEKO_SHOVEL_PART = ITEM.register("teko_shovel_part",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tekoutilitiestab)));

    public static final RegistryObject<Item> TEKO_HOE = ITEM.register("teko_hoe",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tekoutilitiestab)));

    public static final RegistryObject<Item> TEKO_HOE_PART = ITEM.register("teko_hoe_part",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tekoutilitiestab)));

    public static final RegistryObject<Item> OBSIDIAN_STICK = ITEM.register("obsidian_stick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tekoutilitiestab)));

    public static void register(IEventBus eventBus) {
        ITEM.register(eventBus);
    }
}
