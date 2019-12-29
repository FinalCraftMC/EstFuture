package br.com.finalcraft.estfuture.common.blocks.blocks;

import br.com.finalcraft.estfuture.EstFuture;
import br.com.finalcraft.estfuture.common.COREBlocks;
import br.com.finalcraft.estfuture.common.items.block.ItemBlockRedSandstone;
import br.com.finalcraft.estfuture.common.utils.Utils;
import net.minecraft.block.BlockSandStone;
import net.minecraft.item.ItemBlock;

public class RedSandstone extends BlockSandStone implements COREBlocks.ISubBlocksBlock {

	public RedSandstone() {
		setHardness(0.8F);
		setBlockTextureName("red_sandstone");
		setBlockName(Utils.getUnlocalisedName("red_sandstone"));
		this.setCreativeTab(EstFuture.tabBlocksItems);
	}

	@Override
	public Class<? extends ItemBlock> getItemBlockClass() {
		return ItemBlockRedSandstone.class;
	}
}