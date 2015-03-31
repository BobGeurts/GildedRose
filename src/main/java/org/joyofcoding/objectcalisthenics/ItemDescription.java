/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joyofcoding.objectcalisthenics;

/**
 *
 * @author Bros Laptop
 */
public class ItemDescription {
    private ItemQuality itemQuality;
    private ItemSellIn  itemSellIn;   
    
    public ItemDescription(int quality, int sellIn) {
        itemQuality = new ItemQuality(quality);
        itemSellIn = new ItemSellIn(sellIn);
    }
    
    public ItemQuality getItemQuality() {
        return itemQuality;
    }
    
    public ItemSellIn getItemSellIn() {
        return itemSellIn;
    }
}
