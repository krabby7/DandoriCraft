package net.krabby7.dandoricraft.event;

import net.krabby7.dandoricraft.DandoriCraft;
import net.krabby7.dandoricraft.entity.ModEntities;
import net.krabby7.dandoricraft.entity.client.*;
import net.krabby7.dandoricraft.entity.custom.*;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

@EventBusSubscriber(modid = DandoriCraft.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {

        event.put(ModEntities.RED_PIKMIN_ENTITY.get(), RedPikminEntity.createAttributes().build());

        event.put(ModEntities.DWARF_BULBORB_ENTITY.get(), DwarfBulborbEntity.createAttributes().build());
        event.put(ModEntities.BULBORB_ENTITY.get(), BulborbEntity.createAttributes().build());
        event.put(ModEntities.FEMALE_SHEARGRUB_ENTITY.get(), FemaleSheargrubEntity.createAttributes().build());
        event.put(ModEntities.MALE_SHEARGRUB_ENTITY.get(), MaleSheargrubEntity.createAttributes().build());
        event.put(ModEntities.WHITE_SPECTRALID_ENTITY.get(), MaleSheargrubEntity.createAttributes().build());

    }


}