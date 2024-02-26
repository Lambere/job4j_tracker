package ru.job4j.tracker;

import java.util.Arrays;

public final class SingleTracker {

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
        return tracker.indexOf(id);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }
}
