import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String binStr = sc.nextLine();
        sc.close();

        try {
            System.out.println("The equivalent decimal number for binary \"" + binStr + "\" is: " + Integer.parseInt(binStr, 2));
        } catch (NumberFormatException e) {
            System.out.println("error: invalid binary string \"" + binStr + "\"");
        }
    }
}
