package mod.reborn;

import mod.reborn.client.events.RebornClientEvents;
import mod.reborn.common.RebornConfig;
import mod.reborn.common.events.RebornForgeEvents;
import mod.reborn.common.events.RebornModEvents;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(RebornMod.MOD_ID)
public class RebornMod {

    public static final String MOD_ID = "rebornmod";
    public static final Logger LOGGER = LogManager.getLogger();

    public static long timerTicks;

    public boolean isTestEnv() {
        return !FMLEnvironment.production;
    }

    public RebornMod() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, RebornConfig.spec);
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;
        RebornModEvents.Register(modEventBus).Log();
        RebornForgeEvents.Register(forgeEventBus).Log();
        RebornClientEvents.Register(forgeEventBus).Log();
    }
}