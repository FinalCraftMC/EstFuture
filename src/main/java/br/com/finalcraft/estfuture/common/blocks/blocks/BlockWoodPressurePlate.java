package br.com.finalcraft.estfuture.common.blocks.blocks;

import br.com.finalcraft.estfuture.EstFuture;
import br.com.finalcraft.estfuture.common.utils.Utils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

public class BlockWoodPressurePlate extends BlockPressurePlate {

	private final int meta;

	public BlockWoodPressurePlate(int meta) {
		super("planks_oak", Material.wood, BlockPressurePlate.Sensitivity.everything);
		this.meta = meta;
		disableStats();
		setHardness(0.5F);
		setStepSound(soundTypeWood);
		setBlockName(Utils.getUnlocalisedName("pressure_plate_" + BlockWoodDoor.names[meta]));
		this.setCreativeTab(EstFuture.tabBlocksItems);
		
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return Blocks.planks.getIcon(side, this.meta);
	}
}