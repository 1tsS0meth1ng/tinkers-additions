package com.brendan.tinkeraddition;

import com.brendan.tinkeraddition.handler.ConfigurationHandler;
import com.brendan.tinkeraddition.init.ModItems;
import com.brendan.tinkeraddition.proxy.IProxy;
import com.brendan.tinkeraddition.reference.Reference;
import com.brendan.tinkeraddition.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class TinkerAddition 
{
	@Mod.Instance(Reference.MOD_ID)
	public static TinkerAddition instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        
        LogHelper.info("Pre Initialisation Complete!!");
        
        ModItems.init();

	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		 LogHelper.info("Initialisation Complete!!");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		 LogHelper.info("Post Initialisation Complete!!");
	}
}
