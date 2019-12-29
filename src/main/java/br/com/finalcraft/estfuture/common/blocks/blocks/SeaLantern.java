package br.com.finalcraft.estfuture.common.blocks.blocks;

import br.com.finalcraft.estfuture.EstFuture;
import br.com.finalcraft.estfuture.common.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.util.MathHelper;

import java.util.Random;

public class SeaLantern extends Block {

	public SeaLantern() {
		super(Material.glass);
		setHardness(0.3F);
		setLightLevel(1.0F);
		setStepSound(soundTypeGlass);
		setBlockTextureName("sea_lantern");
		setBlockName(Utils.getUnlocalisedName("sea_lantern"));
		this.setCreativeTab(EstFuture.tabBlocksItems);
	}

	@Override
	public int quantityDropped(Random random) {
		return 2 + random.nextInt(2);
	}

	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		return MathHelper.clamp_int(this.quantityDropped(random) + random.nextInt(fortune + 1), 1, 5);
	}

	@Override
	public MapColor getMapColor(int meta) {
		return MapColor.quartzColor;
	}

	@Override
	protected boolean canSilkHarvest() {
		return true;
	}
}