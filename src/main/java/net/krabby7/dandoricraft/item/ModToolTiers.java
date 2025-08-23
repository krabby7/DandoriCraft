package net.krabby7.dandoricraft.item;

import net.krabby7.dandoricraft.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier SPARKSTEEL = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_SPARKSTEEL_TOOL,
            400, 7f, 2.5f, 18,
            () -> Ingredient.of(ModItems.SPARKSTEEL_INGOT.get()));
}
