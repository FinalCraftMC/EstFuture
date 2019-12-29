package br.com.finalcraft.estfuture.common.blocks.blocks;

import br.com.finalcraft.estfuture.EstFuture;
import br.com.finalcraft.estfuture.common.COREBlocks;
import br.com.finalcraft.estfuture.common.items.block.ItemBlockGeneric;
import net.minecraft.block.BlockColored;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class ConcreteBlock extends BlockColored implements COREBlocks.ISubBlocksBlock {
	
	public ConcreteBlock()
	{
		super(Material.rock);
		setHardness(1.5F);
		setResistance(10F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 0);
		setBlockTextureName("concrete");
		setBlockName("estfuture.concrete");
		this.setCreativeTab(EstFuture.tabBlocksItems);
	}

	@Override
	public Class<? extends ItemBlock> getItemBlockClass() {
		return ItemBlockGeneric.class;
	}

}
