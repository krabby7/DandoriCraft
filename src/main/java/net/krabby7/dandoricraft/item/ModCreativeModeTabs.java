package net.krabby7.dandoricraft.item;

import net.krabby7.dandoricraft.DandoriCraft;
import net.krabby7.dandoricraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DandoriCraft.MOD_ID);

    public static final Supplier<CreativeModeTab> DANDORICRAFT_TAB =
            CREATIVE_MODE_TABS.register("dandoricraft_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.dandoricraft.dandoricraft_tab"))
                    .icon(() -> new ItemStack(ModItems.RED_TEN_PELLET.get()))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TEMPLATE_PIKMIN_SPAWN_EGG);
                        pOutput.accept(ModItems.RED_PIKMIN_SPAWN_EGG);

                        pOutput.accept(ModItems.RED_ONE_PELLET);
                        pOutput.accept(ModItems.RED_FIVE_PELLET);
                        pOutput.accept(ModItems.RED_TEN_PELLET);

                        pOutput.accept(ModBlocks.SPARKLIUM_COMPOSTER);

                        pOutput.accept(ModItems.SPARKSTEEL_SWORD);
                        pOutput.accept(ModItems.SPARKSTEEL_PICKAXE);
                        pOutput.accept(ModItems.SPARKSTEEL_AXE);
                        pOutput.accept(ModItems.SPARKSTEEL_SHOVEL);
                        pOutput.accept(ModItems.SPARKSTEEL_HOE);

                        pOutput.accept(ModItems.SPARKSTEEL_HELMET);
                        pOutput.accept(ModItems.SPARKSTEEL_CHESTPLATE);
                        pOutput.accept(ModItems.SPARKSTEEL_LEGGINGS);
                        pOutput.accept(ModItems.SPARKSTEEL_BOOTS);

                        pOutput.accept(ModItems.BULBORB_HELMET);
                        pOutput.accept(ModItems.BULBORB_CHESTPLATE);
                        pOutput.accept(ModItems.BULBORB_LEGGINGS);
                        pOutput.accept(ModItems.BULBORB_BOOTS);

                        pOutput.accept(ModItems.AMPCORN);
                        pOutput.accept(ModItems.SPARKLIUM);
                        pOutput.accept(ModBlocks.SPARKLIUM_BLOCK);
                        pOutput.accept(ModItems.SPARKSTEEL_INGOT);
                        pOutput.accept(ModItems.SPARKSTEEL_NUGGET);
                        pOutput.accept(ModBlocks.SPARKSTEEL_BLOCK);
                        pOutput.accept(ModItems.DANDORIUM_INGOT);
                        pOutput.accept(ModBlocks.AMP_OAK_SAPLING);
                        pOutput.accept(ModBlocks.AMP_OAK_LOG);
                        pOutput.accept(ModBlocks.STRIPPED_AMP_OAK_LOG);
                        pOutput.accept(ModBlocks.AMP_OAK_LEAVES);
                        pOutput.accept(ModBlocks.AMP_OAK_PLANKS);
                        pOutput.accept(ModBlocks.AMP_OAK_SLAB);
                        pOutput.accept(ModBlocks.AMP_OAK_TRAPDOOR);
                        pOutput.accept(ModBlocks.AMP_OAK_DOOR);



                        pOutput.accept(ModItems.RAW_MATERIAL);
                        pOutput.accept(ModBlocks.RAW_MATERIAL_BLOCK);
                        pOutput.accept(ModBlocks.RAW_MATERIAL_ORE);
                        pOutput.accept(ModBlocks.RAW_MATERIAL_DEEPSLATE_ORE);




                        pOutput.accept(ModItems.BULBORB_HIDE);
                        pOutput.accept(ModItems.RAW_BULBORB_CHOP);
                        pOutput.accept(ModItems.COOKED_BULBORB_CHOP);

                        pOutput.accept(ModItems.DWARF_BULBORB_SPAWN_EGG);
                        pOutput.accept(ModItems.BULBORB_SPAWN_EGG);

                        pOutput.accept(ModItems.FEMALE_SHEARGRUB_SPAWN_EGG);
                        pOutput.accept(ModItems.MALE_SHEARGRUB_SPAWN_EGG);

                        pOutput.accept(ModItems.WHITE_SPECTRALID_SPAWN_EGG);



                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}