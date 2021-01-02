package xyz.bzstudio.modderguide.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class SpeedGemItem extends Item {
	public SpeedGemItem() {
		super(new Properties().group(MGItemGroup.MODDERGUIDE));
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		if (!worldIn.isRemote) {
			if (playerIn.getFoodStats().getFoodLevel() >= 6) {
				playerIn.addPotionEffect(new EffectInstance(Effects.SPEED, 300, 1));
				playerIn.getFoodStats().addStats(-6, 0);
				return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
			}
		}
		return ActionResult.resultFail(playerIn.getHeldItem(handIn));
	}
}