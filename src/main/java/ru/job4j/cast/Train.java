package ru.job4j.cast;

public class Train implements Vehicle {

    public void move() {
        System.out.println("Ездит по железной дороге");
    }

    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle airplane = new Airplane();
        Vehicle[] array = new Vehicle[]{train, bus, airplane};
        for (int i = 0; i < 3; i++) {
            array[i].move();
        }
    }
}
