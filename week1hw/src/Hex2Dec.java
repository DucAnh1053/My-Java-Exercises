import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hexStr = sc.nextLine();
        sc.close();

        try {
            System.out.println("The equivalent decimal number for hexadecimal \"" + hexStr + "\" is: " + Integer.parseInt(hexStr, 16));
        } catch (NumberFormatException e) {
            System.out.println("error: invalid hexadecimal string \"" + hexStr + "\"");
        }
    }
}
