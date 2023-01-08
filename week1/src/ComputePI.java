public class ComputePI {
    public static void main(String[] args) {
        double sum = 0.0;
        int MAX_DENOMINATOR = 1000000;
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2){
            if (denominator % 4 == 1){
                sum += (double) 1/denominator;
            } else if (denominator % 4 == 3) {
                sum -= (double) 1/denominator;
            } else {
                System.out.println("Impossible!!!");
            }
        }
        double piComputed = 4 * sum;
        System.out.println("Pi = " + piComputed);
        double comparePi = (piComputed/Math.PI) * 100;
        System.out.println("Compare piComputed and Math.pi: " + comparePi);

        // Use MAX_TERM instead
        int MAX_TERM = 1000000;
        sum = 0.0;
        for (int term = 1; term <= MAX_TERM; term ++) {
            if (term % 2 == 1) {
                sum += 1.0 / (term * 2 - 1);
            } else {
                sum -= 1.0 / (term * 2 - 1);
            }
        }
        piComputed = 4 * sum;
        System.out.println("Pi = " + piComputed + " (MAX_TERM instead)");
    }
}
