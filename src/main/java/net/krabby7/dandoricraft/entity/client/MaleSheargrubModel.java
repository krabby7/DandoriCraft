package net.krabby7.dandoricraft.entity.client;

import net.krabby7.dandoricraft.DandoriCraft;
import net.krabby7.dandoricraft.entity.custom.MaleSheargrubEntity;
import net.krabby7.dandoricraft.entity.custom.MaleSheargrubEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MaleSheargrubModel extends GeoModel<MaleSheargrubEntity> {
    @Override
    public ResourceLocation getModelResource(MaleSheargrubEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "geo/male_sheargrub.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MaleSheargrubEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "textures/entity/male_sheargrub.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MaleSheargrubEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "animations/sheargrub.animation.json");
    }



    //@Override
    /* public void setCustomAnimations(MaleSheargrubEntity animatable, long instanceId, AnimationState<MaleSheargrubEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("body");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    } */
}