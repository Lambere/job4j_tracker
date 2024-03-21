package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {

    public static void main(String[] args) {
        HashMap<String, String> mail = new HashMap<>();
        mail.put("andreypetrov@yandex.ru", "Andrey Petrov");
        mail.put("andreylock@yandex.ru", "Andrey Lock");
        mail.put("andreylock@yandex.ru", "Petya Pupkin");
        for (String key : mail.keySet()) {
            String value = mail.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
