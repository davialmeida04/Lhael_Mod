package com.davilmeida04.lhael;

import com.davilmeida04.lhael.block.ModBlocks;
import com.davilmeida04.lhael.item.ModItemGroup;
import com.davilmeida04.lhael.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LhaelMod implements ModInitializer {
	public static final String MOD_ID = "lhael-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerBlocks();
	}
}