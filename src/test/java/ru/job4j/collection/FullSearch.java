package ru.job4j.collection;

import java.util.*;

public class FullSearch {

    public Set<String> extractNumber(List<Task> tasks) {
        Set<String> tasks1 = new HashSet<>();
        for (Task task : tasks) {
            tasks1.add(task.getNumber());
        }
        return tasks1;
    }
}