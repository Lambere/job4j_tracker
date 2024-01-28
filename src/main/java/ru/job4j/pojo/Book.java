package ru.job4j.pojo;

public class Book {

    Book(String name, int num) {
        this.num = num;
        this.name = name;
    }

    private int num;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
