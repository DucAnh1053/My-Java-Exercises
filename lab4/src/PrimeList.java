import java.util.Scanner;

public class PrimeList {
    public static boolean isPrime(int aPosInt) {
        if (aPosInt < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the upper bound: ");
        int n = sc.nextInt();
        sc.close();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.printf("%n[%d primes found (%.2f%s)]%n", count, (double) count / n * 100, "%");
    }
}
