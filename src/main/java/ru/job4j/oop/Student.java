package ru.job4j.oop;

public class Student {
    public void sing() {
        System.out.println("I believe I can fly");
    }

    public void music() {
        System.out.println("Tra tra tra");
    }

    public static void main(String[] args) {
        int i = 0;
        Student petya = new Student();
        while (i++ < 3) {
            petya.sing();
        }
    }
}
