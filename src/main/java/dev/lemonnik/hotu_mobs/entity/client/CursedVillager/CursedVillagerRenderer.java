package dev.lemonnik.hotu_mobs.entity.client.CursedVillager;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.custom.CursedVillager;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class CursedVillagerRenderer extends GeoEntityRenderer<CursedVillager> {
    public CursedVillagerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CursedVillagerModel());
    }

    @Override
    public ResourceLocation getTextureLocation(CursedVillager animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "textures/entity/cursed_villager.png");
    }

    @Override
    public void render(CursedVillager entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
