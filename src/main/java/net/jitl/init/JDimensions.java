package net.jitl.init;

import net.jitl.JITL;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;

public class JDimensions {
	public static final RegistryKey<DimensionType> EUCA = RegistryKey.create(Registry.DIMENSION_TYPE_REGISTRY, JITL.rl("euca"));
	public static final RegistryKey<World> EUCA_WORLD = RegistryKey.create(Registry.DIMENSION_REGISTRY, JITL.rl("euca"));
}