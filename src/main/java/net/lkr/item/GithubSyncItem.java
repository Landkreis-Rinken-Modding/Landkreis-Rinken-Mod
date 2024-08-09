
package net.lkr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GithubSyncItem extends Item {
	public GithubSyncItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
