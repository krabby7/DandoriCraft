package net.krabby7.dandoricraft.util;

import net.krabby7.dandoricraft.DandoriCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_SPARKSTEEL_TOOL = createTag("incorrect_sparksteel_tool");
        public static final TagKey<Block> NEEDS_SPARKSTEEL_TOOL = createTag("needs_sparksteel_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, name));
        }
    }
}