package dev.lemonnik.hotu_mobs.entity;

import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.custom.Bear;
import dev.lemonnik.hotu_mobs.entity.custom.Knight;
import dev.lemonnik.hotu_mobs.entity.custom.Snake;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HOTUMobs.MODID);

    public static final RegistryObject<EntityType<Bear>> BEAR =
            ENTITY_TYPES.register("bear",
                    () -> EntityType.Builder.of(Bear::new, MobCategory.MONSTER)
                            .sized(1.5f, 1.75f)
                            .build(new ResourceLocation(HOTUMobs.MODID, "bear").toString()));

    public static final RegistryObject<EntityType<Knight>> KNIGHT =
            ENTITY_TYPES.register("knight",
                    () -> EntityType.Builder.of(Knight::new, MobCategory.MONSTER)
                            .sized(1.5f, 1.75f)
                            .build(new ResourceLocation(HOTUMobs.MODID, "knight").toString()));

    public static final RegistryObject<EntityType<Snake>> SNAKE =
            ENTITY_TYPES.register("snake",
                    () -> EntityType.Builder.of(Snake::new, MobCategory.MONSTER)
                            .sized(1.5f, 1.75f)
                            .build(new ResourceLocation(HOTUMobs.MODID, "snake").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
