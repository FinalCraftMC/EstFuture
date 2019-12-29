package br.com.finalcraft.estfuture.common.blocks.blocks;

import br.com.finalcraft.estfuture.EstFuture;
import br.com.finalcraft.estfuture.common.utils.EnumDyeColor;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockConcrete extends Block {

	private EnumDyeColor color;
	
	public BlockConcrete(EnumDyeColor color) {
		super(Material.rock);
		this.color = color;
		this.setBlockName("estfuture.concrete_" + this.color);
		this.setCreativeTab(EstFuture.tabBlocksItems);
		this.setHardness(1.8F);
		this.setHarvestLevel("pickaxe", 0);
		this.setResistance(9.0F);
		this.setBlockTextureName("concrete_" + this.color.getName());
	}
	
	public EnumDyeColor getColor() {
		return this.color;
	}
	
}
