package br.com.finalcraft.estfuture.common;

import br.com.finalcraft.estfuture.common.blocks.blocks.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWood;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;

import java.lang.reflect.Field;

public final class COREBlocks {

    public static final Block stone = new Stone();
    public static final Block iron_trapdoor = new IronTrapdoor();
    public static final Block prismarine = new PrismarineBlocks();
    public static final Block sea_lantern = new SeaLantern();
    public static final Block red_sandstone = new RedSandstone();
    public static final Block red_sandstone_slab = new RedSandstoneSlab();
    public static final Block red_sandstone_stairs = new RedSandstoneStairs();
    public static final Block coarse_dirt = new CoarseDirt();
    public static final Block slime = new SlimeBlock();
    public static final Block purpur_block = new PurpurBlock();
    public static final Block purpur_pillar = new PurpurPillar();
    public static final Block purpur_stairs = new PurpurStairs();
    public static final Block purpur_slab = new PurpurSlab();
    public static final Block end_bricks = new EndBricks();
    public static final Block end_rod = new EndRod();
    public static final Block frosted_ice = new FrostedIce();

    public static final Block bone = new BoneBlock();
    public static final Block magma = new MagmaBlock();
    public static final Block redNB = new RedNetherBrick();
    public static final Block netherwart = new NetherwartBlock();

    //public static final Block concrete = new ConcreteBlock();

    //do prismarine slab/stairs
    public static final Block prismarineStairsRough = new BlockPrismarineStairs(prismarine, 0).setBlockName("prismarine_stairs");
    public static final Block prismarineStairsBrick = new BlockPrismarineStairs(prismarine, 1).setBlockName("prismarine_stairs_brick");
    public static final Block prismarineStairsDark = new BlockPrismarineStairs(prismarine, 2).setBlockName("prismarine_stairs_dark");
    public static final Block prismarineSlabRough = new PrismarineSlab();
    public static final Block prismarineSlabBrick = new PrismarineSlabBrick();
    public static final Block prismarineSlabDark = new PrismarineSlabDark();

    //wood trapdoors, buttons, pressure plates

    public static final Block log_bark = new BlockWoodBark();


    public static final Block[] doors = new Block[BlockWood.field_150096_a.length - 1];
    public static final Block[] fences = new Block[BlockWood.field_150096_a.length];
    public static final Block[] gates = new Block[BlockWood.field_150096_a.length - 1];

    public static final Block[] pressurePlates = new Block[BlockWood.field_150096_a.length - 1];
    public static final Block[] buttons = new Block[BlockWood.field_150096_a.length - 1];
    public static final Block[] trapdoors = new Block[BlockWood.field_150096_a.length - 1];

    static {
        for (int i = 0; i < doors.length; i++)
            doors[i] = new BlockWoodDoor(i + 1);

        for (int i = 0; i < fences.length; i++)
            fences[i] = new BlockWoodFence(i);

        for (int i = 0; i < gates.length; i++)
            gates[i] = new BlockWoodFenceGate(i + 1);

        for (int i = 0; i < pressurePlates.length; i++)
            pressurePlates[i] = new BlockWoodPressurePlate(i + 1);

        for (int i = 0; i < buttons.length; i++)
            buttons[i] = new BlockWoodButton(i + 1);

        for (int i = 0; i < trapdoors.length; i++)
            trapdoors[i] = new BlockWoodTrapdoor(i + 1);
    }

    public static final void init() {

        ConcreteRegistry.init();

        try {
            for (Field f : COREBlocks.class.getDeclaredFields()) {
                Object obj = f.get(null);
                if (obj instanceof Block)
                    registerBlock((Block) obj);
                else if (obj instanceof Block[])
                    for (Block block : (Block[]) obj)
                        if (block != null)
                            registerBlock(block);
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

    private static void registerBlock(Block block) {
        String name = block.getUnlocalizedName();
        String[] strings = name.split("\\.");

        if (block instanceof ISubBlocksBlock)
            GameRegistry.registerBlock(block, ((ISubBlocksBlock) block).getItemBlockClass(), strings[strings.length - 1]);
        else
            GameRegistry.registerBlock(block, strings[strings.length - 1]);

        if (block instanceof IBurnableBlock)
            Blocks.fire.setFireInfo(block, 5, 20);
    }

    public static interface ISubBlocksBlock {
        Class<? extends ItemBlock> getItemBlockClass();
    }

    public static interface IBurnableBlock {
    }
}
