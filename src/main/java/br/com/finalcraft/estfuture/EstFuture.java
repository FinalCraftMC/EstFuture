package br.com.finalcraft.estfuture;

import br.com.finalcraft.estfuture.client.creativetab.EFCreativeTab;
import br.com.finalcraft.estfuture.common.lib.Reference;
import br.com.finalcraft.estfuture.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID,
        name = Reference.MOD_NAME,
        version = Reference.VERSION_NUMBER)
public class EstFuture {

    public static CreativeTabs tabBlocksItems = new EFCreativeTab(CreativeTabs.getNextID(), Reference.MOD_ID, "itemGroup.estfuture");

    public static Logger logger;
    @Instance
    public static EstFuture instance = new EstFuture();

    @SidedProxy(clientSide="br.com.finalcraft.estfuture.proxy.ClientProxy", serverSide="br.com.finalcraft.estfuture.proxy.ServerProxy")
    public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        logger = e.getModLog();
        proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
