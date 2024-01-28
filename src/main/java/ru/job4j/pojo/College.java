package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student artem = new Student();
        artem.setDate("1998/02/21");
        artem.setName("Artem");
        artem.setGroupe("7A");
        System.out.println(artem.getDate());
        System.out.println(artem.getName());
        System.out.println(artem.getGroupe());
    }
}
