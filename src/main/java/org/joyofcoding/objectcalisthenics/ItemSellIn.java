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
