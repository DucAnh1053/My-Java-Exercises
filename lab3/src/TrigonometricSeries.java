public class TrigonometricSeries {
    public static double sin(double x, int numTerms) {
        double result = 0.0;
        for (int i = 0; i < numTerms; i++) {
            double term = 1.0;
            for (int j = 0; j < 2 * i + 1; j++) {
                term *= x / (j + 1) * (-1.0);
            }
            term *= Math.pow(-1.0, i);
            result += term;
        }
        return result;
    }

    public static double cos(double x, int numTerms) {
        double result = 0.0;
        for (int i = 0; i < numTerms; i++) {
            double term = 1.0;
            for (int j = 0; j < 2 * i; j++) {
                term *= x / (j + 1);
            }
            term *= Math.pow(-1.0, i);
            result += term;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("sin(pi/22)");
        System.out.println("n = 3: " + sin(Math.PI / 22, 3));
        System.out.println("n = 1000: " + sin(Math.PI / 22, 1000));
        System.out.println("Math.sin: " + Math.sin(Math.PI / 22));
        System.out.println();
        System.out.println("cos(pi/22)");
        System.out.println("n = 3: " + cos(Math.PI / 22, 3));
        System.out.println("n = 1000: " + cos(Math.PI / 22, 1000));
        System.out.println("Math.cos: " + Math.cos(Math.PI / 22));
    }
}
