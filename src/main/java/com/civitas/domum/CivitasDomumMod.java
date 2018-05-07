package com.civitas.domum;

import com.civitas.domum.proxy.CommonProxy;

import net.minecraft.item.Item;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.civitas.core.*;


@Mod(modid = References.MOD_ID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = References.MC_VERSIONS)
public class CivitasDomumMod 
{
    @Mod.Instance
	public static CivitasDomumMod instance;

    @SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        System.out.println("Debug: PreInit fired.");
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        System.out.println("Debug: Init fired.");
        
        //Dimension Registering
        DimensionManager.registerDimension(DimensionManager.getNextFreeDimId(), DimensionType.OVERWORLD);
        
        //Item Registering
        
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        System.out.println("Debug: PostInit fired.");
    }

}
