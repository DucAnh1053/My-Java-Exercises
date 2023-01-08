import java.util.Scanner;

public class Dec2Hex {
    public static String toHex(int decimal) {
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexStr = "";
        while (decimal != 0) {
            int remainder = decimal % 16;
            decimal /= 16;
            hexStr = hexChars[remainder] + hexStr;
        }
        return hexStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        sc.close();
        System.out.println("The equivalent hexadecimal number is " + toHex(decimal));
    }
}
