package dev.lemonnik.hotu_mobs.entity.client.ScintonitSlime;

import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.custom.ScintonitSlime;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ScintonitSlimeModel extends GeoModel<ScintonitSlime> {
    @Override
    public ResourceLocation getModelResource(ScintonitSlime animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "geo/scintonit_slime.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ScintonitSlime animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "textures/scintonit_slime.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ScintonitSlime animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "animations/scintonit_slime.animation.json");
    }
}
