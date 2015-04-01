package org.joyofcoding.objectcalisthenics;

public class Item {

    private String name;
    private ItemDescription itemDescription;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        itemDescription = new ItemDescription(quality, sellIn);
    }
    
    public ItemDescription getItemDescription() {
       return itemDescription;
    }

    public String getName() {
        return name;
    }

    public boolean checkQualityLow() {
        return itemDescription.checkQualityLow();
    }

    public boolean checkQualityHigh() {
        return itemDescription.checkQualityHigh();
    }

    public void decreaseQuality() {
        itemDescription.decreaseQuality();
    }

    public void increaseQuality() {
        itemDescription.increaseQuality();
    }

    public void nullQuality() {
        itemDescription.nullQuality();
    }

    public void decreaseSellIn() {
        itemDescription.decreaseSellIn();
    }

    public boolean checkSellIn(int height) {
        return itemDescription.checkSellIn(height);
    }

    public boolean equalName(String name) {
        return this.name.equals(name);
    }
}
