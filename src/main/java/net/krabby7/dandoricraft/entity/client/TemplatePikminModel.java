package net.krabby7.dandoricraft.entity.client;

import net.krabby7.dandoricraft.DandoriCraft;
import net.krabby7.dandoricraft.entity.custom.TemplatePikminEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TemplatePikminModel extends GeoModel<TemplatePikminEntity> {
    @Override
    public ResourceLocation getModelResource(TemplatePikminEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "geo/pikmin.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TemplatePikminEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "textures/entity/template_pikmin.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TemplatePikminEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "animations/pikmin.animation.json");
    }



    //@Override
    /* public void setCustomAnimations(TemplatePikminEntity animatable, long instanceId, AnimationState<TemplatePikminEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("body");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    } */
}