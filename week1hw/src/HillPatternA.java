import java.util.Scanner;

public class HillPatternA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int numRows = sc.nextInt();
        sc.close();

        for (int row = 1; row <= numRows ; row++) {
            for (int col = 1; col <= 2*numRows - 1; col++) {
                if ((col >= numRows + 1 - row) && (col <= numRows + row -1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
