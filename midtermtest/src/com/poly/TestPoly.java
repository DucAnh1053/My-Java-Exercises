package com.poly;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestPoly {
    List<Poly> polyList;

    public TestPoly() {
        polyList = new ArrayList<>();
    }

    public static ArrayPoly createArrayPoly(int[] coeffs) {
        return new ArrayPoly(coeffs);
    }

    public static ListPoly createListPoly(int[] coeffs) {
        return new ListPoly(coeffs);
    }

    public static int[] createRandomArray(int number) {
        Random generator = new Random();
        int[] randomArray = new int[number];
        for (int i = 0; i < number; i++) {
            randomArray[i] = generator.nextInt(-10, 10);
        }
        return randomArray;
    }

    public static void main(String[] args) {
        Poly poly1 = new ListPoly(new int[]{1, -2, 0, 0, 3, 0});
        Poly poly2 = new ListPoly(new int[]{1, -2, 0, 0, 3});
        Poly poly3 = poly2.derivative();
        System.out.println(poly1);
        System.out.println(poly2);
        System.out.println(poly3);
        System.out.println(poly1.equals(poly2));
        System.out.println(poly1.equals(poly3));
    }
}
