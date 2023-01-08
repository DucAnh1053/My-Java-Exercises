package ex1.ex1_7;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = sc.nextDouble();
        double imag1 = sc.nextDouble();
        MyComplex complex1 = new MyComplex(real1, imag1);

        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = sc.nextDouble();
        double imag2 = sc.nextDouble();
        MyComplex complex2 = new MyComplex(real2, imag2);

        System.out.println("Number 1 is: " + complex1);
        if (complex1.isReal()) {
            System.out.println(complex1 + " is a pure real number");
        } else {
            System.out.println(complex1 + " is not a pure real number");
        }

        if (complex1.isImaginary()) {
            System.out.println(complex1 + " is a pure imaginary number");
        } else {
            System.out.println(complex1 + " is not a pure imaginary number");
        }

        System.out.println("Number 2 is: " + complex2);
        if (complex2.isReal()) {
            System.out.println(complex2 + " is a pure real number");
        } else {
            System.out.println(complex2 + " is not a pure real number");
        }

        if (complex2.isImaginary()) {
            System.out.println(complex2 + " is a pure imaginary number");
        } else {
            System.out.println(complex2 + " is not a pure imaginary number");
        }

        if (complex1.equals(complex2)) {
            System.out.println(complex1 + " is equal to " + complex2);
        } else {
            System.out.println(complex1 + " is not equal to " + complex2);
        }

        MyComplex complex3 = complex1.addNew(complex2);
        System.out.println(complex1 + " + " + complex2 + " = " + complex3);
        System.out.println(complex1 + " - " + complex2 + " = " + complex1.subtractNew(complex2).toString());
        System.out.print(complex1 + " * " + complex2 + " = ");
        complex1.multiply(complex2);
        System.out.println(complex1);
        System.out.print(complex1 + " / " + complex2 + " = ");
        complex1.divide(complex2);
        System.out.println(complex1);
    }
}
