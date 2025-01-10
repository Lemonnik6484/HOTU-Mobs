package dev.lemonnik.hotu_mobs.item;

import dev.lemonnik.hotu_mobs.HOTUMobs;
import dev.lemonnik.hotu_mobs.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HOTUMobs.MODID);

    public static final RegistryObject<Item> BEAR_SPAWN_EGG = ITEMS.register("bear_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.BEAR, 0x22150D, 0x39251A,
                    new Item.Properties()));

    public static final RegistryObject<Item> KNIGHT_SPAWN_EGG = ITEMS.register("knight_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.KNIGHT, 0x8C8280, 0xCCCCCA,
                    new Item.Properties()));

    public static final RegistryObject<Item> GECKO_SPAWN_EGG = ITEMS.register("gecko_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.GECKO, 0x486056, 0xD62E52,
                    new Item.Properties()));

    public static final RegistryObject<Item> SNAKE_SPAWN_EGG = ITEMS.register("snake_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.SNAKE, 0x424F34, 0x58653F,
                    new Item.Properties()));

    public static final RegistryObject<Item> CROCODILE_SPAWN_EGG = ITEMS.register("crocodile_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.CROCODILE, 0x605b3E, 0xE5E685,
                    new Item.Properties()));

    public static final RegistryObject<Item> FOREST_SPIRIT_SPAWN_EGG = ITEMS.register("forest_spirit_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.FOREST_SPIRIT, 0x35311B, 0x5D453A,
                    new Item.Properties()));

    public static final RegistryObject<Item> CURSED_HUMAN_SPAWN_EGG = ITEMS.register("cursed_human_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.CURSED_HUMAN, 0xE7E7E7, 0xE2C790,
                    new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
