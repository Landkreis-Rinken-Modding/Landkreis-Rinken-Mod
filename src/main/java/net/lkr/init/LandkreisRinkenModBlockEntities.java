
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.lkr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.lkr.block.entity.SpindblockBlockEntity;
import net.lkr.LandkreisRinkenMod;

public class LandkreisRinkenModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, LandkreisRinkenMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SPINDBLOCK = register("spindblock", LandkreisRinkenModBlocks.SPINDBLOCK, SpindblockBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
