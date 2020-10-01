package com.github.vvvbbbcz.modderguide.block;

import com.github.vvvbbbcz.modderguide.ModderGuide;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MGBlocks {
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ModderGuide.MODID);
	public static final Block TEST_BLOCK = register("test_block", new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.5F).sound(SoundType.STONE)));
	public static final Block IRON_CHEST = register("iron_chest", new IronChest());

	private static Block register(String name, Block block) {
		BLOCKS.register(name, () -> block);
		return block;
	}
}
