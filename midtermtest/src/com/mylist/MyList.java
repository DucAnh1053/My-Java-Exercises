package com.mylist;

public interface MyList {
    void add(Object o);

    void add(Object o, int idx);

    Object get(int idx);

    void remove(int idx);

    int size();
}
