package com.poly;

import java.util.Arrays;

public class ArrayPoly extends AbstractPoly {
    int[] coefficients;

    public ArrayPoly(int[] coeffs) {
        coefficients = coeffs;
        reduce();
    }

    @Override
    public int coefficient(int degree) {
        return coefficients[degree];
    }

    @Override
    public int[] coefficients() {
        return coefficients;
    }

    @Override
    public Poly derivative() {
        return new ArrayPoly(differentiate());
    }

    public ArrayPoly minus(ArrayPoly poly) {
        int[] result = Arrays.copyOf(coefficients(), Math.max(degree, poly.degree));
        for (int i = 0; i <= poly.degree; i++) {
            result[i] = result[i] - poly.coefficient(i);
        }
        return new ArrayPoly(result);
    }

    public ArrayPoly plus(ArrayPoly poly) {
        int[] result = Arrays.copyOf(coefficients(), Math.max(degree, poly.degree));
        for (int i = 0; i <= poly.degree; i++) {
            result[i] = result[i] + poly.coefficient(i);
        }
        return new ArrayPoly(result);
    }

    private void reduce() {
        degree = coefficients.length - 1;
        for (int i = degree; i >= 0; i--) {
            if (coefficient(i) == 0) {
                degree--;
            } else {
                break;
            }
        }
    }

    public ArrayPoly times(ArrayPoly poly) {
        int[] result = new int[degree + poly.degree + 1];
        for (int i = 0; i <= degree; i++) {
            for (int j = 0; j <= poly.degree; j++) {
                result[i + j] += coefficient(i) * poly.coefficient(j);
            }
        }
        return new ArrayPoly(result);
    }

    public String type() {
        return "Array Poly";
    }
}
