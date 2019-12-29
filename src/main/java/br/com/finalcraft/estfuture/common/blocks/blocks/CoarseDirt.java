package br.com.finalcraft.estfuture.common.blocks.blocks;

import br.com.finalcraft.estfuture.EstFuture;
import br.com.finalcraft.estfuture.common.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class CoarseDirt extends Block {

	public CoarseDirt() {
		super(Material.ground);
		setHardness(0.5F);
		setHarvestLevel("shovel", 0);
		setStepSound(soundTypeGravel);
		setBlockTextureName("coarse_dirt");
		setBlockName(Utils.getUnlocalisedName("coarse_dirt"));
		this.setCreativeTab(EstFuture.tabBlocksItems);
	}

	@Override
	public boolean canSustainPlant(IBlockAccess world, int x, int y, int z, ForgeDirection direction, IPlantable plant) {
		return Blocks.dirt.canSustainPlant(world, x, y, z, direction, plant);
	}
}