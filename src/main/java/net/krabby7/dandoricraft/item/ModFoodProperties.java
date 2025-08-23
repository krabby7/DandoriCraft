package net.krabby7.dandoricraft.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties RAW_BULBORB_CHOP = new FoodProperties.Builder()
            .nutrition(2).saturationModifier(0.3f).build();


    public static final FoodProperties COOKED_BULBORB_CHOP = new FoodProperties.Builder()
            .nutrition(7).saturationModifier(0.7f).build();

    public static final FoodProperties AMPCORN = new FoodProperties.Builder()
            .nutrition(3).saturationModifier(0.4f).build();

}
