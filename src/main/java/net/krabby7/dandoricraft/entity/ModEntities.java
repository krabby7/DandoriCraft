package net.krabby7.dandoricraft.entity;

import net.krabby7.dandoricraft.DandoriCraft;
import net.krabby7.dandoricraft.entity.custom.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, DandoriCraft.MOD_ID);

    //pikmin

    public static final Supplier<EntityType<RedPikminEntity>> RED_PIKMIN_ENTITY =
            ENTITY_TYPES.register("red_pikmin", () -> EntityType.Builder.of(RedPikminEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("red_pikmin"));

    //other

    public static final Supplier<EntityType<DwarfBulborbEntity>> DWARF_BULBORB_ENTITY =
            ENTITY_TYPES.register("dwarf_bulborb", () -> EntityType.Builder.of(DwarfBulborbEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("dwarf_bulborb"));

    public static final Supplier<EntityType<BulborbEntity>> BULBORB_ENTITY =
            ENTITY_TYPES.register("bulborb", () -> EntityType.Builder.of(BulborbEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("bulborb"));

    public static final Supplier<EntityType<FemaleSheargrubEntity>> FEMALE_SHEARGRUB_ENTITY =
            ENTITY_TYPES.register("female_sheargrub", () -> EntityType.Builder.of(FemaleSheargrubEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("female_sheargrub"));

    public static final Supplier<EntityType<MaleSheargrubEntity>> MALE_SHEARGRUB_ENTITY =
            ENTITY_TYPES.register("male_sheargrub", () -> EntityType.Builder.of(MaleSheargrubEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("male_sheargrub"));


    public static final Supplier<EntityType<WhiteSpectralidEntity>> WHITE_SPECTRALID_ENTITY =
            ENTITY_TYPES.register("white_spectralid", () -> EntityType.Builder.of(WhiteSpectralidEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("white_spectralid"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}