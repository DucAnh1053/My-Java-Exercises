package com.fraction;

public class Fraction extends Number implements Comparable<Fraction> {
    private int numerator;
    private int denominator;

    public Fraction(Fraction f) {
        this(f.numerator, f.denominator);
    }

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public Fraction add(Fraction f) {
        int newDenominator = denominator * f.denominator / gcd(denominator, f.denominator);
        int newNumerator = newDenominator / denominator * numerator + newDenominator / f.denominator * f.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction add(int number) {
        return add(new Fraction(number));
    }

    @Override
    public int compareTo(Fraction f) {
        int newDenominator = denominator * f.denominator / gcd(denominator, f.denominator);
        return Integer.compare(newDenominator / denominator * numerator, newDenominator / f.denominator * f.numerator);
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    public boolean equals(Fraction f) {
        return compareTo(f) == 0;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return (long) numerator / denominator;
    }

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1);
        Fraction fraction2 = new Fraction(2, 2);
        Fraction fraction3 = new Fraction(1, 4);
        Fraction fraction4 = new Fraction(fraction3);
        System.out.println(fraction1.add(fraction2));
        System.out.println(fraction3.add(fraction4));
        System.out.println(fraction3.doubleValue());
        System.out.println(fraction3.floatValue());
        System.out.println(fraction3.intValue());
        System.out.println(fraction3.longValue());

        Fraction fraction5 = new Fraction(3, 4);
        System.out.println(fraction5);
        fraction5.setDenominator(12);
        System.out.println(fraction5);
        fraction5.setNumerator(4);
        System.out.println(fraction5);

        System.out.println(fraction1.equals(fraction2));
        System.out.println(fraction1.compareTo(fraction3));

    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
        simplify();
    }

    private void simplify() {
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        int fractionGcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= fractionGcd;
        denominator /= fractionGcd;
    }

    @Override
    public String toString() {
        return "Fraction[" + numerator + "/" + denominator + "]";
    }
}
