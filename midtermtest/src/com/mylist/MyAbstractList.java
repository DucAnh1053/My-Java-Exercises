package com.mylist;

public abstract class MyAbstractList implements MyList {
    public MyAbstractList() {
    }

    public boolean checkBoundaries(int index, int limit) {
        return index >= 0 && index <= limit;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            str.append(String.format("[%s]", get(i).toString()));
        }
        return str.toString();
    }
}
