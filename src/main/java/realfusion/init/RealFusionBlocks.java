package realfusion.init;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;
import realfusion.RealFusion;
import realfusion.block.BlockTokamakController;


@GameRegistry.ObjectHolder(RealFusion.MODID)
public class RealFusionBlocks {

    public static Block blockTokamakController;

    public static void init(){
        blockTokamakController = new BlockTokamakController();
    }



}
