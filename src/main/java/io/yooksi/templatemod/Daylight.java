package io.yooksi.templatemod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;

@Mod(Daylight.MODID)
public class Daylight {

    public static final String MODID = "daylight";

    public Daylight() {

        // Initialize mod logger
        DTLogger.init(LogManager.getLogger());

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

        // some preinit code
        DTLogger.info("Daytime pre-initialized");
    }
}
