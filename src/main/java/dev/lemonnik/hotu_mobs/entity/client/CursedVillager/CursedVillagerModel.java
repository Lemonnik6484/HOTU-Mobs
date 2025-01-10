package dev.lemonnik.hotu_mobs.entity.client.CursedVillager;

import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.custom.CursedVillager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class CursedVillagerModel extends GeoModel<CursedVillager> {
    @Override
    public ResourceLocation getModelResource(CursedVillager animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "geo/cursed_villager.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CursedVillager animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "textures/cursed_villager.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CursedVillager animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "animations/cursed_villager.animation.json");
    }

    @Override
    public void setCustomAnimations(CursedVillager animatable, long instanceId, AnimationState<CursedVillager> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
