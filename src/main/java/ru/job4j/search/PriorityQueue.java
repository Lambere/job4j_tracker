package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = 0;
        for (Task task1 : tasks) {
            if (task.getPriority() >= task1.getPriority()) {
                index++;
            }
        }
        tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}
