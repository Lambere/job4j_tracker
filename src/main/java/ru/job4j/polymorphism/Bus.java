package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void drive() {

        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int num) {
        num = 121;
    }

    @Override
    public int fillUp(int num) {
        int litr = 120;
        return litr * num;
    }
}
