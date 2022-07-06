
package net.mcreator.magicbookzero.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class MagicStoneBlueItem extends Item {

	public MagicStoneBlueItem() {
		super(new Item.Properties().tab(MagicBookZeroModTabs.TAB_DELETED_MOD_ELEMENT).stacksTo(64).rarity(Rarity.COMMON));
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
