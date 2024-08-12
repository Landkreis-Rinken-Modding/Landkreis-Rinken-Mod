
package net.lkr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AdminTabItemItem extends Item {
	public AdminTabItemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
