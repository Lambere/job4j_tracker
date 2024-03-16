package ru.job4j.collection;

import java.util.*;

public class FullSearch {

    public Set<String> extractNumber(List<Task> tasks) {
        String a = tasks.get(0).getNumber();
        boolean proverka;
        Set<String> tasks1 = new HashSet<>();
        tasks1.add(a);
        for (Task task : tasks) {
            for (String task1 : tasks1) {
                proverka = true;
                if (tasks1.equals(tasks)) {
                    proverka = false;
                }
                if (proverka) {
                    tasks1.add(task.getNumber());
                }
            }
        }
        return tasks1;
    }
}