
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicbookzero.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MagicBookZeroModTabs {
	public static CreativeModeTab TAB_MAGIC_BOOK_ZERO;

	public static void load() {
		TAB_MAGIC_BOOK_ZERO = new CreativeModeTab("tabmagic_book_zero") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MagicBookZeroModItems.MAGIC_STONE_BLUE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
