package net.krabby7.dandoricraft.entity.client;

import net.krabby7.dandoricraft.DandoriCraft;
import net.krabby7.dandoricraft.entity.custom.DwarfBulborbEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DwarfBulborbModel extends GeoModel<DwarfBulborbEntity> {
    @Override
    public ResourceLocation getModelResource(DwarfBulborbEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "geo/dwarf_bulborb.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DwarfBulborbEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "textures/entity/dwarf_bulborb.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DwarfBulborbEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "animations/dwarf_bulborb.animation.json");
    }



    //@Override
    /* public void setCustomAnimations(DwarfBulborbEntity animatable, long instanceId, AnimationState<DwarfBulborbEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("body");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    } */
}