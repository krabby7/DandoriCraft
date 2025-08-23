package net.krabby7.dandoricraft.worldgen.tree;
import net.krabby7.dandoricraft.DandoriCraft;
import net.krabby7.dandoricraft.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower AMP_OAK = new TreeGrower(DandoriCraft.MOD_ID + ":amp_oak",
            Optional.empty(), Optional.of(ModConfiguredFeatures.AMP_OAK_KEY), Optional.empty());
}