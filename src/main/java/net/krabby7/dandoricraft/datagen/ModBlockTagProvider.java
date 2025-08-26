package net.krabby7.dandoricraft.datagen;

import net.krabby7.dandoricraft.DandoriCraft;
import net.krabby7.dandoricraft.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, DandoriCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RAW_MATERIAL_BLOCK.get())
                .add(ModBlocks.RAW_MATERIAL_ORE.get())
                .add(ModBlocks.RAW_MATERIAL_DEEPSLATE_ORE.get())
                .add(ModBlocks.SPARKLIUM_BLOCK.get());



        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.AMP_OAK_LOG.get())
                .add(ModBlocks.AMP_OAK_PLANKS.get())
                .add(ModBlocks.STRIPPED_AMP_OAK_LOG.get())
                .add(ModBlocks.AMP_OAK_DOOR.get())
                .add(ModBlocks.AMP_OAK_SLAB.get())
                .add(ModBlocks.AMP_OAK_TRAPDOOR.get())
                .add(ModBlocks.SPARKLIUM_COMPOSTER.get());










        //this.tag(BlockTags.NEEDS_IRON_TOOL)


        //this.tag(BlockTags.NEEDS_DIAMOND_TOOL)


        //this.tag(BlockTags.LOGS_THAT_BURN)
    }
}