package br.com.finalcraft.estfuture.common.blocks.blocks;

import br.com.finalcraft.estfuture.EstFuture;
import br.com.finalcraft.estfuture.common.COREBlocks;
import br.com.finalcraft.estfuture.common.utils.Utils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class PrismarineSlabDark extends GenericSlab {

	public PrismarineSlabDark() {
		super(Material.rock, COREBlocks.prismarine);
		setHardness(1.5F);
		setResistance(10.0F);
		setBlockName(Utils.getUnlocalisedName("prismarine_slab_dark"));
		this.setCreativeTab(EstFuture.tabBlocksItems);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return base.getIcon(side, 2);
	}
}