package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Hare hare = new Hare();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();
        Ball kolobok = new Ball();
        hare.tryEat(kolobok);
        wolf.tryEat(kolobok);
        fox.tryEat(kolobok);
    }
}
