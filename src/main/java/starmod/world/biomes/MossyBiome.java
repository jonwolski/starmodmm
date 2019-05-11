package starmod.world.biomes;


import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.world.biome.Biome;
import starmod.init.ModBlocks;

public class MossyBiome extends Biome {

	public MossyBiome() {
		super(new BiomeProperties("Mossybiome").setBaseHeight(1.0F).setHeightVariation(0.5F).setTemperature(0.2F).setRainfall(0.8F).setWaterColor(13120767));
		
		topBlock = ModBlocks.MOSS_BLOCK.getDefaultState();
		fillerBlock = ModBlocks.MOSS_OVERWORLD.getDefaultState();
		
		this.decorator.treesPerChunk = 2;
		this.decorator.cactiPerChunk = 4;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityOcelot.class, 10, 1, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityParrot.class, 10, 2, 6));
	}

}
