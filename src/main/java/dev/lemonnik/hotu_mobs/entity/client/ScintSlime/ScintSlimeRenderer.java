package dev.lemonnik.hotu_mobs.entity.client.ScintSlime;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.custom.ScintSlime;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ScintSlimeRenderer extends GeoEntityRenderer<ScintSlime> {
    public ScintSlimeRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ScintSlimeModel());
    }

    @Override
    public ResourceLocation getTextureLocation(ScintSlime animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "textures/entity/scint_slime.png");
    }

    @Override
    public void render(ScintSlime entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.2f, 0.2f, 0.2f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
