package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Hare hare = new Hare();
        Fox fox = new Fox();
        Ball kolobok = new Ball();
        Wolf wolf = new Wolf();
        hare.tryEat(kolobok);
        wolf.tryEat(kolobok);
        fox.tryEat(kolobok);
    }
}
