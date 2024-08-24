
package net.lkr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.lkr.procedures.BandageWennLebewesenMitGegenstandGetroffenWirdProcedure;

public class BandageItem extends Item {
	public BandageItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		BandageWennLebewesenMitGegenstandGetroffenWirdProcedure.execute(entity, sourceentity);
		return retval;
	}
}
