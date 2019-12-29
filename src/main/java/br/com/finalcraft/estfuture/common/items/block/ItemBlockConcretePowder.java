package br.com.finalcraft.estfuture.common.items.block;

import br.com.finalcraft.estfuture.common.utils.EnumDyeColor;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemBlockConcretePowder extends ItemBlockWithMetadata {

	public ItemBlockConcretePowder(Block block) {
		super(block, block);
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return this.getUnlocalizedName() + "_" + EnumDyeColor.byMetadata(stack.getItemDamage()).getUnlocalizedName();
	}
	
}
