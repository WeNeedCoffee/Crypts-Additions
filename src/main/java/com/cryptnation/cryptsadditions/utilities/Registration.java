package com.cryptnation.cryptsadditions.utilities;

import com.cryptnation.cryptsadditions.CryptsAdditions;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {

	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, CryptsAdditions.MOD_ID);

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CryptsAdditions.MOD_ID);

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CryptsAdditions.MOD_ID);


	public static void register() {
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
		BLOCKS.register(eventBus);
		ITEMS.register(eventBus);
		FLUIDS.register(eventBus);
	}
}
