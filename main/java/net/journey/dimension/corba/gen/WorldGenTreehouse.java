package net.journey.dimension.corba.gen;

import java.util.Random;

import net.journey.JourneyBlocks;
import net.journey.entity.mob.corba.npc.EntityOvergrownMerchant;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.slayer.api.worldgen.WorldGenAPI;

public class WorldGenTreehouse extends WorldGenerator {
	
	public boolean locationIsValidSpawn(World w, int x, int y, int z) {
		for(int i = 0; i < 11; i++) {
			for(int l = 0; l < 11; l++) {
				if(w.getBlockState(new BlockPos(x + i, y, z + l)) != JourneyBlocks.corbaGrass) {
					return false;
				}
			}
		}
		return true;
	}
	
	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {
		int i = pos.getX(), j = pos.getY(), k = pos.getZ();
		if(locationIsValidSpawn(world, i, j, k)) return true;
		IBlockState leaves = WorldGenAPI.getCorbaLeaves().getDefaultState(), log = WorldGenAPI.getCorbaLog().getDefaultState();
		i-=5;
		k-=5;
			world.setBlockState(new BlockPos(i + 0, j + 14, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 0, j + 14, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 0, j + 14, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 1, j + 14, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 1, j + 14, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 1, j + 14, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 1, j + 14, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 1, j + 14, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 1, j + 14, k + 8), leaves);
			world.setBlockState(new BlockPos(i + 1, j + 15, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 1, j + 15, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 1, j + 16, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 2, j + 6, k + 4), log);
			world.setBlockState(new BlockPos(i + 2, j + 6, k + 5), log);
			world.setBlockState(new BlockPos(i + 2, j + 6, k + 6), log);
			world.setBlockState(new BlockPos(i + 2, j + 6, k + 7), log);
			world.setBlockState(new BlockPos(i + 2, j + 7, k + 4), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 7, k + 5), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 7, k + 6), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 7, k + 7), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 14, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 2, j + 14, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 2, j + 14, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 2, j + 14, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 2, j + 14, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 2, j + 14, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 2, j + 14, k + 8), leaves);
			world.setBlockState(new BlockPos(i + 2, j + 15, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 2, j + 15, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 2, j + 15, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 2, j + 15, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 2, j + 15, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 2, j + 15, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 2, j + 15, k + 9), leaves);
			world.setBlockState(new BlockPos(i + 2, j + 16, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 2, j + 16, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 2, j + 16, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 2, j + 16, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 6, k + 3), log);
			world.setBlockState(new BlockPos(i + 3, j + 6, k + 4), log);
			world.setBlockState(new BlockPos(i + 3, j + 6, k + 5), log);
			world.setBlockState(new BlockPos(i + 3, j + 6, k + 6), log);
			world.setBlockState(new BlockPos(i + 3, j + 6, k + 7), log);
			world.setBlockState(new BlockPos(i + 3, j + 6, k + 8), log);
			world.setBlockState(new BlockPos(i + 3, j + 7, k + 3), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 7, k + 4), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 7, k + 7), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 7, k + 8), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 14, k + 1), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 14, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 14, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 14, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 14, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 14, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 14, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 14, k + 8), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 14, k + 9), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 15, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 15, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 15, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 15, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 15, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 15, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 15, k + 9), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 16, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 16, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 16, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 16, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 3, j + 16, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 6, k + 2), log);
			world.setBlockState(new BlockPos(i + 4, j + 6, k + 3), log);
			world.setBlockState(new BlockPos(i + 4, j + 6, k + 4), log);
			world.setBlockState(new BlockPos(i + 4, j + 6, k + 7), log);
			world.setBlockState(new BlockPos(i + 4, j + 6, k + 8), log);
			world.setBlockState(new BlockPos(i + 4, j + 6, k + 9), log);
			world.setBlockState(new BlockPos(i + 4, j + 7, k + 2), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 7, k + 3), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 7, k + 8), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 7, k + 9), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 14, k + 0), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 14, k + 1), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 14, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 14, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 14, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 14, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 14, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 14, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 14, k + 8), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 14, k + 9), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 14, k + 10), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 15, k + 1), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 15, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 15, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 15, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 15, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 15, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 15, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 15, k + 8), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 16, k + 1), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 16, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 16, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 16, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 16, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 16, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 0, k + 5), log);
			world.setBlockState(new BlockPos(i + 5, j + 0, k + 6), log);
			world.setBlockState(new BlockPos(i + 5, j + 1, k + 5), log);
			world.setBlockState(new BlockPos(i + 5, j + 1, k + 6), log);
			world.setBlockState(new BlockPos(i + 5, j + 2, k + 5), log);
			world.setBlockState(new BlockPos(i + 5, j + 2, k + 6), log);
			world.setBlockState(new BlockPos(i + 5, j + 3, k + 5), log);
			world.setBlockState(new BlockPos(i + 5, j + 3, k + 6), log);
			world.setBlockState(new BlockPos(i + 5, j + 4, k + 5), log);
			world.setBlockState(new BlockPos(i + 5, j + 4, k + 6), log);
			world.setBlockState(new BlockPos(i + 5, j + 5, k + 5), log);
			world.setBlockState(new BlockPos(i + 5, j + 5, k + 6), log);
			world.setBlockState(new BlockPos(i + 5, j + 6, k + 2), log);
			world.setBlockState(new BlockPos(i + 5, j + 6, k + 3), log);
			world.setBlockState(new BlockPos(i + 5, j + 6, k + 4), log);
			world.setBlockState(new BlockPos(i + 5, j + 6, k + 5), log);
			world.setBlockState(new BlockPos(i + 5, j + 6, k + 6), log);
			world.setBlockState(new BlockPos(i + 5, j + 6, k + 7), log);
			world.setBlockState(new BlockPos(i + 5, j + 6, k + 8), log);
			world.setBlockState(new BlockPos(i + 5, j + 6, k + 9), log);
			world.setBlockState(new BlockPos(i + 5, j + 7, k + 2), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 7, k + 5), log);
			world.setBlockState(new BlockPos(i + 5, j + 7, k + 6), log);
			world.setBlockState(new BlockPos(i + 5, j + 7, k + 9), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 8, k + 5), log);
			world.setBlockState(new BlockPos(i + 5, j + 8, k + 6), log);
			world.setBlockState(new BlockPos(i + 5, j + 9, k + 5), log);
			world.setBlockState(new BlockPos(i + 5, j + 9, k + 6), log);
			world.setBlockState(new BlockPos(i + 5, j + 10, k + 5), log);
			world.setBlockState(new BlockPos(i + 5, j + 10, k + 6), log);
			world.setBlockState(new BlockPos(i + 5, j + 11, k + 5), log);
			world.setBlockState(new BlockPos(i + 5, j + 11, k + 6), log);
			world.setBlockState(new BlockPos(i + 5, j + 12, k + 5), log);
			world.setBlockState(new BlockPos(i + 5, j + 12, k + 6), log);
			world.setBlockState(new BlockPos(i + 5, j + 13, k + 5), log);
			world.setBlockState(new BlockPos(i + 5, j + 13, k + 6), log);
			world.setBlockState(new BlockPos(i + 5, j + 14, k + 0), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 14, k + 1), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 14, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 14, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 14, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 14, k + 5), log);
			world.setBlockState(new BlockPos(i + 5, j + 14, k + 6), log);
			world.setBlockState(new BlockPos(i + 5, j + 14, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 14, k + 8), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 14, k + 9), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 14, k + 10), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 15, k + 0), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 15, k + 1), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 15, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 15, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 15, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 15, k + 5), log);
			world.setBlockState(new BlockPos(i + 5, j + 15, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 15, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 15, k + 8), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 15, k + 9), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 16, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 16, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 16, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 16, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 16, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 16, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 5, j + 16, k + 8), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 0, k + 5), log);
			world.setBlockState(new BlockPos(i + 6, j + 0, k + 6), log);
			world.setBlockState(new BlockPos(i + 6, j + 1, k + 5), log);
			world.setBlockState(new BlockPos(i + 6, j + 1, k + 6), log);
			world.setBlockState(new BlockPos(i + 6, j + 2, k + 5), log);
			world.setBlockState(new BlockPos(i + 6, j + 2, k + 6), log);
			world.setBlockState(new BlockPos(i + 6, j + 3, k + 5), log);
			world.setBlockState(new BlockPos(i + 6, j + 3, k + 6), log);
			world.setBlockState(new BlockPos(i + 6, j + 4, k + 5), log);
			world.setBlockState(new BlockPos(i + 6, j + 4, k + 6), log);
			world.setBlockState(new BlockPos(i + 6, j + 5, k + 5), log);
			world.setBlockState(new BlockPos(i + 6, j + 5, k + 6), log);
			world.setBlockState(new BlockPos(i + 6, j + 6, k + 2), log);
			world.setBlockState(new BlockPos(i + 6, j + 6, k + 3), log);
			world.setBlockState(new BlockPos(i + 6, j + 6, k + 4), log);
			world.setBlockState(new BlockPos(i + 6, j + 6, k + 5), log);
			world.setBlockState(new BlockPos(i + 6, j + 6, k + 6), log);
			world.setBlockState(new BlockPos(i + 6, j + 6, k + 7), log);
			world.setBlockState(new BlockPos(i + 6, j + 6, k + 8), log);
			world.setBlockState(new BlockPos(i + 6, j + 6, k + 9), log);
			world.setBlockState(new BlockPos(i + 6, j + 7, k + 2), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 7, k + 5), log);
			world.setBlockState(new BlockPos(i + 6, j + 7, k + 6), log);
			world.setBlockState(new BlockPos(i + 6, j + 7, k + 9), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 8, k + 5), log);
			world.setBlockState(new BlockPos(i + 6, j + 8, k + 6), log);
			world.setBlockState(new BlockPos(i + 6, j + 9, k + 5), log);
			world.setBlockState(new BlockPos(i + 6, j + 9, k + 6), log);
			world.setBlockState(new BlockPos(i + 6, j + 10, k + 5), log);
			world.setBlockState(new BlockPos(i + 6, j + 10, k + 6), log);
			world.setBlockState(new BlockPos(i + 6, j + 11, k + 5), log);
			world.setBlockState(new BlockPos(i + 6, j + 11, k + 6), log);
			world.setBlockState(new BlockPos(i + 6, j + 12, k + 5), log);
			world.setBlockState(new BlockPos(i + 6, j + 12, k + 6), log);
			world.setBlockState(new BlockPos(i + 6, j + 13, k + 5), log);
			world.setBlockState(new BlockPos(i + 6, j + 13, k + 6), log);
			world.setBlockState(new BlockPos(i + 6, j + 14, k + 0), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 14, k + 1), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 14, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 14, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 14, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 14, k + 5), log);
			world.setBlockState(new BlockPos(i + 6, j + 14, k + 6), log);
			world.setBlockState(new BlockPos(i + 6, j + 14, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 14, k + 8), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 14, k + 9), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 14, k + 10), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 15, k + 0), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 15, k + 1), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 15, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 15, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 15, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 15, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 15, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 15, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 15, k + 8), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 15, k + 9), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 16, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 16, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 16, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 16, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 16, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 16, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 6, j + 16, k + 8), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 6, k + 2), log);
			world.setBlockState(new BlockPos(i + 7, j + 6, k + 3), log);
			world.setBlockState(new BlockPos(i + 7, j + 6, k + 4), log);
			world.setBlockState(new BlockPos(i + 7, j + 6, k + 5), log);
			world.setBlockState(new BlockPos(i + 7, j + 6, k + 6), log);
			world.setBlockState(new BlockPos(i + 7, j + 6, k + 7), log);
			world.setBlockState(new BlockPos(i + 7, j + 6, k + 8), log);
			world.setBlockState(new BlockPos(i + 7, j + 6, k + 9), log);
			world.setBlockState(new BlockPos(i + 7, j + 7, k + 2), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 7, k + 3), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 7, k + 8), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 7, k + 9), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 14, k + 0), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 14, k + 1), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 14, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 14, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 14, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 14, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 14, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 14, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 14, k + 8), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 14, k + 9), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 14, k + 10), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 15, k + 1), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 15, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 15, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 15, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 15, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 15, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 15, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 15, k + 8), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 16, k + 1), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 16, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 16, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 16, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 16, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 16, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 7, j + 16, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 6, k + 3), log);
			world.setBlockState(new BlockPos(i + 8, j + 6, k + 4), log);
			world.setBlockState(new BlockPos(i + 8, j + 6, k + 5), log);
			world.setBlockState(new BlockPos(i + 8, j + 6, k + 6), log);
			world.setBlockState(new BlockPos(i + 8, j + 6, k + 7), log);
			world.setBlockState(new BlockPos(i + 8, j + 6, k + 8), log);
			world.setBlockState(new BlockPos(i + 8, j + 7, k + 3), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 7, k + 4), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 7, k + 7), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 7, k + 8), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 14, k + 1), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 14, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 14, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 14, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 14, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 14, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 14, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 14, k + 8), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 14, k + 9), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 15, k + 1), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 15, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 15, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 15, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 15, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 15, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 16, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 16, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 16, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 16, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 8, j + 16, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 9, j + 6, k + 4), log);
			world.setBlockState(new BlockPos(i + 9, j + 6, k + 5), log);
			world.setBlockState(new BlockPos(i + 9, j + 6, k + 6), log);
			world.setBlockState(new BlockPos(i + 9, j + 6, k + 7), log);
			world.setBlockState(new BlockPos(i + 9, j + 7, k + 4), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 7, k + 5), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 7, k + 6), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 7, k + 7), JourneyBlocks.corbaPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 14, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 9, j + 14, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 9, j + 14, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 9, j + 14, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 9, j + 14, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 9, j + 14, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 9, j + 14, k + 8), leaves);
			world.setBlockState(new BlockPos(i + 9, j + 14, k + 9), leaves);
			world.setBlockState(new BlockPos(i + 9, j + 15, k + 2), leaves);
			world.setBlockState(new BlockPos(i + 9, j + 15, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 9, j + 15, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 9, j + 15, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 9, j + 15, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 9, j + 16, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 10, j + 14, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 10, j + 14, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 10, j + 14, k + 5), leaves);
			world.setBlockState(new BlockPos(i + 10, j + 14, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 10, j + 14, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 10, j + 15, k + 3), leaves);
			world.setBlockState(new BlockPos(i + 10, j + 15, k + 4), leaves);
			world.setBlockState(new BlockPos(i + 10, j + 15, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 11, j + 14, k + 6), leaves);
			world.setBlockState(new BlockPos(i + 11, j + 14, k + 7), leaves);
			world.setBlockState(new BlockPos(i + 4, j + 0, k + 5), JourneyBlocks.corbaLadder.getStateFromMeta(4));
			world.setBlockState(new BlockPos(i + 4, j + 0, k + 6), JourneyBlocks.corbaLadder.getStateFromMeta(4));
			world.setBlockState(new BlockPos(i + 4, j + 1, k + 5), JourneyBlocks.corbaLadder.getStateFromMeta(4));
			world.setBlockState(new BlockPos(i + 4, j + 1, k + 6), JourneyBlocks.corbaLadder.getStateFromMeta(4));
			world.setBlockState(new BlockPos(i + 4, j + 2, k + 5), JourneyBlocks.corbaLadder.getStateFromMeta(4));
			world.setBlockState(new BlockPos(i + 4, j + 2, k + 6), JourneyBlocks.corbaLadder.getStateFromMeta(4));
			world.setBlockState(new BlockPos(i + 4, j + 3, k + 5), JourneyBlocks.corbaLadder.getStateFromMeta(4));
			world.setBlockState(new BlockPos(i + 4, j + 3, k + 6), JourneyBlocks.corbaLadder.getStateFromMeta(4));
			world.setBlockState(new BlockPos(i + 4, j + 4, k + 5), JourneyBlocks.corbaLadder.getStateFromMeta(4));
			world.setBlockState(new BlockPos(i + 4, j + 4, k + 6), JourneyBlocks.corbaLadder.getStateFromMeta(4));
			world.setBlockState(new BlockPos(i + 4, j + 5, k + 5), JourneyBlocks.corbaLadder.getStateFromMeta(4));
			world.setBlockState(new BlockPos(i + 4, j + 5, k + 6), JourneyBlocks.corbaLadder.getStateFromMeta(4));
			world.setBlockState(new BlockPos(i + 4, j + 6, k + 5), JourneyBlocks.corbaLadder.getStateFromMeta(4));
			world.setBlockState(new BlockPos(i + 4, j + 6, k + 6), JourneyBlocks.corbaLadder.getStateFromMeta(4));
			if(!world.isRemote) {
				EntityOvergrownMerchant smith = new EntityOvergrownMerchant(world);
					smith.setLocationAndAngles(i + 4, j + 8, k + 4, 0.0F, 0.0F);
					world.spawnEntity(smith);spawnEntityInWorld(smith);
			}
			return false;
		}

		private void spawnEntityInWorld(EntityOvergrownMerchant smith) {
	}
}