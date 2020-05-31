package realfusion;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import realfusion.proxy.CommonProxy;


@Mod(modid = RealFusion.MODID, name = RealFusion.NAME, version = RealFusion.VERSION)
public class RealFusion {

    public static final String MODID = "realfusion";
    public static final String NAME = "Real Fusion";
    public static final String VERSION = "1.0";


    @SidedProxy(clientSide = "realfusion.proxy.ClientProxy", serverSide = "realfusion.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static RealFusion instance;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
