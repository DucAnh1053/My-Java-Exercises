package com.mylist;

public class MyLinkedList extends MyAbstractList {
    MyLinkedListNode head;
    int size;

    public MyLinkedList() {
    }

    @Override
    public void add(Object o) {
        add(o, size);
    }

    @Override
    public void add(Object o, int idx) {
        if (checkBoundaries(idx, size)) {
            if (idx == 0) {
                head = new MyLinkedListNode(o);
            } else {
                MyLinkedListNode current = getNodeByIndex(idx - 1);
                current.setNext(new MyLinkedListNode(o, current.getNext()));
            }
            size++;
        }
    }

    @Override
    public Object get(int idx) {
        return getNodeByIndex(idx);
    }

    private MyLinkedListNode getNodeByIndex(int idx) {
        if (checkBoundaries(idx, size - 1)) {
            MyLinkedListNode current = head;
            for (int i = 0; i < idx; i++) {
                current = current.getNext();
            }
            return current;
        }
        return null;
    }

    @Override
    public void remove(int idx) {
        if (checkBoundaries(idx, size - 1)) {
            MyLinkedListNode current = getNodeByIndex(idx - 1);
            current.setNext(current.getNext().getNext());
            size--;
        }
    }

    @Override
    public int size() {
        return size;
    }
}
