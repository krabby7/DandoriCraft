package net.krabby7.dandoricraft.datagen;

import net.krabby7.dandoricraft.DandoriCraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBiomeTagProvider extends BiomeTagsProvider {
    public ModBiomeTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, DandoriCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        //this.tag(BiomeTags.IS_END)
                //.add(ModBiomes.SOLAR_DESERT);


        //this.tag(BlockTags.NEEDS_IRON_TOOL)


        //this.tag(BlockTags.NEEDS_DIAMOND_TOOL)

        //this.tag(BlockTags.LOGS_THAT_BURN)
    }
}