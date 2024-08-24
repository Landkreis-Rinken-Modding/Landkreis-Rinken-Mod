
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.lkr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.lkr.LandkreisRinkenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LandkreisRinkenModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LandkreisRinkenMod.MODID);
	public static final RegistryObject<CreativeModeTab> ADMIN_TAB = REGISTRY.register("admin_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.landkreis_rinken.admin_tab")).icon(() -> new ItemStack(LandkreisRinkenModItems.ADMIN_TAB_ITEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LandkreisRinkenModItems.BAN_HAMMER.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> LKR = REGISTRY.register("lkr",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.landkreis_rinken.lkr")).icon(() -> new ItemStack(LandkreisRinkenModItems.F_LEGGINS_CHESTPLATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LandkreisRinkenModItems.F_LEGGINS_CHESTPLATE.get());
				tabData.accept(LandkreisRinkenModItems.F_LEGGINS_LEGGINGS.get());
				tabData.accept(LandkreisRinkenModItems.PASSPORTEDITOR.get());
				tabData.accept(LandkreisRinkenModItems.PASSPORT.get());
				tabData.accept(LandkreisRinkenModItems.GEHHILFE.get());
				tabData.accept(LandkreisRinkenModItems.TABLETTEN.get());
				tabData.accept(LandkreisRinkenModItems.WESTE_MEDIC_CHESTPLATE.get());
				tabData.accept(LandkreisRinkenModItems.MEDIKIT.get());
				tabData.accept(LandkreisRinkenModItems.BANDAGE.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(LandkreisRinkenModBlocks.JAGERMEISTER_FLASCHE.get().asItem());
		}
	}
}
