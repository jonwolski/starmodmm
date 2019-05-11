package starmod.init;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import starmod.world.biomes.MossyBiome;


public class ModBiomes {
	
	public static final Biome MOSSYBIOME = new MossyBiome();
	
	public static void registerBiomes() {
		initBiome(MOSSYBIOME, "Starbiome",BiomeType.WARM, Type.BEACH, Type.HILLS, Type.MOUNTAIN, Type.LUSH);
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type...types) {
		
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
		BiomeManager.addSpawnBiome(biome);
		return biome;
		
	}
}
