package de.Mari_023.diorite_trapdoors.init;

import java.util.ArrayList;
import java.util.List;

import de.Mari_023.diorite_trapdoors.blocks.BlockTrapDoor;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//public static final Block DIORITEDOOR = new BlockDoor(net.minecraft.block.material.Material.ROCK);
	public static final Block DIORITETRAPDOOR = new BlockTrapDoor(net.minecraft.block.material.Material.ROCK);
}