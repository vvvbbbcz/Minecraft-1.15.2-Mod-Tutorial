package com.github.vvvbbbcz.modderguide.item;

import com.github.vvvbbbcz.modderguide.ModderGuide;
import com.github.vvvbbbcz.modderguide.block.MGBlocks;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MGItems {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ModderGuide.MODID);
	public static final Item TEST_ITEM = register("test_item", new Item(new Item.Properties().group(MGItemGroup.MODDERGUIDE)));
	public static final Item EMERALD_SWORD = register("emerald_sword", new SwordItem(MGItemTier.EMERALD, 3, -2.0F, new Item.Properties().group(MGItemGroup.MODDERGUIDE)));
	public static final Item EMERALD_HELMET = register("emerald_helmet", new ArmorItem(MGArmorMaterial.EMERALD, EquipmentSlotType.HEAD, new Item.Properties().group(MGItemGroup.MODDERGUIDE)));
	public static final Item FISH_SOUP = register("fish_soup", new Item(new Item.Properties().group(MGItemGroup.MODDERGUIDE).food(MGFoods.FISH_SOUP)));
	public static final Item SPEED_GEM = register("speed_gem", new SpeedGemItem());

	public static final Item TEST_BLOCK = register("test_block", new BlockItem(MGBlocks.TEST_BLOCK, new Item.Properties().group(MGItemGroup.MODDERGUIDE)));
	public static final Item IRON_CHEST = register("iron_chest", new BlockItem(MGBlocks.IRON_CHEST, new Item.Properties().group(MGItemGroup.MODDERGUIDE)));

	private static Item register(String name, Item item) {
		ITEMS.register(name, () -> item);
		return item;
	}
}