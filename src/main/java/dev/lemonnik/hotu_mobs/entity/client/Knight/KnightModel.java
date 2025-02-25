package dev.lemonnik.hotu_mobs.entity.client.Knight;

import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.custom.Knight;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class KnightModel extends GeoModel<Knight> {
    @Override
    public ResourceLocation getModelResource(Knight animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "geo/knight.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Knight animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "textures/knight.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Knight animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "animations/knight.animation.json");
    }

    @Override
    public void setCustomAnimations(Knight animatable, long instanceId, AnimationState<Knight> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
