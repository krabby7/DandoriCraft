package net.krabby7.dandoricraft.entity.client;

import net.krabby7.dandoricraft.DandoriCraft;
import net.krabby7.dandoricraft.entity.custom.FemaleSheargrubEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class FemaleSheargrubModel extends GeoModel<FemaleSheargrubEntity> {
    @Override
    public ResourceLocation getModelResource(FemaleSheargrubEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "geo/female_sheargrub.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FemaleSheargrubEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "textures/entity/female_sheargrub.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FemaleSheargrubEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "animations/sheargrub.animation.json");
    }



    //@Override
    /* public void setCustomAnimations(FemaleSheargrubEntity animatable, long instanceId, AnimationState<FemaleSheargrubEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("body");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    } */
}