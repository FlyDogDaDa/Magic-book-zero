
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicbookzero.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.magicbookzero.client.gui.MagicbookGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MagicBookZeroModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MagicBookZeroModMenus.MAGICBOOK_GUI, MagicbookGUIScreen::new);
		});
	}
}
