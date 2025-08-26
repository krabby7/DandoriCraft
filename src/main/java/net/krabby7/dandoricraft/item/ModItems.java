package net.krabby7.dandoricraft.item;

import net.krabby7.dandoricraft.DandoriCraft;
import net.krabby7.dandoricraft.entity.ModEntities;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DandoriCraft.MOD_ID);

    public static final DeferredItem<Item> SPARKLIUM = ITEMS.registerSimpleItem("sparklium");
    public static final DeferredItem<Item> SPARKSTEEL_INGOT = ITEMS.registerSimpleItem("sparksteel_ingot");
    public static final DeferredItem<Item> SPARKSTEEL_NUGGET = ITEMS.registerSimpleItem("sparksteel_nugget");

    public static final DeferredItem<Item> DANDORIUM_INGOT = ITEMS.registerSimpleItem("dandorium_ingot");

    public static final DeferredItem<Item> AMPCORN =
            ITEMS.registerItem("ampcorn", properties -> new Item(properties) {
            }, new Item.Properties().food(ModFoodProperties.AMPCORN));


    public static final DeferredItem<Item> SPARKSTEEL_SWORD = ITEMS.register("sparksteel_sword",
            () -> new SwordItem(ModToolTiers.SPARKSTEEL,
                    new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.SPARKSTEEL, 3, -2.4f))));
    public static final DeferredItem<Item> SPARKSTEEL_PICKAXE = ITEMS.register("sparksteel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SPARKSTEEL,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.SPARKSTEEL, 1, -2.8f))));
    public static final DeferredItem<Item> SPARKSTEEL_SHOVEL = ITEMS.register("sparksteel_shovel",
            () -> new ShovelItem(ModToolTiers.SPARKSTEEL,
                    new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.SPARKSTEEL, 1.5f, -3.0f))));
    public static final DeferredItem<Item> SPARKSTEEL_AXE = ITEMS.register("sparksteel_axe",
            () -> new AxeItem(ModToolTiers.SPARKSTEEL,
                    new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.SPARKSTEEL, 6, -3.2f))));
    public static final DeferredItem<Item> SPARKSTEEL_HOE = ITEMS.register("sparksteel_hoe",
            () -> new HoeItem(ModToolTiers.SPARKSTEEL,
                    new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.SPARKSTEEL, 0, -3.0f))));
    public static final DeferredItem<Item> SPARKSTEEL_HELMET = ITEMS.register("sparksteel_helmet",
            () -> new ArmorItem(ModArmorMaterials.SPARKSTEEL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(20))));
    public static final DeferredItem<Item> SPARKSTEEL_CHESTPLATE = ITEMS.register("sparksteel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SPARKSTEEL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(20))));
    public static final DeferredItem<Item> SPARKSTEEL_LEGGINGS = ITEMS.register("sparksteel_leggings",
            () -> new ArmorItem(ModArmorMaterials.SPARKSTEEL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(20))));
    public static final DeferredItem<Item> SPARKSTEEL_BOOTS = ITEMS.register("sparksteel_boots",
            () -> new ArmorItem(ModArmorMaterials.SPARKSTEEL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(20))));


    public static final DeferredItem<Item> BULBORB_HIDE = ITEMS.registerSimpleItem("bulborb_hide");

    public static final DeferredItem<Item> RAW_BULBORB_CHOP =
            ITEMS.registerItem("raw_bulborb_chop", properties -> new Item(properties) {
            }, new Item.Properties().food(ModFoodProperties.RAW_BULBORB_CHOP));

    public static final DeferredItem<Item> COOKED_BULBORB_CHOP =
            ITEMS.registerItem("cooked_bulborb_chop", properties -> new Item(properties) {
            }, new Item.Properties().food(ModFoodProperties.COOKED_BULBORB_CHOP));
    public static final DeferredItem<Item> DWARF_BULBORB_SPAWN_EGG = ITEMS.register("dwarf_bulborb_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.DWARF_BULBORB_ENTITY, 13116458, 16185078,
                    new Item.Properties()));

    public static final DeferredItem<Item> BULBORB_SPAWN_EGG = ITEMS.register("bulborb_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.BULBORB_ENTITY, 13116458, 16185078,
                    new Item.Properties()));
    public static final DeferredItem<Item> BULBORB_HELMET = ITEMS.register("bulborb_helmet",
            () -> new ArmorItem(ModArmorMaterials.BULBORB, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(7))));
    public static final DeferredItem<Item> BULBORB_CHESTPLATE = ITEMS.register("bulborb_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BULBORB, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(7))));
    public static final DeferredItem<Item> BULBORB_LEGGINGS = ITEMS.register("bulborb_leggings",
            () -> new ArmorItem(ModArmorMaterials.BULBORB, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(7))));
    public static final DeferredItem<Item> BULBORB_BOOTS = ITEMS.register("bulborb_boots",
            () -> new ArmorItem(ModArmorMaterials.BULBORB, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(7))));



    public static final DeferredItem<Item> FEMALE_SHEARGRUB_SPAWN_EGG = ITEMS.register("female_sheargrub_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.FEMALE_SHEARGRUB_ENTITY, 14271431, 11180701,
                    new Item.Properties()));

    public static final DeferredItem<Item> MALE_SHEARGRUB_SPAWN_EGG = ITEMS.register("male_sheargrub_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.MALE_SHEARGRUB_ENTITY, 10057284, 5580389,
                    new Item.Properties()));


    public static final DeferredItem<Item> WHITE_SPECTRALID_SPAWN_EGG = ITEMS.register("white_spectralid_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.WHITE_SPECTRALID_ENTITY, 15658462, 1184274,
                    new Item.Properties()));


    public static final DeferredItem<Item> TEMPLATE_PIKMIN_SPAWN_EGG = ITEMS.register("template_pikmin_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.TEMPLATE_PIKMIN_ENTITY, 0x7d7d7d, 4194082,
                    new Item.Properties()){
            @Override
            public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                pTooltipComponents.add(Component.translatable("tooltip.dandoricraft.template_pikmin"));
                super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
            }
    });

    public static final DeferredItem<Item> RED_PIKMIN_SPAWN_EGG = ITEMS.register("red_pikmin_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.RED_PIKMIN_ENTITY, 16121856, 4194082,
                    new Item.Properties()));

    public static final DeferredItem<Item> RED_ONE_PELLET = ITEMS.registerSimpleItem("red_one_pellet");
    public static final DeferredItem<Item> RED_FIVE_PELLET = ITEMS.registerSimpleItem("red_five_pellet");
    public static final DeferredItem<Item> RED_TEN_PELLET = ITEMS.registerSimpleItem("red_ten_pellet");


    public static final DeferredItem<Item> RAW_MATERIAL = ITEMS.registerSimpleItem("raw_material");





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}