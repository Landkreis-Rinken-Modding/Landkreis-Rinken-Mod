
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.lkr.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.lkr.client.gui.SpindguiScreen;
import net.lkr.client.gui.PassportGuiScreen;
import net.lkr.client.gui.FMEScreen;
import net.lkr.client.gui.CreatePassortScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LandkreisRinkenModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(LandkreisRinkenModMenus.SPINDGUI.get(), SpindguiScreen::new);
			MenuScreens.register(LandkreisRinkenModMenus.CREATE_PASSORT.get(), CreatePassortScreen::new);
			MenuScreens.register(LandkreisRinkenModMenus.PASSPORT_GUI.get(), PassportGuiScreen::new);
			MenuScreens.register(LandkreisRinkenModMenus.FME.get(), FMEScreen::new);
		});
	}
}
