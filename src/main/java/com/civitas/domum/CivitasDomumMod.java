package com.civitas.domum;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = CivitasDomumMod.MODID, version = CivitasDomumMod.VERSION, acceptableRemoteVersions = "*")
public class CivitasDomumMod 
{
	public static final String MODID = "Civitas Domum";
	public static final String VERSION = "0.1a";
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		//MinecraftForge.EVENT_BUS.register(new EventHandlerCommon());
		
	}
	
}
