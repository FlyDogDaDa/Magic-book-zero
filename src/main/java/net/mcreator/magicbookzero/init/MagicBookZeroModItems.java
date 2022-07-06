
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicbookzero.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.magicbookzero.item.MagicbookItem;
import net.mcreator.magicbookzero.MagicBookZeroMod;

public class MagicBookZeroModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MagicBookZeroMod.MODID);
	public static final RegistryObject<Item> MAGICBOOK = REGISTRY.register("magicbook", () -> new MagicbookItem());
}
