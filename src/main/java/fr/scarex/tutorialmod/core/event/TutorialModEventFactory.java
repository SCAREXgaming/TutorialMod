package fr.scarex.tutorialmod.core.event;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

/**
 * @author SCAREX
 *
 */
public class TutorialModEventFactory
{
	public static boolean onBlockFallingEvent(World world, int x, int y, int z, Block block, int metadata) {
		return MinecraftForge.EVENT_BUS.post(new BlockFallingEvent(world, x, y, z));
	}
}
