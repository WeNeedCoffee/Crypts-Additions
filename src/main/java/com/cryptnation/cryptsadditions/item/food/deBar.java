package com.cryptnation.cryptsadditions.item.food;

import com.cryptnation.cryptsadditions.CryptsAdditions;
import com.cryptnation.cryptsadditions.utilities.KeyBoardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class deBar extends Item {
	public deBar() {
		super(new Properties().group(CryptsAdditions.CRYPTS_ADDITIONS).food(new Food.Builder().hunger(20).saturation(1.5f).effect(() -> new EffectInstance(Effects.REGENERATION, 500, 2), 0.8f).build()));
	}

	@Override
	public int getBurnTime(ItemStack itemStack) {
		return 6000;
	}

	@Override
	public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
		if (KeyBoardHelper.isHoldingShift()) {
			tooltip.add(new StringTextComponent(":HINT: Maybe.. This could tame a Guardian?"));
		} else {
			tooltip.add(new StringTextComponent("\u00A71" + " A mystical bar, originated from the Void Dimension"));
		}
		super.addInformation(stack, world, tooltip, flag);
	}
}