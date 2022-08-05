package net.overtek.tekoutilities.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.overtek.tekoutilities.TekoUtilities;
import net.overtek.tekoutilities.item.ModCreativeModeTab;
import net.overtek.tekoutilities.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TekoUtilities.MOD_ID);

    public static final RegistryObject<Block> TEKO_BLOCK = registerBlock("teko_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(18f).requiresCorrectToolForDrops()), ModCreativeModeTab.tekoutilitiestab);

    public static final RegistryObject<Block> TEKO_ORE = registerBlock("teko_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(40f).requiresCorrectToolForDrops()), ModCreativeModeTab.tekoutilitiestab);

    public static final RegistryObject<Block> DEEPSLATE_TEKO_ORE = registerBlock("deepslate_teko_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(45f).requiresCorrectToolForDrops()), ModCreativeModeTab.tekoutilitiestab);


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {

        return ModItems.ITEM.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
