package br.com.finalcraft.estfuture.common.blocks.blocks;

import br.com.finalcraft.estfuture.EstFuture;
import br.com.finalcraft.estfuture.common.COREBlocks;
import br.com.finalcraft.estfuture.common.items.block.ItemBlockConcrete;
import br.com.finalcraft.estfuture.common.utils.EnumDyeColor;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockConcrete extends Block implements COREBlocks.ISubBlocksBlock {

	private int nIcons = 16;
	public IIcon[] icons = new IIcon[nIcons];

	public BlockConcrete() {
		super(Material.rock);
		this.setBlockName("estfuture.concrete");
		this.setBlockTextureName("concrete");
		this.setCreativeTab(EstFuture.tabBlocksItems);
		this.setHardness(1.8F);
		this.setHarvestLevel("pickaxe", 0);
		this.setResistance(9.0F);
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		if (meta >= nIcons)
			meta = 0;
		return this.icons[meta];
	}

	@Override
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i < nIcons; i ++) {
			this.icons[i] = reg.registerIcon(this.textureName + "_" + EnumDyeColor.byMetadata(i).getName());
		}
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}

	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < nIcons; i ++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public Class<? extends ItemBlock> getItemBlockClass() {
		return ItemBlockConcrete.class;
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}
}
