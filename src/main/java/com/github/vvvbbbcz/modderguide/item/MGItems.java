package com.github.vvvbbbcz.modderguide.item;

import com.github.vvvbbbcz.modderguide.ModderGuide;
import com.github.vvvbbbcz.modderguide.block.MGBlocks;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MGItems {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ModderGuide.MODID);
	public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", () -> new Item(new Item.Properties().group(MGItemGroup.MODDERGUIDE)));
	public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(MGItemTier.EMERALD, 3, -2.0F, new Item.Properties().group(MGItemGroup.MODDERGUIDE)));
	public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(MGArmorMaterial.EMERALD, EquipmentSlotType.HEAD, new Item.Properties().group(MGItemGroup.MODDERGUIDE)));
	public static final RegistryObject<Item> FISH_SOUP = ITEMS.register("fish_soup", () -> new Item(new Item.Properties().group(MGItemGroup.MODDERGUIDE).food(MGFoods.FISH_SOUP)));
	public static final RegistryObject<Item> SPEED_GEM = ITEMS.register("speed_gem", SpeedGemItem::new);

	public static final RegistryObject<Item> TEST_BLOCK = ITEMS.register("test_block", () -> new BlockItem(MGBlocks.TEST_BLOCK.get(), new Item.Properties().group(MGItemGroup.MODDERGUIDE)));
	public static final RegistryObject<Item> IRON_CHEST = ITEMS.register("iron_chest", () -> new BlockItem(MGBlocks.IRON_CHEST.get(), new Item.Properties().group(MGItemGroup.MODDERGUIDE)));
}
