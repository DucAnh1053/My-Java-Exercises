public class SpecialSeries {
    public static double specialSeries(double x, int numTerms) {
        double result = 0.0;
        for (int i = 1; i <= numTerms; i++) {
            double term = 1.0;
            for (int j = 1; j < 2 * i - 1; j++) {
                if (j % 2 == 0) {
                    term /= j;
                } else {
                    term *= j;
                }
            }
            term *= Math.pow(x, 2 * i - 1) / (2 * i - 1);
            result += term;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(specialSeries(3, 3));
    }
}
