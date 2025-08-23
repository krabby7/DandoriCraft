package net.krabby7.dandoricraft.entity.client;

import net.krabby7.dandoricraft.DandoriCraft;
import net.krabby7.dandoricraft.entity.custom.WhiteSpectralidEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class WhiteSpectralidModel extends GeoModel<WhiteSpectralidEntity> {
    @Override
    public ResourceLocation getModelResource(WhiteSpectralidEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "geo/spectralid.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WhiteSpectralidEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "textures/entity/white_spectralid.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WhiteSpectralidEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "animations/spectralid.animation.json");
    }



    //@Override
    /* public void setCustomAnimations(WhiteSpectralidEntity animatable, long instanceId, AnimationState<WhiteSpectralidEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("body");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    } */
}