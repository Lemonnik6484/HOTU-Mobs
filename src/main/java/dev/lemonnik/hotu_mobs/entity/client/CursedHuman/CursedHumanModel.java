package dev.lemonnik.hotu_mobs.entity.client.CursedHuman;

import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.custom.CursedHuman;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class CursedHumanModel extends GeoModel<CursedHuman> {
    @Override
    public ResourceLocation getModelResource(CursedHuman animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "geo/cursed_human.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CursedHuman animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "textures/cursed_human.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CursedHuman animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "animations/cursed_human.animation.json");
    }

    @Override
    public void setCustomAnimations(CursedHuman animatable, long instanceId, AnimationState<CursedHuman> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
