package dev.lemonnik.hotu_mobs.entity.client.Snake;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.custom.Snake;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class SnakeRenderer extends GeoEntityRenderer<Snake> {
    public SnakeRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SnakeModel());
    }

    @Override
    public ResourceLocation getTextureLocation(Snake animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "textures/entity/snake.png");
    }

    @Override
    public void render(Snake entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
