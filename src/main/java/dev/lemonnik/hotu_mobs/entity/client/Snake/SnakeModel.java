package dev.lemonnik.hotu_mobs.entity.client.Snake;

import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.custom.Snake;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class SnakeModel extends GeoModel<Snake> {
    @Override
    public ResourceLocation getModelResource(Snake animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "geo/snake.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Snake animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "textures/snake.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Snake animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "animations/snake.animation.json");
    }

    @Override
    public void setCustomAnimations(Snake animatable, long instanceId, AnimationState<Snake> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("bone");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
