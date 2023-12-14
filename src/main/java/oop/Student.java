package oop;

public class Student {
    public void sing() {
        System.out.println("I believe I can fly");
    }
    public void music() {
        System.out.println("Tra tra tra");
    }
    public static void main(String[] args) {
        Student petya = new Student();
        int i = 0;
        while (i++ < 3) {
            petya.sing();
        }
    }
}
