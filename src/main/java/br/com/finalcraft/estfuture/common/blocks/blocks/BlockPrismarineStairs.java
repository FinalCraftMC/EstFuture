package br.com.finalcraft.estfuture.common.blocks.blocks;

import br.com.finalcraft.estfuture.EstFuture;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class BlockPrismarineStairs extends BlockStairs{
    Block refBlock;
    int refMeta;
    
    public BlockPrismarineStairs(final Block block, final int meta) {
        super(block, meta);
        this.refBlock = block;
        this.refMeta = meta;
        this.setLightOpacity(0);
        this.setCreativeTab(EstFuture.tabBlocksItems);
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(final IBlockAccess ba, final int x, final int y, final int z, final int side) {
        /*if (this.refBlock == ModBlocks.prismarine && this.refMeta == 5) {
            return this.refBlock.getIcon(ba, x, y, z, side + 100);
        }*/
        return this.refBlock.getIcon(side, this.refMeta);
    }
}
