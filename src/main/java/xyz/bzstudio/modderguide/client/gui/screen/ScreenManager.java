package xyz.bzstudio.modderguide.client.gui.screen;

import net.minecraft.client.Minecraft;

public class ScreenManager {
	public static void openIronChestScreen() {
		Minecraft.getInstance().displayGuiScreen(new IronChestScreen());
	}
}
