package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    ItemController processor;

    public static void main(String[] args) {
        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(gildedRose.makeItems());
    }

    public List<Item> makeItems() {
        processor = new ItemController();
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
            updateQualityItem(item);
        }
    }

    public void updateQualityItem(Item item) {
        if (item.equalName("Aged Brie") || processor.NotETCConcert(item)) {
            processor.HighQualityETC(item);
        }

        if (!item.equalName("Sulfuras, Hand of Ragnaros")) {
            item.decreaseSellIn();
        }

        if (item.checkSellIn(0)) {
            processor.AgedETCHigh(item);
        }
    }
}
