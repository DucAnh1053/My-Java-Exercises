package com.oop.collections.phonebook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.put(p.phone, p);
    }

    @Override
    public Student searchByName(String name) {
        for (String phone : phoneBook.keySet()) {
            Student p = phoneBook.get(phone);
            if (p.name.equals(name)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastname) {
        for (String phone : phoneBook.keySet()) {
            Student p = phoneBook.get(phone);
            if (p.lastname.equals(lastname)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        if (phoneBook.containsKey(phone)) {
            return phoneBook.get(phone);
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        phoneBook.remove(phone);
    }
}
