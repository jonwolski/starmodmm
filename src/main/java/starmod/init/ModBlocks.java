package starmod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import starmod.blocks.BlockBase;
import starmod.blocks.BlockOverworld;

public class ModBlocks {

	
public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block MOSS_BLOCK = new BlockBase("moss_block", Material.IRON);

public static final Block MOSS_OVERWORLD = new BlockOverworld("moss_overworld", Material.IRON);
}