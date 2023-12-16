package ru.job4j.oop;

public class Error {
    static boolean active;
    static int status;
    static String message;
    Error() {}
    Error(boolean act, int stat, String message) {

    }

    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true, 2, "asd");
        Error error3 = new Error(true, 3, "asds");
    }
}
