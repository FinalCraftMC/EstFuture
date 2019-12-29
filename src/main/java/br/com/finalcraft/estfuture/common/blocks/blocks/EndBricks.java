package br.com.finalcraft.estfuture.common.blocks.blocks;

import br.com.finalcraft.estfuture.EstFuture;
import br.com.finalcraft.estfuture.common.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.world.IBlockAccess;

public class EndBricks extends Block {

	public EndBricks() {
		super(Material.rock);
		setHardness(3.0F);
		setResistance(15.0F);
		setStepSound(soundTypePiston);
		setBlockTextureName("end_bricks");
		setBlockName(Utils.getUnlocalisedName("end_bricks"));
		this.setCreativeTab(EstFuture.tabBlocksItems);
	}

	@Override
	public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity) {
		return !(entity instanceof EntityDragon);
	}
}