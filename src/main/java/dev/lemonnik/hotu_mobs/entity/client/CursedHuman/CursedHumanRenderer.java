package dev.lemonnik.hotu_mobs.entity.client.CursedHuman;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.custom.CursedHuman;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class CursedHumanRenderer extends GeoEntityRenderer<CursedHuman> {
    public CursedHumanRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CursedHumanModel());
    }

    @Override
    public ResourceLocation getTextureLocation(CursedHuman animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "textures/entity/cursed_human.png");
    }

    @Override
    public void render(CursedHuman entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
