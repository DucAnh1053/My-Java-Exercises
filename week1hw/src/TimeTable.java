import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        sc.close();

        System.out.printf("%-3s|", "*");
        for (int num = 1; num <= size ; num++) {
            System.out.printf("%4d", num);
        }
        System.out.printf("%n%s%n", "----".repeat(size + 1));

        for (int row = 1; row <= size ; row++) {
            System.out.printf("%-3d|", row);
            for (int col = 1; col <= size; col++) {
                System.out.printf("%4d", col * row);
            }
            System.out.println();
        }
    }
}
