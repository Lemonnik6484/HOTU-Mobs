package dev.lemonnik.hotu_mobs.entity.client.ScintSlime;

import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.custom.ScintSlime;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ScintSlimeModel extends GeoModel<ScintSlime> {
    @Override
    public ResourceLocation getModelResource(ScintSlime animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "geo/scint_slime.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ScintSlime animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "textures/scint_slime.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ScintSlime animatable) {
        return new ResourceLocation(HOTUMobs.MODID, "animations/scint_slime.animation.json");
    }
}
