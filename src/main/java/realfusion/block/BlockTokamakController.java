package realfusion.block;

import nc.block.NCBlock;
import nc.init.NCBlocks;
import nc.tab.NCTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.apache.logging.log4j.Level;
import realfusion.RealFusion;

import static java.lang.Math.*;


public class BlockTokamakController extends NCBlock {

    private boolean clicked = false;

    public BlockTokamakController() {
        super(Material.ANVIL);
        this.setUnlocalizedName(RealFusion.MODID + ".tokamak_controller");
        this.setRegistryName("tokamak_controller");
        this.setCreativeTab(CreativeTabs.MISC);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote){
            if(!clicked){
                for (double d = 0; d <= 2*PI; d+=0.01){
                    for (double e = 0; e <= 2*PI; e+=0.01){
                        double x = (5.9 + 2*cos(d))*cos(e);
                        double y = 3*sin(d);
                        double z = (5.9 + 2*cos(d))*sin(e);
                        worldIn.setBlockState(pos.add(x ,y ,z), NCBlocks.fusion_electromagnet_active.getDefaultState());
                    }
                }
            }else {
                for (double d = 0; d <= 2*PI; d+=0.01){
                    for (double e = 0; e <= 2*PI; e+=0.01){
                        double x = (5.9 + 2*cos(d))*cos(e);
                        double y = 3*sin(d);
                        double z = (5.9 + 2*cos(d))*sin(e);
                        worldIn.setBlockState(pos.add(x ,y ,z), Blocks.AIR.getDefaultState());
                    }
                }
            }
            RealFusion.logger.log(Level.DEBUG, "Clicked");
            clicked = !clicked;
        }

        return true;
    }



}
