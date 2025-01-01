package dev.lemonnik.hotu_mobs.entity.client.Crocodile;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.custom.Crocodile;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class CrocodileRenderer extends GeoEntityRenderer<Crocodile> {
    public CrocodileRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CrocodileModel());
    }

    @Override
    public ResourceLocation getTextureLocation(Crocodile animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "textures/entity/crocodile.png");
    }

    @Override
    public void render(Crocodile entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
