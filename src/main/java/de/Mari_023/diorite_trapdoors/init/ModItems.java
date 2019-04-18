package de.Mari_023.diorite_trapdoors.init;

import java.util.ArrayList;
import java.util.List;

import de.Mari_023.diorite_trapdoors.blocks.BlockTrapDoor;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static CreativeTabs tabDioriteUtils =  CreativeTabs.REDSTONE/*= (new CreativeTabs("diorite Utils") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(BlockTrapDoor.Item);
		}
	})*/;
}