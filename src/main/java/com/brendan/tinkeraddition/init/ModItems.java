package com.brendan.tinkeraddition.init;

import com.brendan.tinkeraddition.item.ItemRawVibraniumItem;
import com.brendan.tinkeraddition.item.TinkerAdditionItem;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static final TinkerAdditionItem RawVibranuim = new ItemRawVibraniumItem();
	
	
	public static void init()
	{
		GameRegistry.registerItem(RawVibranuim, "RawVibranium");
	}

}
