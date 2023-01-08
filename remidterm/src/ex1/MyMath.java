package ex1;

import java.math.BigInteger;

public class MyMath {
    public MyMath() {
    }

    public static double cos(double x) {
        double result = 1.0;
        double tmp = 1.0;
        for (int i = 1; i <= 100; i++) {
            tmp *= -(x * x) / ((2 * i - 1) * 2 * i);
            result += tmp;
        }
        return result;
    }

    public static String decimalTo(String number, int outRadix) {
        if (!(outRadix >= 2 && outRadix <= 16)) {
            return null;
        }
        BigInteger decimal = new BigInteger(number);
        BigInteger outRad = BigInteger.valueOf(outRadix);
        String result = "";
        while (!decimal.equals(BigInteger.ZERO)) {
            int remainder = decimal.remainder(outRad).intValue();
            if (remainder < 10) {
                result = remainder + result;
            } else {
                result = (char) ('A' - 10 + remainder) + result;
            }
            decimal = decimal.divide(outRad);
        }
        return result;
    }

    public static double exp(double x) {
        double result = 1.0;
        double tmp = 1.0;
        for (int i = 1; i <= 100; i++) {
            tmp *= x / i;
            result += tmp;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("My code to calculate e^2.2cos(3.3): ");
        System.out.println(exp(2.2) * cos(3.3));
        System.out.println("Math library: ");
        System.out.println(Math.exp(2.2) * Math.cos(3.3));
        System.out.println("My code to convert 123456789123456789 from base 13 to base 8");
        System.out.println(toRadix("123456789123456789", 13, 8));
        System.out.println("BigInteger library: ");
        System.out.println(new BigInteger("123456789123456789", 13).toString(8));
    }

    public static String toDecimal(String number, int inRadix) {
        if (!(inRadix >= 2 && inRadix <= 16)) {
            return null;
        }
        number = number.toUpperCase();
        char firstChar = number.charAt(0);
        int inDecimal = ((firstChar >= '0') && (firstChar <= '9')) ? (firstChar - '0') : firstChar - 'A' + 10;
        BigInteger result = BigInteger.valueOf(inDecimal);
        BigInteger inRad = BigInteger.valueOf(inRadix);

        for (int charIdx = 1; charIdx < number.length(); charIdx++) {
            char inChar = number.charAt(charIdx);
            if (inChar >= '0' && inChar <= '9') {
                result = result.multiply(inRad).add(BigInteger.valueOf(inChar - '0'));
            } else {
                result = result.multiply(inRad).add(BigInteger.valueOf(inChar - 'A' + 10));
            }
        }
        return result.toString();
    }

    public static String toRadix(String number, int inRadix, int outRadix) {
        return decimalTo(toDecimal(number, inRadix), outRadix);
    }
}
