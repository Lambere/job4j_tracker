package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        int count1 = 1;
        while(count > count1++) {
            queue.remove();
        }
        return queue.element().name();
    }

    public String getFirstUpsetCustomer() {
        int count1 = 0;
        while(count > count1++) {
            queue.remove();
        }
        return queue.element().name();
    }
}