package dev.lemonnik.hotu_mobs.entity;

import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.custom.*;
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

    public static final RegistryObject<EntityType<Gecko>> GECKO =
            ENTITY_TYPES.register("gecko",
                    () -> EntityType.Builder.of(Gecko::new, MobCategory.MONSTER)
                            .sized(1.5f, 1.75f)
                            .build(new ResourceLocation(HOTUMobs.MODID, "gecko").toString()));

    public static final RegistryObject<EntityType<Crocodile>> CROCODILE =
            ENTITY_TYPES.register("crocodile",
                    () -> EntityType.Builder.of(Crocodile::new, MobCategory.MONSTER)
                            .sized(1.5f, 1.75f)
                            .build(new ResourceLocation(HOTUMobs.MODID, "crocodile").toString()));

    public static final RegistryObject<EntityType<ForestSpirit>> FOREST_SPIRIT =
            ENTITY_TYPES.register("forest_spirit",
                    () -> EntityType.Builder.of(ForestSpirit::new, MobCategory.MONSTER)
                            .sized(1.5f, 1.75f)
                            .build(new ResourceLocation(HOTUMobs.MODID, "forest_spirit").toString()));

    public static final RegistryObject<EntityType<CursedHuman>> CURSED_HUMAN =
            ENTITY_TYPES.register("cursed_human",
                    () -> EntityType.Builder.of(CursedHuman::new, MobCategory.MONSTER)
                            .sized(1.5f, 1.75f)
                            .build(new ResourceLocation(HOTUMobs.MODID, "cursed_human").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
