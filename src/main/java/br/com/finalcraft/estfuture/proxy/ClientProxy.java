package br.com.finalcraft.estfuture.proxy;

import br.com.finalcraft.estfuture.client.handler.ClientEventHandler;
import br.com.finalcraft.estfuture.client.renderer.block.BlockDoorRenderer;
import br.com.finalcraft.estfuture.client.renderer.block.BlockEndRodRender;
import br.com.finalcraft.estfuture.client.renderer.block.BlockSlimeBlockRender;
import br.com.finalcraft.estfuture.client.renderer.tileentity.TileEntityEndRodRenderer;
import br.com.finalcraft.estfuture.common.tileentities.TileEntityEndRod;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy{

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        registerRenderers();
    }

    public void registerRenderers() {
        registerBlockRenderers();
    }

    private void registerBlockRenderers() {
        RenderingRegistry.registerBlockHandler(new BlockSlimeBlockRender());
        RenderingRegistry.registerBlockHandler(new BlockDoorRenderer());

        RenderingRegistry.registerBlockHandler(new BlockEndRodRender());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEndRod.class, new TileEntityEndRodRenderer());
    }


    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        FMLCommonHandler.instance().bus().register(ClientEventHandler.INSTANCE);
        MinecraftForge.EVENT_BUS.register(ClientEventHandler.INSTANCE);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }



}
