package org.joyofcoding.objectcalisthenics;

public class ItemSellIn {
    private int sellIn;
    
    public ItemSellIn(int sellIn) {
        this.sellIn = sellIn;
    }
    
    public int getSellIn() {
        return sellIn;
    }
    
    public void decreaseSellIn() {
        sellIn--;
    }
}
