package dev.lemonnik.hotu_mobs.entity.client.Gecko;

import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.custom.Gecko;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class GeckoModel extends GeoModel<Gecko> {
    @Override
    public ResourceLocation getModelResource(Gecko animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "geo/gecko.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Gecko animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "textures/gecko.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Gecko animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "animations/gecko.animation.json");
    }

    @Override
    public void setCustomAnimations(Gecko animatable, long instanceId, AnimationState<Gecko> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
