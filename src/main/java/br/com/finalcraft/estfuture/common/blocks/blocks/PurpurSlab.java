package br.com.finalcraft.estfuture.common.blocks.blocks;

import br.com.finalcraft.estfuture.EstFuture;
import br.com.finalcraft.estfuture.common.COREBlocks;
import br.com.finalcraft.estfuture.common.utils.Utils;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.world.IBlockAccess;

public class PurpurSlab extends GenericSlab {

	public PurpurSlab() {
		super(Material.rock, COREBlocks.purpur_block);
		setResistance(30);
		setHardness(2.0F);
		setBlockName(Utils.getUnlocalisedName("purpur_slab"));
		this.setCreativeTab(EstFuture.tabBlocksItems);
	}

	@Override
	public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity) {
		return !(entity instanceof EntityDragon);
	}
}