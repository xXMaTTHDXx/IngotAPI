package com.ingotpowered.api;

/**
 * Created by Matt on 08/09/14.
 */
public interface Item {

    public Material getItemMaterial();

    public int getAmount();

    public ItemData getItemData();
}
