package ru.job4j.tracker;

import java.util.Arrays;

public final class SingleTracker {
    private final Item[] items = new Item[100];
    private Tracker tracker = new Tracker();

    private SingleTracker() {
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return null;
    }

    public void delete(int id) {
        tracker.delete(id);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < items.length; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }
}
