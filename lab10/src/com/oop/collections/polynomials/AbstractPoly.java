package com.oop.collections.polynomials;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    double[] derive() {
        if (degree() == 0) {
            return new double[]{0};
        }
        double[] diff = new double[degree()];
        for (int i = 0; i < degree(); i++) {
            diff[i] = coefficient(i + 1) * (i + 1);
        }
        return diff;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof AbstractPoly abstractPoly)) {
            return false;
        }
        if (abstractPoly.degree() != degree()) {
            return false;
        }
        for (int i = 0; i <= degree(); i++) {
            if (coefficient(i) != abstractPoly.coefficient(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        if (degree() == 0) {
            return "" + coefficient(0);
        }
        StringBuilder polyStr = new StringBuilder();
        for (int i = degree(); i > 1; i--) {
            if (coefficient(i) == 0) {
                continue;
            }
            polyStr.append(coefficient(i)).append("x^").append(i).append(" + ");
        }
        if (coefficient(1) != 0) {
            polyStr.append(coefficient(1)).append("x").append(" + ");
        }
        if (coefficient(0) != 0) {
            polyStr.append(coefficient(0));
        }
        return polyStr.toString().replace("+ -", "- ").replace("1.0x ", "x ");
    }
}
