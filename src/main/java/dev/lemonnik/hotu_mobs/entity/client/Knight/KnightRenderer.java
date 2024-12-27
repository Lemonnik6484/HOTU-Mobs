package dev.lemonnik.hotu_mobs.entity.client.Knight;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.custom.Knight;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class KnightRenderer extends GeoEntityRenderer<Knight> {
    public KnightRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new KnightModel());
    }

    @Override
    public ResourceLocation getTextureLocation(Knight animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "textures/entity/knight.png");
    }

    @Override
    public void render(Knight entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
