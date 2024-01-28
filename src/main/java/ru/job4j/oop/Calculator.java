package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int num) {
        return x - num;
    }

    public  float divide(int num) {
        return  num / x;
    }

    public  float sumAllOperation(int num) {
        return  divide(num) + minus(num) + multiply(num) * sum(num);
    }

    public static int sum(int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        calculator.sumAllOperation(10);
    }
}