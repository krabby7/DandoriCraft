package net.krabby7.dandoricraft.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.krabby7.dandoricraft.DandoriCraft;
import net.krabby7.dandoricraft.entity.custom.DwarfBulborbEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class DwarfBulborbRenderer extends GeoEntityRenderer<DwarfBulborbEntity> {
    public DwarfBulborbRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DwarfBulborbModel());
    }

    @Override
    public ResourceLocation getTextureLocation(DwarfBulborbEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "textures/entity/dwarf_bulborb.png");
    }


    /* @Override
    protected SoundEvent getHurtSound() {return ModSounds} */

    @Override
    public void render(DwarfBulborbEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}