import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberIn;

        while (true) {
            System.out.print("Enter a number between 0-10 or 90-100: ");
            numberIn = sc.nextInt();
            if ((numberIn >= 0 && numberIn <= 10) || (numberIn >= 90 && numberIn <= 100)) {
                System.out.println("You have entered: " + numberIn);
                break;
            } else {
                System.out.println("Invalid input, try again...");
            }
        }
    }
}
