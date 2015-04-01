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
public class ItemQuality {
    private int quality;
    
    public ItemQuality(int quality) {
        this.quality = quality;
    }
    
    public int getQuality() {
        return quality;
    }
    
    public void increaseQuality() {
        quality++;
    }
    
    public void decreaseQuality() {
        quality--;
    } 
    
    public void nullQuality() {
        quality = 0;
    }
}
