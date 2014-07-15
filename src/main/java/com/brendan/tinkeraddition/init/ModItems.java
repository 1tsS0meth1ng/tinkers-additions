package com.brendan.tinkeraddition.init;

import com.brendan.tinkeraddition.item.ItemAdamantiumIngot;
import com.brendan.tinkeraddition.item.ItemRawVibranium;
import com.brendan.tinkeraddition.item.TinkerAdditionItem;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static final TinkerAdditionItem rawVibranium = new ItemRawVibranium();
	public static final TinkerAdditionItem adamantiumIngot = new ItemAdamantiumIngot();	
	
	public static void init()
	{
		GameRegistry.registerItem(rawVibranium, "rawVibranium");
		GameRegistry.registerItem(adamantiumIngot, "adamantiumIngot");
	}

}
