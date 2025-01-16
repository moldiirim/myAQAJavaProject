package lesson_9;

import java.util.ArrayList;

public class payment {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(String name, double price) {
        items.add(new Item(name, price));
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println(item.name + ": " + item.price);
        }
    }

    private static class Item {
        private final String name;
        private final double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }
}
