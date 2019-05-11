package starmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockOverworld extends BlockBase {

	public BlockOverworld(String name, Material material) {
		
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 8);
		setLightLevel(0.0F);
		setTransparency(1);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		
	}

	private void setTransparency(int i) {
		
	}

}
