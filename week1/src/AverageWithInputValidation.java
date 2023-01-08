import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 3;
        int numberIn;
        int sum = 0;
        double average;
        Scanner sc = new Scanner(System.in);

        for (int studentNo = 1; studentNo <= NUM_STUDENTS ; studentNo++) {
            while (true) {
                System.out.print("Enter the mark (0 - 100) for student " + studentNo + ": ");
                numberIn = sc.nextInt();
                if (numberIn >= 0 && numberIn <= 100) {
                    sum += numberIn;
                    break;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            }
        }
        sc.close();
        average = (double) sum/NUM_STUDENTS;
        System.out.printf("The average is: %.2f%n", average);
    }
}
