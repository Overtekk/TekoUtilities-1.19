package net.overtek.tekoutilities.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CHOCOLATE = (new FoodProperties.Builder())
            .nutrition(1).saturationMod(0.6F)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 200, 0), 1.0F).meat().build();
    public static final FoodProperties CHOCOLATE_GLASS = (new FoodProperties.Builder())
            .nutrition(2).saturationMod(0.2F).build();
    public static final FoodProperties HOT_CHOCOLATE = (new FoodProperties.Builder())
            .nutrition(5).saturationMod(0.8F).build();
    public static final FoodProperties MILK_GLASS = (new FoodProperties.Builder())
            .nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties HOT_MILK = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.5F).build();
}
