package ex1.ex1_8;

public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial polynomial1 = new MyPolynomial(2, -3, 1);
        double[] coeffs = {5, 0, 0, 3, 2};
        MyPolynomial polynomial2 = new MyPolynomial(coeffs);
        System.out.println(polynomial1);
        System.out.println("degree: " + polynomial1.getDegree());
        System.out.println(polynomial2);
        System.out.println("degree: " + polynomial2.getDegree());
        System.out.print("(" + polynomial1 + ") + (" + polynomial2 + ") = ");
        polynomial1.add(polynomial2);
        System.out.println(polynomial1);
        System.out.print("(" + polynomial1 + ") * (" + polynomial2 + ") = ");
        polynomial1.multiply(polynomial2);
        System.out.println(polynomial1);
    }
}
