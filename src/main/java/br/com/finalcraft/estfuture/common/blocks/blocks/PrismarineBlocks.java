package br.com.finalcraft.estfuture.common.blocks.blocks;

import br.com.finalcraft.estfuture.EstFuture;
import br.com.finalcraft.estfuture.common.utils.Utils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class PrismarineBlocks extends BlockGeneric{

	public PrismarineBlocks() {
		super(Material.rock, "rough", "bricks", "dark");
		setHardness(1.5F);
		setResistance(10.0F);
		setBlockTextureName("prismarine");
		setBlockName(Utils.getUnlocalisedName("prismarine_block"));
		this.setCreativeTab(EstFuture.tabBlocksItems);
	}

	@SideOnly(Side.CLIENT)
	public void setIcon(int index, IIcon icon) {
		if (icons == null)
			icons = new IIcon[types.length];

		icons[index] = icon;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg) {
		if (icons == null)
			icons = new IIcon[types.length];

		for (int i = 1; i < types.length; i++)
			if ("".equals(types[i]))
				icons[i] = reg.registerIcon(getTextureName());
			else
				icons[i] = reg.registerIcon(getTextureName() + "_" + types[i]);
	}

}