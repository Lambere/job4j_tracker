package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {

    private final List<Item> items = new ArrayList<>() {
    };
    private int ids = 1;
    private int size = 0;

    public void delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items.remove(size - 1);
            size--;
        }
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            item.setId(id);
            items.add(item);
        }
        return result;
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items.get(index).getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public Item[] findAll() {
        return (Item[]) Arrays.copyOf(items.toArray(), size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            Item item = items.get(i);
            if (item.getName().equals(key)) {
                rsl[count++] = item;

            }
        }

        return(Item[]) Arrays.copyOf(items.toArray(), count);
    }

    public Item add(Item item) {
        item.setId(ids++);
        items.add(size++, item);
        return item;
    }

        public Item findById(int id) {
            int index = indexOf(id);
            return index != -1 ? items.get(index) : null;
        }
    }


