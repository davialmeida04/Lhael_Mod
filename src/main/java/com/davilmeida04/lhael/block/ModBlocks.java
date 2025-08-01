package com.davilmeida04.lhael.block;


import com.davilmeida04.lhael.LhaelMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(3, 6)));
    public static final Block CRYSOLIUM_ORE = registerBlock("crysolium_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE), UniformIntProvider.create(5, 8)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(LhaelMod.MOD_ID ,name), block);
    }

    private static Item registerBlockItems(String name, Block block) {

        return Registry.register(Registries.ITEM, new Identifier(LhaelMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));

    }

    public static void registerBlocks() {
        LhaelMod.LOGGER.info("Registering ModBlocks");
    }

}
