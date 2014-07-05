package com.brendan.tinkeraddition.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler 
{
	public static void init(File configFile)
	{
		//Create object from given config file
		Configuration configuration = new Configuration(configFile);
		
		boolean configValue = false;
		try
		{
			//Load the config file
			configuration.load();
			
			//read in properties from configuration file
			configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "this is an example config value").getBoolean(true);
		}
		
		catch(Exception e)
		{
			//log the exception
		}
		finally
		{
			//save the configuration file
			configuration.save();
		}
		
		System.out.println(configValue);
	}
}
