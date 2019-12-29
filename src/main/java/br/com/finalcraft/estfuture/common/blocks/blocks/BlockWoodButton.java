package br.com.finalcraft.estfuture.common.blocks.blocks;

import br.com.finalcraft.estfuture.EstFuture;
import br.com.finalcraft.estfuture.common.COREBlocks;
import br.com.finalcraft.estfuture.common.utils.Utils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockButtonWood;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

public class BlockWoodButton extends BlockButtonWood implements COREBlocks.IBurnableBlock {

	private final int meta;

	public BlockWoodButton(int meta) {
		this.meta = meta;
		setBlockName(Utils.getUnlocalisedName("button_" + BlockWoodDoor.names[meta]));
		this.setCreativeTab(EstFuture.tabBlocksItems);
		
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return Blocks.planks.getIcon(side, this.meta);
	}

}
