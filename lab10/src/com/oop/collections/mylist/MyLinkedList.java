package com.oop.collections.mylist;

public class MyLinkedList extends MyAbstractList {
    MyLinkedListNode head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void add(Object o) {
        add(o, size);
    }

    @Override
    public void add(Object o, int index) {
        try {
            checkBoundaries(index, size);
            if (index == 0) {
                head = new MyLinkedListNode(o, head);
            } else {
                MyLinkedListNode current = getNodeByIndex(index - 1);
                current.setNext(new MyLinkedListNode(o, current.getNext()));
            }
            size++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't add object at index " + index);
        }
    }

    @Override
    public Object get(int index) {
        try {
            checkBoundaries(index, size);
            return getNodeByIndex(index).payload;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't get object at index " + index);
            return null;
        }
    }

    @Override
    public void remove(int index) {
        try {
            checkBoundaries(index, size - 1);
            getNodeByIndex(index - 1).setNext(getNodeByIndex(index + 1));
            size--;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't remove object at index " + index);
        }
    }

    @Override
    public int size() {
        return size;
    }
}
