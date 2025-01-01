package dev.lemonnik.hotu_mobs.entity.client.Crocodile;

import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.custom.Crocodile;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class CrocodileModel extends GeoModel<Crocodile> {
    @Override
    public ResourceLocation getModelResource(Crocodile animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "geo/crocodile.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Crocodile animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "textures/crocodile.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Crocodile animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "animations/crocodile.animation.json");
    }

    @Override
    public void setCustomAnimations(Crocodile animatable, long instanceId, AnimationState<Crocodile> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
