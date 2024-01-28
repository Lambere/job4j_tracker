package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {

        Book harryPotter = new Book("Harry Potter", 122);
        Book book1984 = new Book("1984", 802);
        Book wither = new Book("Wither", 1212);
        Book cleanCode = new Book("Clean code", 12323);
        Book[] array = new Book[] {harryPotter, book1984, wither, cleanCode};
        for (int i = 0; i < 4; i++) {
            System.out.println(array[i].getName() + " - " + array[i].getNum());
        }
            Book empty = array[0];
            array[0] = array[3];
            array[3] = empty;
            System.out.println("Now index 0 and index 3 will switch places.");

        for (int i = 0; i < 4; i++) {
            System.out.println(array[i].getName() + " - " + array[i].getNum());
        }
        System.out.println("Only book(s) with name \"Clean code\"");

        for (int i = 0; i < 4; i++) {

            if ("Clean code".equals(array[i].getName())) {
                System.out.println(array[i].getName() + " - " + array[i].getNum());
            }
        }
    }
}
