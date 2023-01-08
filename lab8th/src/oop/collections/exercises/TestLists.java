package oop.collections.exercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 3, 4, 666, 5, 2, 7));
        System.out.println(list);

        Lists.insertFirst(list, 12);
        System.out.println(list);

        Lists.insertLast(list, 666);
        System.out.println(list);

        Lists.replace(list, 15);
        System.out.println(list);

        Lists.removeThird(list);
        System.out.println(list);

        Lists.removeEvil(list);
        System.out.println(list);

        ArrayList<Integer> squares = Lists.generateSquare();
        System.out.println(squares);

        System.out.println(Lists.contains(list, 12));

        ArrayList<Integer> copyList = new ArrayList<>(List.of(1, 3));
        Lists.copy(list, copyList);
        System.out.println(copyList);

        Lists.reverse(list);
        System.out.println(list);

        Lists.reverseManual(copyList);
        System.out.println(copyList);

        LinkedList<Integer> linkedList = new LinkedList<>(List.of(1, 3, 4, 5));
        Lists.insertBeginningEnd(linkedList, 1000);
        System.out.println(linkedList);
    }
}
