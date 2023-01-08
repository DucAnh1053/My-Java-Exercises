import java.util.Scanner;

public class HillPatternD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int numRows = sc.nextInt();
        sc.close();

        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= 2 * numRows - 1; col++) {
                if ((col >= numRows + 2 - row) && (col <= numRows + row - 2)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        for (int row = numRows + 1; row <= 2 * numRows - 1; row++) {
            for (int col = 1; col <= 2 * numRows - 1; col++) {
                if ((col >= row + 2 - numRows) && (col <= 3 * numRows - 2 - row)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
