package net.krabby7.dandoricraft.entity.client;

import net.krabby7.dandoricraft.DandoriCraft;
import net.krabby7.dandoricraft.entity.custom.BulborbEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BulborbModel extends GeoModel<BulborbEntity> {
    @Override
    public ResourceLocation getModelResource(BulborbEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "geo/dwarf_bulborb.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BulborbEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "textures/entity/dwarf_bulborb.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BulborbEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "animations/dwarf_bulborb.animation.json");
    }



    //@Override
    /* public void setCustomAnimations(BulborbEntity animatable, long instanceId, AnimationState<BulborbEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("body");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    } */
}