import java.util.Scanner;

public class PrimeFactors {
    public static boolean isProductOfPrimeFactors(int aPosInt) {
        if (aPosInt == 1) {
            return false;
        }
        int product = 1;
        for (int i = 2; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0 && PrimeList.isPrime(i)) {
                product *= i;
                if (product > aPosInt) {
                    return false;
                }
            }
        }
        return product == aPosInt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upper = sc.nextInt();
        sc.close();
        int count = 0;
        for (int i = 1; i <= upper; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.printf("%n[%d numbers found (%.2f%s)]%n", count, (double) count / upper * 100, "%");
    }
}
