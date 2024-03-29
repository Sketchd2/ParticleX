package com.sketchd2.particlex;

import com.mojang.realmsclient.gui.ConfigureWorldScreen;
import com.sketchd2.particlex.configuration.ConfigurationHandler;
import com.sketchd2.particlex.init.ModItems;
import com.sketchd2.particlex.proxy.IProxy;
import com.sketchd2.particlex.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version = Reference.VERSION)
public class ParticleX {

    @Mod.Instance(Reference.MOD_ID)
    public static ParticleX instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
// load configurations
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
