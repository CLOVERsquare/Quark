/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 * 
 * Quark is Open Source and distributed under the
 * [ADD-LICENSE-HERE]
 * 
 * File Created @ [19/06/2016, 00:41:15 (GMT)]
 */
package vazkii.quark.tweaks.feature;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import vazkii.quark.base.handler.RecipeHandler;
import vazkii.quark.base.module.Feature;

public class ConvertClay extends Feature {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RecipeHandler.addShapelessOreDictRecipe(new ItemStack(Items.CLAY_BALL, 4), new ItemStack(Blocks.CLAY));
	}
	
}