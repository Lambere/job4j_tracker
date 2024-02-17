package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String key) {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                result = i;
            }
        } if (result == -1) {
            try {
                throw new ElementNotFoundException();
            } catch (ElementNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }
}
