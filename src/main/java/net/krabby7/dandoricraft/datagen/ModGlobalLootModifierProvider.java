package net.krabby7.dandoricraft.datagen;

import net.krabby7.dandoricraft.DandoriCraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, DandoriCraft.MOD_ID);
    }

    @Override
    protected void start() {
//        this.add("chisel_from_jungle_temple",
//                new AddItemModifier(new LootItemCondition[] {
//                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/end_city_treasure")).build()
//                }, Items.ENCHANTED_BOOK));



    }

    @Override
    public String getName() {
        return "GlobalLootModifier";
    }
}