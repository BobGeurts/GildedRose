package org.joyofcoding.objectcalisthenics;

public class Item {
	private String name;
        private ItemDescription itemDescription;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
                itemDescription = new ItemDescription(quality, sellIn);
	}
        
	public String getName() {
		return name;
	}
        
        public ItemDescription getItemDescription() {
            return itemDescription;
        }
        
        public ItemQuality getItemQuality() {
            return itemDescription.getItemQuality();
        }

    public void update() {

    }
}
