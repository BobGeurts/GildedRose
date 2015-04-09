package org.joyofcoding.objectcalisthenics;

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
