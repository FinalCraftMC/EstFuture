package br.com.finalcraft.estfuture.client.handler;

import br.com.finalcraft.estfuture.client.PrismarineIcon;
import br.com.finalcraft.estfuture.common.COREBlocks;
import br.com.finalcraft.estfuture.common.blocks.blocks.PrismarineBlocks;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraftforge.client.event.TextureStitchEvent;

public class ClientEventHandler {

	public static final ClientEventHandler INSTANCE = new ClientEventHandler();

	private ClientEventHandler() {
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void loadTextures(TextureStitchEvent.Pre event) {
		if (event.map.getTextureType() == 0) {
			TextureAtlasSprite icon = new PrismarineIcon("prismarine_rough");
			if (event.map.setTextureEntry("prismarine_rough", icon))
				((PrismarineBlocks) COREBlocks.prismarine).setIcon(0, icon);
			else
				((PrismarineBlocks) COREBlocks.prismarine).setIcon(0, event.map.registerIcon("prismarine_rough"));
		}
	}

}