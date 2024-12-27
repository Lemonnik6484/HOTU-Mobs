package dev.lemonnik.hotu_mobs;

import com.mojang.logging.LogUtils;
import dev.lemonnik.hotu_mobs.entity.ModEntities;
import dev.lemonnik.hotu_mobs.entity.client.Bear.BearRenderer;
import dev.lemonnik.hotu_mobs.entity.client.Gecko.GeckoRenderer;
import dev.lemonnik.hotu_mobs.entity.client.Knight.KnightRenderer;
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
            event.accept(ModItems.BEAR_SPAWN_EGG);
            event.accept(ModItems.KNIGHT_SPAWN_EGG);
            event.accept(ModItems.GECKO_SPAWN_EGG);
            event.accept(ModItems.SNAKE_SPAWN_EGG);
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
        }
    }
}
