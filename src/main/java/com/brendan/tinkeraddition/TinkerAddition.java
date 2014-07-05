package com.brendan.tinkeraddition;

import com.brendan.tinkeraddition.proxy.IProxy;
import com.brendan.tinkeraddition.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class TinkerAddition 
{
	@Mod.Instance(Reference.MOD_ID)
	public static TinkerAddition instance;
	
	@SidedProxy(clientSide = "com.brendan.tinkeraddition.proxy.ClientProxy", serverSide = "com.brendan.tinkeraddition.proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
