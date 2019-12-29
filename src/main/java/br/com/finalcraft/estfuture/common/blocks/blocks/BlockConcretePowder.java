package br.com.finalcraft.estfuture.common.blocks.blocks;

import br.com.finalcraft.estfuture.EstFuture;
import br.com.finalcraft.estfuture.common.COREBlocks;
import br.com.finalcraft.estfuture.common.entities.EntityFallingConcrete;
import br.com.finalcraft.estfuture.common.items.block.ItemBlockConcretePowder;
import br.com.finalcraft.estfuture.common.utils.EnumDyeColor;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class BlockConcretePowder extends BlockFalling implements COREBlocks.ISubBlocksBlock{

	private int nIcons = EnumDyeColor.values().length;
	public IIcon[] icons = new IIcon[nIcons];

	public BlockConcretePowder() {
		super(Material.sand);
		this.setBlockName("estfuture.concrete_powder");
		this.setStepSound(soundTypeSand);
		this.setCreativeTab(EstFuture.tabBlocksItems);
		this.setHardness(0.5F);
		this.setResistance(2.5F);
		this.setBlockTextureName("concrete_powder");
	}

	public void updateTick(World worldIn, int x, int y, int z, Random rand) {
		if(!worldIn.isRemote) {
			this.func_149830_m(worldIn, x, y, z);
		}
	}
	
	private void func_149830_m(World p_149830_1_, int p_149830_2_, int p_149830_3_, int p_149830_4_) {
		if(func_149831_e(p_149830_1_, p_149830_2_, p_149830_3_ - 1, p_149830_4_) && p_149830_3_ >= 0) {
			byte b0 = 32;

			if(!fallInstantly && p_149830_1_.checkChunksExist(p_149830_2_ - b0, p_149830_3_ - b0, p_149830_4_ - b0, p_149830_2_ + b0, p_149830_3_ + b0, p_149830_4_ + b0)) {
				if(!p_149830_1_.isRemote) {
					EntityFallingConcrete entityfallingblock = new EntityFallingConcrete(p_149830_1_, (double)((float)p_149830_2_ + 0.5F), (double)((float)p_149830_3_ + 0.5F), (double)((float)p_149830_4_ + 0.5F), this, p_149830_1_.getBlockMetadata(p_149830_2_, p_149830_3_, p_149830_4_));
					this.func_149829_a(entityfallingblock);
					p_149830_1_.spawnEntityInWorld(entityfallingblock);
				}
			} else {
				p_149830_1_.setBlockToAir(p_149830_2_, p_149830_3_, p_149830_4_);

				while(func_149831_e(p_149830_1_, p_149830_2_, p_149830_3_ - 1, p_149830_4_) && p_149830_3_ > 0) {
					--p_149830_3_;
				}

				if(p_149830_3_ > 0) {
					p_149830_1_.setBlock(p_149830_2_, p_149830_3_, p_149830_4_, this);
				}
			}
		}
	}
	
	protected void onStartFalling(EntityFallingBlock fallingEntity){}
	
	public static boolean canFallThrough(World worldIn, int x, int y, int z) {
		Block block = worldIn.getBlock(x, y, z);
		Material material = block.getMaterial();
		return block == Blocks.fire || material == Material.air || material == Material.water || material == Material.lava;
	}
	
	public void onEndFalling(World worldIn, int x, int y, int z){}

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
		return ItemBlockConcretePowder.class;
	}
}
