package xyz.bzstudio.modderguide.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MGItemGroup {
	public static final ItemGroup MODDERGUIDE = new ItemGroup("modderguide") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(MGItems.TEST_ITEM);
		}
	};
}
