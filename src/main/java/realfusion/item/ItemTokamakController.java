package realfusion.item;

import nc.tab.NCTabs;
import net.minecraft.item.Item;
import realfusion.RealFusion;

public class ItemTokamakController extends Item {

    public ItemTokamakController() {
        setRegistryName("tokamak_controller");
        setUnlocalizedName(RealFusion.MODID+".tokamak_controller");
        setCreativeTab(NCTabs.FUSION);
    }




}
