
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.lkr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.lkr.block.SpindblockBlock;
import net.lkr.block.JagermeisterFlascheBlock;
import net.lkr.LandkreisRinkenMod;

public class LandkreisRinkenModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LandkreisRinkenMod.MODID);
	public static final RegistryObject<Block> SPINDBLOCK = REGISTRY.register("spindblock", () -> new SpindblockBlock());
	public static final RegistryObject<Block> JAGERMEISTER_FLASCHE = REGISTRY.register("jagermeister_flasche", () -> new JagermeisterFlascheBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
