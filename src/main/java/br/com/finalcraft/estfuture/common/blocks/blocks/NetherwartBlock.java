package br.com.finalcraft.estfuture.common.blocks.blocks;

import br.com.finalcraft.estfuture.EstFuture;
import br.com.finalcraft.estfuture.common.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NetherwartBlock extends Block {

	public NetherwartBlock()
	{
		super(Material.grass);
		setHardness(1F);
		setResistance(5F);
		setStepSound(soundTypeWood);
		setBlockTextureName("nether_wart_block");
		setBlockName(Utils.getUnlocalisedName("nether_wart"));
		this.setCreativeTab(EstFuture.tabBlocksItems);
	}

	
}
