package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

    public static void main(String[] args) {
        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(gildedRose.makeItems());
    }

    public List<Item> makeItems() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));
        return items;
    }

    public void updateQuality(List<Item> list) {
        List<Item> items = list;
        for (Item item : items) {
            if (!checkName(item, "Aged Brie")
                    && !checkName(item, "Backstage passes to a TAFKAL80ETC concert")) {
                checkQualityLow(item, "Sulfuras, Hand of Ragnaros");
            } else {
                if (checkQualityHigh(item, null)) {
                    increaseQuality(item);

                    if (checkName(item, "Backstage passes to a TAFKAL80ETC concert")) {
                        if (checkSellIn(item, 11)) {
                            if (checkQualityHigh(item)) {
                                increaseQuality(item);
                            }
                        }

                        if (checkSellIn(item, 6)) {
                            if (checkQualityHigh(item)) {
                                increaseQuality(item);
                            }
                        }
                    }
                }
            }

            if (!checkName(item, "Sulfuras, Hand of Ragnaros")) {
                decreaseSellIn(item);
            }

            if (checkSellIn(item, 0)) {
                if (!checkName(item, "Aged Brie")) {
                    if (!checkName(item, "Backstage passes to a TAFKAL80ETC concert")) {
                        if (checkQualityLow(item) && !checkName(item, "Sulfuras, Hand of Ragnaros")) {
                                decreaseQuality(item);
                        }
                    } else {
                        nullQuality(item);
                    }
                } else {
                    if (checkQualityHigh(item)) {
                        increaseQuality(item);
                    }
                }
            }
        }
    }

    public boolean checkQualityLow(Item item, String name) {
        ItemQuality itemQuality = item.getItemQuality();
        if (itemQuality.getQuality() > 0 && checkName(item, name)) {
            itemQuality.decreaseQuality();
            return true;
        }
        return false;
    }
    
    public boolean checkQualityLow(Item item) {
        ItemQuality itemQuality = item.getItemQuality();
        if (itemQuality.getQuality() > 0) {
            itemQuality.decreaseQuality();
            return true;
        }
        return false;
    }

    public boolean checkQualityHigh(Item item, String name) {
        ItemQuality itemQuality = item.getItemQuality();
        if (itemQuality.getQuality() < 50 && checkName(item, name)) {
                itemQuality.increaseQuality();
                return true;
        }
        return false;
    }
    
    public boolean checkQualityHigh(Item item) {
        ItemQuality itemQuality = item.getItemQuality();
        if (itemQuality.getQuality() < 50) {
                itemQuality.increaseQuality();
                return true;
        }
        return false;
    }

    public boolean checkName(Item item, String name) {
        String itemName = item.getName();
        return itemName.equals(name);
    }

    public void decreaseQuality(Item item) {
        ItemQuality itemQuality = item.getItemQuality();
        itemQuality.decreaseQuality();
    }

    public void increaseQuality(Item item) {
        ItemQuality itemQuality = item.getItemQuality();
        itemQuality.increaseQuality();
    }
    
    public void nullQuality(Item item) {
        ItemQuality itemQuality = item.getItemQuality();
        itemQuality.nullQuality();
    }
    
    public void decreaseSellIn(Item item) {
        ItemSellIn itemSellIn = item.getItemSellIn();
        itemSellIn.descreaseSellIn();
    }
    
    public boolean checkSellIn(Item item, int height) {
        ItemSellIn itemSellIn = item.getItemSellIn();
        return itemSellIn.getItemSellIn() < height;
    }
}
