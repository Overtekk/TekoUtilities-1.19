package net.overtek.tekoutilities.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.overtek.tekoutilities.TekoUtilities;

public class ModItems {
    public static final DeferredRegister<Item> ITEM =
            DeferredRegister.create(ForgeRegistries.ITEMS, TekoUtilities.MOD_ID);
// Teko Ingot and Scrap
    public static final RegistryObject<Item> TEKO_INGOT = ITEM.register("teko_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB)));
    public static final RegistryObject<Item> TEKO_SCRAP = ITEM.register("teko_scrap",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB)));
// Teko Tools
    public static final RegistryObject<Item> TEKO_SWORD = ITEM.register("teko_sword",
            () -> new SwordItem(ModTiers.TEKO, 3, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB)));
    public static final RegistryObject<Item> TEKO_PICKAXE = ITEM.register("teko_pickaxe",
            () -> new PickaxeItem(ModTiers.TEKO, 1, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB)));
    public static final RegistryObject<Item> TEKO_AXE = ITEM.register("teko_axe",
            () -> new AxeItem(ModTiers.TEKO, 4.5f, -3,
                    new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB)));
    public static final RegistryObject<Item> TEKO_SHOVEL = ITEM.register("teko_shovel",
            () -> new ShovelItem(ModTiers.TEKO, 1.5f, -3,
                    new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB)));
    public static final RegistryObject<Item> TEKO_HOE = ITEM.register("teko_hoe",
            () -> new HoeItem(ModTiers.TEKO, -5, 0,
                    new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB)));
// Teko Tools Part
    public static final RegistryObject<Item> TEKO_SWORD_PART = ITEM.register("teko_sword_part",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB)));
    public static final RegistryObject<Item> TEKO_PICKAXE_PART = ITEM.register("teko_pickaxe_part",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB)));
    public static final RegistryObject<Item> TEKO_AXE_PART = ITEM.register("teko_axe_part",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB)));
    public static final RegistryObject<Item> TEKO_SHOVEL_PART = ITEM.register("teko_shovel_part",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB)));
    public static final RegistryObject<Item> TEKO_HOE_PART = ITEM.register("teko_hoe_part",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB)));
// ARMOR
    // TEKO ARMOR
public static final RegistryObject<Item> TEKO_HELMET = ITEM.register("teko_helmet",
        () -> new ArmorItem(ModArmorMaterials.TEKO, EquipmentSlot.HEAD,
                new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB)));
public static final RegistryObject<Item> TEKO_CHESTPLATE = ITEM.register("teko_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TEKO, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB)));
public static final RegistryObject<Item> TEKO_LEGGINGS = ITEM.register("teko_leggings",
            () -> new ArmorItem(ModArmorMaterials.TEKO, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB)));
public static final RegistryObject<Item> TEKO_BOOTS = ITEM.register("teko_boots",
            () -> new ArmorItem(ModArmorMaterials.TEKO, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB)));
// MATERIALS
    public static final RegistryObject<Item> OBSIDIAN_STICK = ITEM.register("obsidian_stick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB)));
// FOODS
    public static final RegistryObject<Item> CHOCOLATE = ITEM.register("chocolate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB).food(ModFoods.CHOCOLATE)));
    public static final RegistryObject<Item> CHOCOLATE_GLASS = ITEM.register("chocolate_glass",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB).food(ModFoods.CHOCOLATE_GLASS)));
    public static final RegistryObject<Item> HOT_CHOCOLATE = ITEM.register("hot_chocolate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB).food(ModFoods.HOT_CHOCOLATE)));
    public static final RegistryObject<Item> MILK_GLASS = ITEM.register("milk_glass",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB).food(ModFoods.MILK_GLASS)));
    public static final RegistryObject<Item> HOT_MILK = ITEM.register("hot_milk",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEKOUTILITIES_TAB).food(ModFoods.HOT_MILK)));

    public static void register(IEventBus eventBus) {
        ITEM.register(eventBus);
    }
}
