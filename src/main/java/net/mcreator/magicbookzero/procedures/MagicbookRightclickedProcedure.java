package net.mcreator.magicbookzero.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MagicbookRightclickedProcedure {
	public static void execute(ItemStack itemstack) {
		ItemStack slot_item = ItemStack.EMPTY;
		slot_item = (new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(0, itemstack));
		if (slot_item.getItem() == Items.FIRE_CHARGE) {
		}
	}
}
