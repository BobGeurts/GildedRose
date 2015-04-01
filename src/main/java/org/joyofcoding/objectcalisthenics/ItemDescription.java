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
    private ItemSellIn itemSellIn;

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
    
    public boolean checkQualityLow() {
        return itemQuality.getQuality() > 0;
    }

    public boolean checkQualityHigh() {
        return itemQuality.getQuality() < 50;
    }

    public void decreaseQuality() {
        itemQuality.decreaseQuality();
    }

    public void increaseQuality() {
        itemQuality.increaseQuality();
    }

    public void nullQuality() {
        itemQuality.nullQuality();
    }

    public void decreaseSellIn() {
        itemSellIn.decreaseSellIn();
    }

    public boolean checkSellIn(int height) {
        return itemSellIn.getSellIn() < height;
    }
}
