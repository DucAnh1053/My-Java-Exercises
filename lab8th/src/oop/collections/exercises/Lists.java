package oop.collections.exercises;

import java.util.*;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        if (list.size() >= 3) {
            list.set(2, value);
        }
    }

    public static void removeThird(ArrayList<Integer> list) {
        if (list.size() >= 3) {
            list.remove(2);
        }
    }

    public static void removeEvil(ArrayList<Integer> list) {
        list.removeAll(List.of(666));
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            squares.add(i * i);
        }
        return squares;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        target.clear();
        for (int ele : source) {
            target.add(ele);
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.add(0, value);
        list.add(value);
    }
}
