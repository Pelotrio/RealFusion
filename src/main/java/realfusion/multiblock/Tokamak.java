package realfusion.multiblock;

import com.jcraft.jogg.Packet;
import nc.multiblock.IMultiblockPart;
import nc.multiblock.MultiblockBase;
import nc.multiblock.TileBeefBase;
import nc.multiblock.cuboidal.CuboidalMultiblockBase;
import nc.multiblock.network.MultiblockUpdatePacket;
import nc.multiblock.validation.IMultiblockValidator;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class Tokamak extends CuboidalMultiblockBase<MultiblockUpdatePacket> {


    protected Tokamak(World world) {
        super(world);
    }

    @Override
    protected int getMinimumInteriorLength() {
        return 0;
    }

    @Override
    protected int getMaximumInteriorLength() {
        return 0;
    }

    @Override
    public void onAttachedPartWithMultiblockData(IMultiblockPart iMultiblockPart, NBTTagCompound nbtTagCompound) {

    }

    @Override
    protected void onBlockAdded(IMultiblockPart iMultiblockPart) {

    }

    @Override
    protected void onBlockRemoved(IMultiblockPart iMultiblockPart) {

    }

    @Override
    protected void onMachineAssembled() {

    }

    @Override
    protected void onMachineRestored() {

    }

    @Override
    protected void onMachinePaused() {

    }

    @Override
    protected void onMachineDisassembled() {

    }

    @Override
    protected void onAssimilate(MultiblockBase multiblockBase) {

    }

    @Override
    protected void onAssimilated(MultiblockBase multiblockBase) {

    }

    @Override
    protected boolean updateServer() {
        return false;
    }

    @Override
    protected void updateClient() {

    }

    @Override
    protected boolean isBlockGoodForInterior(World world, int i, int i1, int i2, IMultiblockValidator iMultiblockValidator) {
        return false;
    }

    @Override
    protected void syncDataFrom(NBTTagCompound nbtTagCompound, TileBeefBase.SyncReason syncReason) {

    }

    @Override
    protected void syncDataTo(NBTTagCompound nbtTagCompound, TileBeefBase.SyncReason syncReason) {

    }

    @Override
    protected MultiblockUpdatePacket getUpdatePacket() {
        return null;
    }

    @Override
    public void onPacket(MultiblockUpdatePacket packet) {

    }
}
