package greenwolf13.magecraft;

import cpw.mods.fml.common.IWorldGenerator;
import java.util.Random;
import greenwolf13.magecraft.*;
import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;
 
public class WorldgeneratorMageCraft implements IWorldGenerator {
        private static final int SHALLOW = 60;
        private static final int DEEP = 30;
        private static final int CHUNK_SIZE = 16;
 
        public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
                switch (world.provider.dimensionId) {
                        case -1:
                                generateNether(world, random, chunkX*CHUNK_SIZE, chunkZ*CHUNK_SIZE);
                                break;
                        case 0:
                                generateSurface(world, random, chunkX*CHUNK_SIZE, chunkZ*CHUNK_SIZE);
                                break;
                }
        }
 
        private void generateSurface(World world, Random random, int blockX, int blockZ) {
                //(new WorldGenMinable(blockLeadOreMageCraft.2621, 10)).generate(world, random, blockX + random.nextInt(CHUNK_SIZE), random.nextInt(SHALLOW), blockZ + random.nextInt(CHUNK_SIZE));
              //  (new WorldGenMinable(blockSilverOreMageCraft.2622, 5)).generate(world, random, blockX + random.nextInt(CHUNK_SIZE), random.nextInt(DEEP), blockZ + random.nextInt(CHUNK_SIZE));
                (new WorldGenMinable(2623, 10)).generate(world, random, blockX + random.nextInt(CHUNK_SIZE), random.nextInt(SHALLOW), blockZ + random.nextInt(CHUNK_SIZE));
                (new WorldGenMinable(2624, 10)).generate(world, random, blockX + random.nextInt(CHUNK_SIZE), random.nextInt(SHALLOW), blockZ + random.nextInt(CHUNK_SIZE));
                (new WorldGenMinable(2625, 10)).generate(world, random, blockX + random.nextInt(CHUNK_SIZE), random.nextInt(SHALLOW), blockZ + random.nextInt(CHUNK_SIZE));
                (new WorldGenMinable(2626, 10)).generate(world, random, blockX + random.nextInt(CHUNK_SIZE), random.nextInt(SHALLOW), blockZ + random.nextInt(CHUNK_SIZE));
                (new WorldGenMinable(2627, 10)).generate(world, random, blockX + random.nextInt(CHUNK_SIZE), random.nextInt(SHALLOW), blockZ + random.nextInt(CHUNK_SIZE));
                (new WorldGenMinable(2628, 10)).generate(world, random, blockX + random.nextInt(CHUNK_SIZE), random.nextInt(SHALLOW), blockZ + random.nextInt(CHUNK_SIZE));
                (new WorldGenMinable(2629, 10)).generate(world, random, blockX + random.nextInt(CHUNK_SIZE), random.nextInt(SHALLOW), blockZ + random.nextInt(CHUNK_SIZE));
                (new WorldGenMinable(2630, 10)).generate(world, random, blockX + random.nextInt(CHUNK_SIZE), random.nextInt(SHALLOW), blockZ + random.nextInt(CHUNK_SIZE));
                (new WorldGenMinable(2631, 10)).generate(world, random, blockX + random.nextInt(CHUNK_SIZE), random.nextInt(SHALLOW), blockZ + random.nextInt(CHUNK_SIZE));
               // (new WorldGenMinable(blockSulphurOreMageCraft.2632, 10)).generate(world, random, blockX + random.nextInt(CHUNK_SIZE), random.nextInt(SHALLOW), blockZ + random.nextInt(CHUNK_SIZE));
               // (new WorldGenMinable(blockLimestoneOreMageCraft.2633, 10)).generate(world, random, blockX + random.nextInt(CHUNK_SIZE), random.nextInt(SHALLOW), blockZ + random.nextInt(CHUNK_SIZE));
        }
 
        private void generateNether(World world, Random random, int blockX, int blockZ) {
 
        }
}