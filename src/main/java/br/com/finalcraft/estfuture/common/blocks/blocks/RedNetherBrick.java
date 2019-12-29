package br.com.finalcraft.estfuture.common.blocks.blocks;

import br.com.finalcraft.estfuture.EstFuture;
import br.com.finalcraft.estfuture.common.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RedNetherBrick extends Block {

	public RedNetherBrick()
	{
		super(Material.rock);
		setHardness(2F);
		setResistance(10F);
		setStepSound(soundTypePiston);
		this.setHarvestLevel("pickaxe", 0);
		setBlockTextureName("red_nether_brick");
		setBlockName(Utils.getUnlocalisedName("red_netherbrick"));
		this.setCreativeTab(EstFuture.tabBlocksItems);
	}
}
