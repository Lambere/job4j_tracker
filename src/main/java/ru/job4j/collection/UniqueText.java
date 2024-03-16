package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.NavigableSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> set = new HashSet<>();
        for (String a : origin) {
            set.add(a);
        }
        for (String a : text) {
            if (!set.contains(a)) {
                return false;
            }
        }
        return true;
    }
}