package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        int counter = 1;
        int j = 1;
        if(input.length() == 1) {
            return input;
        }

        for (int i = 0; j < input.length(); i++) {
            char symbol = input.charAt(j);
            if (symbol == input.charAt(i)) {
                counter++;

            }else {
                counter++;
                result = result + input.charAt(i) + counter;
                counter = 0;
                }

            j++;
        }
        return result;
    }
}
