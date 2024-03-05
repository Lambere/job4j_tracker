package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();

        for (int i = 0; i < persons.size(); i++) {
            String name = persons.get(i).getName();
            String surname = persons.get(i).getSurname();
            String phoneNumber = persons.get(i).getPhone();
            String getAddress = persons.get(i).getAddress();
            if (name.contains(key) || surname.contains(key) || phoneNumber.contains(key) || getAddress.contains(key)) {
                result.add(persons.get(i));
            }
        }

        return result;
    }
}
