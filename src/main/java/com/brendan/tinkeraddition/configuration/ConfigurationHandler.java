package com.brendan.tinkeraddition.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler
{
	
	public static Configuration configiration;
		
	
	public static void init(File configFile)
		{
			//Create object from given configuration file
			Configuration configuration = new Configuration(configFile);
			
			boolean conFigValue = false;
			try
			{
				//Load the config file
				configuration.load();
				
				//read in properties from configuration file
				conFigValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "this is an example config value").getBoolean(true);
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
			
		}
	}

