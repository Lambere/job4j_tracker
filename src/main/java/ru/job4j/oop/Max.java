package ru.job4j.oop;

public class Max {
    public static int max(int left, int right, int a) {
        return max(max(left, right), a);
    }

    public static int max(int left, int right, int a, int b) {
         return max(max(left, right), max(b, a));
    }

    public static int max(int left, int right) {
        return Math.max(left, right);
    }
}