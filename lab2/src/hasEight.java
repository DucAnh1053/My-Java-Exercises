import java.util.Scanner;

public class hasEight {
    public static boolean hasEight(int number) {
        while (number != 0) {
            int digit = number % 10;
            if (digit == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int magicSum = 0;
        do {
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = sc.nextInt();
            if (hasEight(number)) {
                magicSum += number;
            }
        } while (number != -1);
        System.out.println("The magic sum is: " + magicSum);
    }
}
