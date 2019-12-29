package br.com.finalcraft.estfuture.common.blocks.blocks;

import br.com.finalcraft.estfuture.common.items.block.ItemBlockConcrete;
import br.com.finalcraft.estfuture.common.utils.EnumDyeColor;
import cpw.mods.fml.common.registry.GameRegistry;

import java.util.HashMap;

public class ConcreteRegistry {

	public static HashMap<EnumDyeColor, BlockConcretePowder> concretePowders = new HashMap<EnumDyeColor, BlockConcretePowder>();
	public static HashMap<EnumDyeColor, BlockConcrete> concretes = new HashMap<EnumDyeColor, BlockConcrete>();
	
	public static void init(){
		for(EnumDyeColor color : EnumDyeColor.values()){
			concretePowders.put(color, new BlockConcretePowder(color));
			GameRegistry.registerBlock(concretePowders.get(color), ItemBlockConcrete.class, "concrete_powder_" + color.getUnlocalizedName());
			concretes.put(color, new BlockConcrete(color));
			GameRegistry.registerBlock(concretes.get(color), ItemBlockConcrete.class, "concrete_" + color.getUnlocalizedName());
		}
	}
	
	public static BlockConcretePowder getPowderFromDye(EnumDyeColor dye){
		return concretePowders.get(dye);
	}
	
	public static BlockConcrete getSolidFromDye(EnumDyeColor dye){
		return concretes.get(dye);
	}
	
}
