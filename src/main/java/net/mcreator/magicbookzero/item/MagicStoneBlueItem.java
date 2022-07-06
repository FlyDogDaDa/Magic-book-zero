
package net.mcreator.magicbookzero.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.magicbookzero.init.MagicBookZeroModTabs;

public class MagicStoneBlueItem extends Item {
	public MagicStoneBlueItem() {
		super(new Item.Properties().tab(MagicBookZeroModTabs.TAB_MAGIC_BOOK_ZERO).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
