import java.util.Scanner;

public class SumProductMinMax2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st integer: ");
        int number1 = in.nextInt();

        System.out.print("Enter 2nd integer: ");
        int number2 = in.nextInt();

        System.out.print("Enter 3rd integer: ");
        int number3 = in.nextInt();

        in.close();

        int sum = number1 + number2 + number3;
        int product = number1 * number2 * number3;
        int min = number1;
        int max = number1;

        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }

        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }

        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }
}
