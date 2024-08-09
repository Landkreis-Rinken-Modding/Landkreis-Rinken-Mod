package net.lkr.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class PassportGuiWennDasGUIGeoffnetWirdProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String name = "";
		name = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("name");
		return name;
	}
}
