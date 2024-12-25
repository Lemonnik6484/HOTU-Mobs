package dev.lemonnik.hotu_mobs.entity.client.Bear;

import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.custom.Bear;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class BearModel extends GeoModel<Bear> {
    @Override
    public ResourceLocation getModelResource(Bear animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "geo/bear.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Bear animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "textures/bear.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Bear animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "animations/bear.animation.json");
    }

    @Override
    public void setCustomAnimations(Bear animatable, long instanceId, AnimationState<Bear> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
