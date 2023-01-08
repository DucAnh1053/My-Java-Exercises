package oop.collections.exercises;

import java.util.*;

public class TestSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 5, 7, 10));
        Set<Integer> set2 = new HashSet<>(List.of(1, 5, 7, 12, 123));
        System.out.println(Sets.intersectionManual(set1, set2));
        System.out.println(Sets.unionManual(set1, set2));
        System.out.println(Sets.toList(set1).getClass());


        ArrayList<Integer> list = new ArrayList<>(List.of(1, 1, 2, 2, 3, 4, 5));
        System.out.println(Sets.removeDuplicates(list));
        System.out.println(Sets.removeDuplicatesManual(list));

        String s = "ababcd";
        System.out.println(Sets.firstRecurringCharacter(s));
        System.out.println(Sets.allRecurringChars(s));

        TreeSet<Integer> treeSet = new TreeSet<>(List.of(1, 2, 3, 4, 5));
        System.out.println(Sets.getFirst(treeSet));
        System.out.println(Sets.getLast(treeSet));
        System.out.println(Sets.getGreater(treeSet, 3));
    }
}
