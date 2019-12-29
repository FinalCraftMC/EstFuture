package br.com.finalcraft.estfuture.common.blocks.blocks;

import br.com.finalcraft.estfuture.EstFuture;
import br.com.finalcraft.estfuture.common.COREBlocks;
import br.com.finalcraft.estfuture.common.utils.Utils;
import net.minecraft.block.material.Material;

public class RedSandstoneSlab extends GenericSlab {

	public RedSandstoneSlab() {
		super(Material.rock, COREBlocks.red_sandstone);
		setResistance(30);
		setHardness(2.0F);
		setBlockName(Utils.getUnlocalisedName("red_sandstone_slab"));
		this.setCreativeTab(EstFuture.tabBlocksItems);
	}
}