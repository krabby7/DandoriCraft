package net.krabby7.dandoricraft.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.krabby7.dandoricraft.DandoriCraft;
import net.krabby7.dandoricraft.entity.custom.TemplatePikminEntity;
import net.krabby7.dandoricraft.entity.custom.TemplatePikminEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.loading.json.raw.Bone;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class TemplatePikminRenderer extends GeoEntityRenderer<TemplatePikminEntity> {
    public TemplatePikminRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TemplatePikminModel());
    }

    @Override
    public ResourceLocation getTextureLocation(TemplatePikminEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DandoriCraft.MOD_ID, "textures/entity/template_pikmin.png");
    }


    /* @Override
    protected SoundEvent getHurtSound() {return ModSounds} */

    @Override
    public void render(TemplatePikminEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        poseStack.scale(0.6f, 0.6f, 0.6f);


        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }

    public void preRender(PoseStack poseStack, TemplatePikminEntity animatable, BakedGeoModel model, float partialTick, int packedLight, int packedOverlay) {
        super.preRender(poseStack, animatable, model, null, null, true,  partialTick,  packedLight, packedOverlay, 0);

        // Example: Hide or show a part based on a condition
        GeoBone noseBone = this.getGeoModel().getBone("nose").orElse(null);
        if (noseBone != null) {
            noseBone.setHidden(true);
        }
    }
}