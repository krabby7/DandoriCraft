package net.krabby7.dandoricraft.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.krabby7.dandoricraft.DandoriCraft;
import net.krabby7.dandoricraft.entity.custom.RedPikminEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class RedPikminRenderer extends GeoEntityRenderer<RedPikminEntity> {
    public RedPikminRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new RedPikminModel());
    }

    @Override
    public ResourceLocation getTextureLocation(RedPikminEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "textures/entity/red_pikmin.png");
    }


    /* @Override
    protected SoundEvent getHurtSound() {return ModSounds} */

    @Override
    public void render(RedPikminEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        poseStack.scale(0.6f, 0.6f, 0.6f);


        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}