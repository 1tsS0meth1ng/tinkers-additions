package com.brendan.tinkeraddition.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.brendan.tinkeraddition.reference.Reference;
import com.brendan.tinkeraddition.init.ModItems;

public class CreativeTabTinkerAddition 
{
	  public static final CreativeTabs TA_TAB = new CreativeTabs(Reference.MOD_ID)
	    {
	        @Override
	        public Item getTabIconItem()
	        {
	            return ModItems.rawVibranium;
	        }

	        @Override
	        public String getTranslatedTabLabel()
	        {
	            return "Let's Mod Reboot";
	        }
	    };
}
