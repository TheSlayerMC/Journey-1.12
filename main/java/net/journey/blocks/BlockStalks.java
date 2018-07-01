package net.journey.blocks;

import java.util.Random;

import net.journey.JourneyBlocks;
import net.journey.JourneyTabs;
import net.journey.util.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.slayer.api.EnumMaterialTypes;
import net.slayer.api.SlayerAPI;

public class BlockStalks extends Block {

	public BlockStalks(String name, String f, boolean top) {
		super(EnumMaterialTypes.PLANT.getMaterial());
		LangRegistry.addBlock(name, f);
		setSoundType(EnumMaterialTypes.PLANT.getSound());
		setCreativeTab(JourneyTabs.decoration);
		setHardness(0.0F);
		setLightLevel(0.6F);
		setTickRandomly(true);
		setUnlocalizedName(name);
		setRegistryName(SlayerAPI.MOD_ID, name);
		JourneyBlocks.blocks.add(this);
		JourneyBlocks.blockName.add(name);
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return null;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public int getPackedLightmapCoords(IBlockState state, IBlockAccess source, BlockPos pos)  {
		return 220;
	}

	@Override
	public void onBlockDestroyedByPlayer(World w, BlockPos pos, IBlockState state) {
		checkDestroyed(w, pos, JourneyBlocks.goldenStalksTop, JourneyBlocks.goldenStalksBottom);
	}

	public void checkDestroyed(World w, BlockPos pos, Block top, Block bottom) {
		if(w.getBlockState(pos.up()) == bottom.getDefaultState() || w.getBlockState(pos.up()) == top.getDefaultState()) 
			w.setBlockState(pos.up(), Blocks.AIR.getDefaultState());
		if(w.getBlockState(pos.down()) == bottom.getDefaultState() || w.getBlockState(pos.down()) == top.getDefaultState()) 
			w.setBlockState(pos.down(), Blocks.AIR.getDefaultState());
	}

	@Override
	public boolean canPlaceBlockAt(World w, BlockPos pos) {
		return w.getBlockState(pos.down()).getBlock() == JourneyBlocks.depthsGrass
				|| w.getBlockState(pos.down()).getBlock().getMaterial(w.getBlockState(pos.down())) == Material.PLANTS;
	}

	@Override
	public void updateTick(World w, BlockPos pos, IBlockState s, Random r) {
		this.checkAndDropBlock(w, pos, s);
	}

	public void checkAndDropBlock(World w, BlockPos pos, IBlockState s) {
		if(!this.canBlockStay(w, pos)) {
			this.dropBlockAsItem(w, pos, s, 0);
			w.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
		}
	}

	public boolean canBlockStay(World w, BlockPos pos) {
		return canPlaceBlockAt(w, pos);
	}
}