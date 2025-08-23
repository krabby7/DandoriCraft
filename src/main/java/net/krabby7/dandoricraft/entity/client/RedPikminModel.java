package net.krabby7.dandoricraft.entity.client;

import net.krabby7.dandoricraft.DandoriCraft;
import net.krabby7.dandoricraft.entity.custom.RedPikminEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class RedPikminModel extends GeoModel<RedPikminEntity> {
    @Override
    public ResourceLocation getModelResource(RedPikminEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "geo/red_pikmin.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RedPikminEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "textures/entity/red_pikmin.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RedPikminEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "animations/pikmin.animation.json");
    }



    //@Override
    /* public void setCustomAnimations(RedPikminEntity animatable, long instanceId, AnimationState<RedPikminEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("body");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    } */
}