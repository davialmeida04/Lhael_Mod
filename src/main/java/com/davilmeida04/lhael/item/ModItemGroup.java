package com.davilmeida04.lhael.item;

import com.davilmeida04.lhael.LhaelMod;
import com.davilmeida04.lhael.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(LhaelMod.MOD_ID, "ruby_group"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby_group"))
            .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                entries.add(ModItems.RUBY);
                entries.add(ModItems.RAW_RUBY_ORE);
                entries.add(ModBlocks.RUBY_ORE);
                entries.add(ModBlocks.RUBY_BLOCK);
                entries.add(ModBlocks.CRYSOLIUM_ORE);
                entries.add(ModItems.CRYSOLIUM);
            }).build());


    public static void registerItemGroups() {

    }

}
