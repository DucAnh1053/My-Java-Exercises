package com.poly;

public abstract class AbstractPoly implements Poly {
    int degree;

    public AbstractPoly() {
    }

    @Override
    public int degree() {
        return degree;
    }

    int[] differentiate() {
        if (degree == 0) {
            return new int[]{0};
        }
        int[] diff = new int[degree];
        for (int i = 0; i < degree; i++) {
            diff[i] = coefficient(i + 1) * (i + 1);
        }
        return diff;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof AbstractPoly abstractPoly)) {
            return false;
        }
        if (abstractPoly.degree != degree) {
            return false;
        }
        for (int i = 0; i <= degree; i++) {
            if (abstractPoly.coefficient(i) != coefficient(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public double evaluate(double x) {
        double result = 0.0;
        for (int i = 0; i <= degree; i++) {
            result += coefficient(i) * Math.pow(x, i);
        }
        return result;
    }

    @Override
    public String toString() {
        if (degree < 0) {
            return "Poly[0]";
        }
        StringBuilder str = new StringBuilder("Poly[");
        for (int i = 0; i <= degree; i++) {
            if (coefficient(i) != 0) {
                if (i == 0) {
                    str.append(coefficient(i)).append("+");
                } else if (i == 1) {
                    str.append(coefficient(i)).append("x").append("+");
                } else {
                    str.append(coefficient(i)).append("x^").append(i).append("+");
                }
            }
        }
        str.delete(str.length() - 1, str.length());
        str.append("]");
        return str.toString().replace("+-", "-");
    }
}
