package com.poly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListPoly extends AbstractPoly {
    List<Integer> coefficients;

    public ListPoly(int[] coeffs) {
        coefficients = new ArrayList<>();
        for (int coeff : coeffs) {
            coefficients.add(coeff);
        }
        reduce();
    }

    @Override
    public int coefficient(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public int[] coefficients() {
        int[] poly = new int[coefficients.size()];
        for (int i = 0; i < poly.length; i++) {
            poly[i] = coefficients.get(i);
        }
        return poly;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(differentiate());
    }

    public ListPoly minus(ListPoly poly) {
        int[] result = Arrays.copyOf(coefficients(), Math.max(degree, poly.degree));
        for (int i = 0; i <= poly.degree; i++) {
            result[i] = result[i] - poly.coefficient(i);
        }
        return new ListPoly(result);
    }

    public ListPoly plus(ListPoly poly) {
        int[] result = Arrays.copyOf(coefficients(), Math.max(degree, poly.degree));
        for (int i = 0; i <= poly.degree; i++) {
            result[i] = result[i] + poly.coefficient(i);
        }
        return new ListPoly(result);
    }

    private void reduce() {
        degree = coefficients.size() - 1;
        for (int i = degree; i >= 0; i--) {
            if (coefficient(i) == 0) {
                degree--;
            } else {
                break;
            }
        }
    }

    public ListPoly times(ListPoly poly) {
        int[] result = new int[degree + poly.degree + 1];
        for (int i = 0; i <= degree; i++) {
            for (int j = 0; j <= poly.degree; j++) {
                result[i + j] += coefficient(i) * poly.coefficient(j);
            }
        }
        return new ListPoly(result);
    }

    public String type() {
        return "List Poly";
    }
}
