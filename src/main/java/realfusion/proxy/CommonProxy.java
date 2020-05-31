package realfusion.proxy;


import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import realfusion.RealFusion;
import realfusion.block.BlockTokamakController;
import realfusion.init.RealFusionBlocks;


@Mod.EventBusSubscriber(modid = RealFusion.MODID)
public class CommonProxy {


    public void preInit(){
        RealFusionBlocks.init();
    }


    public void init() {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(RealFusionBlocks.blockTokamakController);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(RealFusionBlocks.blockTokamakController).setRegistryName(RealFusionBlocks.blockTokamakController.getRegistryName()));

    }




}
