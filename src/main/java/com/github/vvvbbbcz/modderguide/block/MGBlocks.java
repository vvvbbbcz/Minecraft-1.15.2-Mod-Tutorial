package com.github.vvvbbbcz.modderguide.block;

import com.github.vvvbbbcz.modderguide.ModderGuide;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MGBlocks {
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ModderGuide.MODID);
	public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block", () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.5F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> IRON_CHEST = BLOCKS.register("iron_chest", IronChest::new);
}
