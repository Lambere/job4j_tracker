package ru.job4j.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
        if (tasks.isEmpty()) {
            tasks.add(index, task);
        } else {
            for (Task task1 : tasks) {
                if (task.getPriority() >= task1.getPriority()) {
                    index++;
                } else {
                    tasks.add(index, task);
                    break;
                }
            }
        }
    }


    public Task take() {
        return tasks.poll();
    }
}
