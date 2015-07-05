package com.sketchd2.particlex.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static void init(File configFile){
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try{
            //load configs
            configuration.load();
            //read in configs
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "temporary placeholder").getBoolean(true);
        }catch (Exception e){
            //log error
        }finally{
            //save configs
            configuration.save();
        }
    }
}
