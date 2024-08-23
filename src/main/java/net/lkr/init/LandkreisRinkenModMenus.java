
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.lkr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.lkr.world.inventory.SpindguiMenu;
import net.lkr.world.inventory.PassportGuiMenu;
import net.lkr.world.inventory.MediKitGuiMenu;
import net.lkr.world.inventory.FMEMenu;
import net.lkr.world.inventory.CreatePassortMenu;
import net.lkr.LandkreisRinkenMod;

public class LandkreisRinkenModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, LandkreisRinkenMod.MODID);
	public static final RegistryObject<MenuType<SpindguiMenu>> SPINDGUI = REGISTRY.register("spindgui", () -> IForgeMenuType.create(SpindguiMenu::new));
	public static final RegistryObject<MenuType<CreatePassortMenu>> CREATE_PASSORT = REGISTRY.register("create_passort", () -> IForgeMenuType.create(CreatePassortMenu::new));
	public static final RegistryObject<MenuType<PassportGuiMenu>> PASSPORT_GUI = REGISTRY.register("passport_gui", () -> IForgeMenuType.create(PassportGuiMenu::new));
	public static final RegistryObject<MenuType<FMEMenu>> FME = REGISTRY.register("fme", () -> IForgeMenuType.create(FMEMenu::new));
	public static final RegistryObject<MenuType<MediKitGuiMenu>> MEDI_KIT_GUI = REGISTRY.register("medi_kit_gui", () -> IForgeMenuType.create(MediKitGuiMenu::new));
}
