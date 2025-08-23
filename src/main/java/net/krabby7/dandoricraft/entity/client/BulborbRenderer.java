package net.krabby7.dandoricraft.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.krabby7.dandoricraft.DandoriCraft;
import net.krabby7.dandoricraft.entity.custom.BulborbEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class BulborbRenderer extends GeoEntityRenderer<BulborbEntity> {
    public BulborbRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BulborbModel());
    }

    @Override
    public ResourceLocation getTextureLocation(BulborbEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "textures/entity/dwarf_bulborb.png");
    }


    /* @Override
    protected SoundEvent getHurtSound() {return ModSounds} */

    @Override
    public void render(BulborbEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        poseStack.scale(3.0f, 3.0f, 3.0f);

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}