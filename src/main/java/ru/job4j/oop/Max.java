package ru.job4j.oop;

public class Max {
    public static int max(int left, int right, int a) {
        return max(max(left, right), a);
    }

    public static int max(int left, int right, int a, int b) {
        int max = max(max(left, right), a);
        return Math.max(b, max);
    }

    public static int max(int left, int right) {
        return Math.max(left, right);
    }
}