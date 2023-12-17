package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean act, int stat, String message) {
        this.active = act;
        this.status = stat;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true, 2, "asd");
        Error error3 = new Error(true, 3, "asds");
    }
}
