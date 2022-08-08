package net.overtek.tekoutilities.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static  final ForgeTier TEKO = new ForgeTier(5, 2561, 10.0f, 5.0f,
            15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.TEKO_INGOT.get()));
}
