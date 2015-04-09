package org.joyofcoding.objectcalisthenics;

public class ItemProcessor {
    public void SellQuality(Item item, int height) {
        if (item.checkSellIn(height) && item.checkQualityHigh()) {
            item.increaseQuality();
        }
    }
    
    public boolean HighQuality(Item item) {
        if (item.checkQualityHigh()) {
            item.increaseQuality();
            return true;
        }
        return false;
    }
}
