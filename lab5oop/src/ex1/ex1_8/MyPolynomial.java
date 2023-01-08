package ex1.ex1_8;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        int deg = getDegree();
        if (deg == 0) {
            return "" + coeffs[0];
        }
        StringBuilder polyStr = new StringBuilder();
        for (int i = getDegree(); i > 1; i--) {
            if (coeffs[i] == 0) {
                continue;
            }
            polyStr.append(coeffs[i]).append("x^").append(i).append(" + ");
        }
        if (coeffs[1] != 0) {
            polyStr.append(coeffs[1]).append("x").append(" + ");
        }
        if (coeffs[0] != 0) {
            polyStr.append(coeffs[0]);
        }
        return polyStr.toString().replace("+ -", "- ").replace("1.0x", "x");
    }

    public double evaluate(double x) {
        int deg = getDegree();
        double result = 0.0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        double[] result = new double[Math.max(coeffs.length, right.coeffs.length)];
        for (int i = 0; i < coeffs.length; i++) {
            result[i] += coeffs[i];
        }
        for (int i = 0; i < right.coeffs.length; i++) {
            result[i] += right.coeffs[i];
        }
        coeffs = result;
        return this;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] result = new double[coeffs.length + right.coeffs.length - 1];
        for (int i = 0; i < coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                result[i + j] += coeffs[i] * right.coeffs[j];
            }
        }
        coeffs = result;
        return this;
    }
}
