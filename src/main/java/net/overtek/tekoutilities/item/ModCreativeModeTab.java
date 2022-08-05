package net.overtek.tekoutilities.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab tekoutilitiestab = new CreativeModeTab("tekoutilitiestab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TEKO_INGOT.get());
        }
    };
}
