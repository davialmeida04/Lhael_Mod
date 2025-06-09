package com.davilmeida04.lhael.item;

import com.davilmeida04.lhael.LhaelMod;
import com.davilmeida04.lhael.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY_ORE = registerItem("raw_ruby_ore", new Item(new FabricItemSettings()));
    public static final Item CRYSOLIUM = registerItem("crysolium", new Item(new FabricItemSettings()));

    private static Item registerItem(String name ,Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LhaelMod.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY_ORE);
        entries.add(CRYSOLIUM);

        entries.add(ModBlocks.RUBY_BLOCK);
        entries.add(ModBlocks.RUBY_ORE);
        entries.add(ModBlocks.CRYSOLIUM_ORE);
    }

    public static void registerModItems() {
        System.out.println("Registering ModItems");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }

}
