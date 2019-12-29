package br.com.finalcraft.estfuture.proxy;

import br.com.finalcraft.estfuture.common.COREBlocks;
import br.com.finalcraft.estfuture.common.tileentities.TileEntityEndRod;
import br.com.finalcraft.estfuture.common.utils.Utils;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        COREBlocks.init();
    }

    public void init(FMLInitializationEvent e) {
        GameRegistry.registerTileEntity(TileEntityEndRod.class, Utils.getUnlocalisedName("end_rod"));
    }

    public void postInit(FMLPostInitializationEvent e) {

    }

}
