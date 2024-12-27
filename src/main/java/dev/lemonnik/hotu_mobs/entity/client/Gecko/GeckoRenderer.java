package dev.lemonnik.hotu_mobs.entity.client.Gecko;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.custom.Gecko;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class GeckoRenderer extends GeoEntityRenderer<Gecko> {
    public GeckoRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GeckoModel());
    }

    @Override
    public ResourceLocation getTextureLocation(Gecko animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "textures/entity/gecko.png");
    }

    @Override
    public void render(Gecko entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
