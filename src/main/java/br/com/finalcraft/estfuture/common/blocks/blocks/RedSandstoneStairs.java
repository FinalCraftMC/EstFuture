package br.com.finalcraft.estfuture.common.blocks.blocks;

import br.com.finalcraft.estfuture.EstFuture;
import br.com.finalcraft.estfuture.common.COREBlocks;
import br.com.finalcraft.estfuture.common.utils.Utils;
import net.minecraft.block.BlockStairs;

public class RedSandstoneStairs extends BlockStairs{

	public RedSandstoneStairs() {
		super(COREBlocks.red_sandstone, 0);
		setHardness(0.8F);
		setLightOpacity(0);
		setBlockName(Utils.getUnlocalisedName("red_sandstone_stairs"));
		this.setCreativeTab(EstFuture.tabBlocksItems);
	}
}