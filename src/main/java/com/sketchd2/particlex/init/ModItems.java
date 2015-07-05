package com.sketchd2.particlex.init;


import com.sketchd2.particlex.item.ItemMagnet;
import com.sketchd2.particlex.item.ItemPX;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemPX ItemMagnet = new ItemMagnet();

    public static void init(){
        GameRegistry.registerItem(ItemMagnet,"itemMagnet");
    }
}
