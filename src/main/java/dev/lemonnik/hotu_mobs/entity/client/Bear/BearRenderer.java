package dev.lemonnik.hotu_mobs.entity.client.Bear;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.custom.Bear;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class BearRenderer extends GeoEntityRenderer<Bear> {
    public BearRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BearModel());
    }

    @Override
    public ResourceLocation getTextureLocation(Bear animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "textures/entity/bear.png");
    }

    @Override
    public void render(Bear entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
