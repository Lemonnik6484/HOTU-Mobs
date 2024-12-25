package dev.lemonnik.hotu_mobs;

import com.mojang.logging.LogUtils;
import dev.lemonnik.hotu_mobs.entity.ModEntities;
import dev.lemonnik.hotu_mobs.entity.client.Bear.BearRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
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

        modEventBus.addListener(this::commonSetup);
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
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
        }
    }
}
