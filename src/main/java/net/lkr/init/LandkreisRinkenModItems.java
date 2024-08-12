
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.lkr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.lkr.item.PassportfilledItem;
import net.lkr.item.PassportItem;
import net.lkr.item.GehhilfeItem;
import net.lkr.item.FLegginsItem;
import net.lkr.LandkreisRinkenMod;

public class LandkreisRinkenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LandkreisRinkenMod.MODID);
	public static final RegistryObject<Item> SPINDBLOCK = block(LandkreisRinkenModBlocks.SPINDBLOCK);
	public static final RegistryObject<Item> F_LEGGINS_CHESTPLATE = REGISTRY.register("f_leggins_chestplate", () -> new FLegginsItem.Chestplate());
	public static final RegistryObject<Item> F_LEGGINS_LEGGINGS = REGISTRY.register("f_leggins_leggings", () -> new FLegginsItem.Leggings());
	public static final RegistryObject<Item> PASSPORTEDITOR = REGISTRY.register("passporteditor", () -> new PassportItem());
	public static final RegistryObject<Item> PASSPORT = REGISTRY.register("passport", () -> new PassportfilledItem());
	public static final RegistryObject<Item> JAGERMEISTER_FLASCHE = block(LandkreisRinkenModBlocks.JAGERMEISTER_FLASCHE);
	public static final RegistryObject<Item> GEHHILFE = REGISTRY.register("gehhilfe", () -> new GehhilfeItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
