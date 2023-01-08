import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = sc.nextInt();
        int[] items = new int[NUM_ITEMS];
        System.out.print("Enter the value of all items (seperated by space): ");
        for (int i = 0; i < items.length; i++) {
            items[i] = sc.nextInt();
        }
        sc.close();
        for (int idx = 0; idx < items.length; idx++) {
            System.out.printf("%s(%d)%n", "*".repeat(items[idx]), items[idx]);
        }
    }
}
