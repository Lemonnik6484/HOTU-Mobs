package dev.lemonnik.hotu_mobs;

import com.mojang.logging.LogUtils;
import dev.lemonnik.hotu_mobs.entity.ModEntities;
import dev.lemonnik.hotu_mobs.entity.client.Bear.BearRenderer;
import dev.lemonnik.hotu_mobs.entity.client.Crocodile.CrocodileRenderer;
import dev.lemonnik.hotu_mobs.entity.client.CursedHuman.CursedHumanRenderer;
import dev.lemonnik.hotu_mobs.entity.client.CursedVillager.CursedVillagerRenderer;
import dev.lemonnik.hotu_mobs.entity.client.ForestSpirit.ForestSpiritRenderer;
import dev.lemonnik.hotu_mobs.entity.client.Gecko.GeckoRenderer;
import dev.lemonnik.hotu_mobs.entity.client.Knight.KnightRenderer;
import dev.lemonnik.hotu_mobs.entity.client.ScintSlime.ScintSlimeRenderer;
import dev.lemonnik.hotu_mobs.entity.client.ScintonitSlime.ScintonitSlimeRenderer;
import dev.lemonnik.hotu_mobs.entity.client.Snake.SnakeRenderer;
import dev.lemonnik.hotu_mobs.item.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(HOTUMobs.MODID)
public class HOTUMobs
{
    public static final String MODID = "hotu_mobs";
    private static final Logger LOGGER = LogUtils.getLogger();
    
    public HOTUMobs(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        ModEntities.register(modEventBus);
        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            ModItems.ITEMS.getEntries().forEach(item -> {
                event.accept(item.get());
            });
        }
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Starting HOTU mobs!");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.BEAR.get(), BearRenderer::new);
            EntityRenderers.register(ModEntities.KNIGHT.get(), KnightRenderer::new);
            EntityRenderers.register(ModEntities.SNAKE.get(), SnakeRenderer::new);
            EntityRenderers.register(ModEntities.GECKO.get(), GeckoRenderer::new);
            EntityRenderers.register(ModEntities.CROCODILE.get(), CrocodileRenderer::new);
            EntityRenderers.register(ModEntities.FOREST_SPIRIT.get(), ForestSpiritRenderer::new);
            EntityRenderers.register(ModEntities.CURSED_HUMAN.get(), CursedHumanRenderer::new);
            EntityRenderers.register(ModEntities.SCINT_SLIME.get(), ScintSlimeRenderer::new);
            EntityRenderers.register(ModEntities.SCINTONIT_SLIME.get(), ScintonitSlimeRenderer::new);
            EntityRenderers.register(ModEntities.CURSED_VILLAGER.get(), CursedVillagerRenderer::new);
        }
    }
}
