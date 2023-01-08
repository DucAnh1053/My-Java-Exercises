import java.util.Scanner;

public class PerfectAndDeficientNumbers {
    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return sum == aPosInt;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return sum < aPosInt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int n = in.nextInt();
        in.close();
        System.out.println("These numbers are perfect:");
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.printf("%n[%d perfect numbers found (%.2f%s)]%n", count, (double) count / n * 100, "%");
        System.out.println("These numbers are neither deficient nor perfect");
        count = 0;
        for (int i = 1; i <= n; i++) {
            if (!isPerfect(i) && !isDeficient(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.printf("%n[%d numbers found (%.2f%s)]%n", count, (double) count / n * 100, "%");
    }
}
