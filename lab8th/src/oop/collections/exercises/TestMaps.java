package oop.collections.exercises;

import java.util.HashMap;
import java.util.Map;

public class TestMaps {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 5);
        map.put(2, 10);
        map.put(3, 15);

        System.out.println(Maps.count(map));

        System.out.println(Maps.contains(map, 3));
        System.out.println(Maps.containsKeyValue(map, 3, 14));
        System.out.println(Maps.keySet(map));
        System.out.println(Maps.values(map));
        System.out.println(Maps.getColor(2));
    }
}
