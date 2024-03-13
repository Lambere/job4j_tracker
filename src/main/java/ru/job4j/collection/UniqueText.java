package ru.job4j.collection;

import java.util.HashSet;
import java.util.NavigableSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        HashSet<String> orig = new HashSet<>();
        for(String a : origin) {

            orig.add(a);
        }
        for(String a : text) {
            check.add(a);
        }
        if(orig.contains(check)) {
            result = false;
        }

        return result;
    }
}