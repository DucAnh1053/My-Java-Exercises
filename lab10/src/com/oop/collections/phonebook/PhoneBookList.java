package com.oop.collections.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {
    ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.add(p);
    }

    @Override
    public Student searchByName(String name) {
        for (Student p : phoneBook) {
            if (p.name.equals(name)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastname) {
        for (Student p : phoneBook) {
            if (p.lastname.equals(lastname)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student p : phoneBook) {
            if (p.phone.equals(phone)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        phoneBook.remove(searchByNumber(phone));
    }
}
