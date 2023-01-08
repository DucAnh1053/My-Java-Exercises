package com.fraction;

import java.util.*;

public class TestFraction {
    private List<Fraction> fractions;

    public TestFraction() {
        fractions = new ArrayList<>();
    }

    public Fraction getSecondLargestValue() {
        List<Fraction> sorted = sortByValue(fractions);
        if (sorted.size() <= 1) {
            return null;
        } else {
            return sorted.get(sorted.size() - 2);
        }
    }

    public static void main(String[] args) {
        TestFraction f = new TestFraction();
        Random generator = new Random();
        for (int i = 0; i < 30; i++) {
            f.fractions.add(new Fraction(generator.nextInt(1000) + 1, generator.nextInt(1000) + 1));
        }
        print(f.fractions);
        print(sortByValue(f.fractions));
        print(sortByDenominator(f.fractions));
        System.out.println(f.getSecondLargestValue());
    }

    public static void print(List<Fraction> fractions) {
        System.out.println(fractions.toString());
    }

    public static List<Fraction> sortByDenominator(List<Fraction> fractions) {
        List<Fraction> result = new ArrayList<>(fractions);
        result.sort(Comparator.comparing(Fraction::getDenominator));
        return result;
    }

    public static List<Fraction> sortByValue(List<Fraction> fractions) {
        List<Fraction> result = new ArrayList<>(fractions);
        Collections.sort(result);
        return result;
    }
}
