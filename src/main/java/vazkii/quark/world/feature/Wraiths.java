/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 * 
 * Quark is Open Source and distributed under the
 * [ADD-LICENSE-HERE]
 * 
 * File Created @ [03/07/2016, 03:48:53 (GMT)]
 */
package vazkii.quark.world.feature;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry.EntityRegistration;
import vazkii.quark.base.Quark;
import vazkii.quark.base.lib.LibEntityIDs;
import vazkii.quark.base.module.Feature;
import vazkii.quark.world.client.render.RenderWraith;
import vazkii.quark.world.entity.EntityWraith;
import vazkii.quark.world.item.ItemSoulBead;

public class Wraiths extends Feature {

	public static Item soul_bead;

	int weight, min, max;
	
	@Override
	public void setupConfig() {
		weight = loadPropInt("Spawn Weight", "", 60);
		min = loadPropInt("Smallest spawn group", "", 4);
		max = loadPropInt("Largest spawn group", "", 6);
	}
	
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		soul_bead = new ItemSoulBead();
		
		EntityRegistry.registerModEntity(EntityWraith.class, "wraith", LibEntityIDs.WRAITH, Quark.instance, 80, 3, true, 0xececec, 0xbdbdbd);
		EntityRegistry.addSpawn(EntityWraith.class, weight, min, max, EnumCreatureType.MONSTER, Biomes.HELL);
	}
	
	@Override
	public void preInitClient(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityWraith.class, RenderWraith.FACTORY);
	}
	
}
