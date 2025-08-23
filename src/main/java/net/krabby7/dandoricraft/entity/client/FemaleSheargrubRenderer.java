package net.krabby7.dandoricraft.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.krabby7.dandoricraft.DandoriCraft;
import net.krabby7.dandoricraft.entity.custom.FemaleSheargrubEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class FemaleSheargrubRenderer extends GeoEntityRenderer<FemaleSheargrubEntity> {
    public FemaleSheargrubRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new FemaleSheargrubModel());
    }

    @Override
    public ResourceLocation getTextureLocation(FemaleSheargrubEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "textures/entity/female_sheargrub.png");
    }


    /* @Override
    protected SoundEvent getHurtSound() {return ModSounds} */

    @Override
    public void render(FemaleSheargrubEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}