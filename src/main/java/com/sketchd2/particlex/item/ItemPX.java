package com.sketchd2.particlex.item;

import com.sketchd2.particlex.reference.Reference;
import net.minecraft.item.Item;

public class ItemPX extends Item {

    public ItemPX(String itemName){
        super();
        this.setUnlocalizedName(itemName);
        this.setTextureName(Reference.TEXTURE_PATH+itemName);
    }
}
