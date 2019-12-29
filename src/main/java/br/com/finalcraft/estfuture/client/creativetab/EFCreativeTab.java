package br.com.finalcraft.estfuture.client.creativetab;

import br.com.finalcraft.estfuture.common.COREBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EFCreativeTab extends CreativeTabs {

    private String label;

    public EFCreativeTab(int id, String modid, String label) {
        super(id, modid);
        this.label = label;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getIconItemStack() {
        ItemStack itemStack = new ItemStack(COREBlocks.sea_lantern);
        return itemStack;
    }

    @Override
    public Item getTabIconItem() {
        return null;
    }

    @Override
    public String getTabLabel() {
        return this.label;
    }
}
