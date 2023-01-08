import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hexStrOri = sc.nextLine();
        sc.close();
        String hexStr = hexStrOri.toUpperCase();
        String binStr = "";
        for (int charIdx = 0; charIdx < hexStr.length(); charIdx++) {
            char inChar = hexStr.charAt(charIdx);
            binStr += inChar >= '0' && inChar <= '9' ? HEX_BITS[inChar - '0'] + " " : HEX_BITS[inChar - 'A' + 10] + " ";
        }
        System.out.printf("The equivalent binary for hexadecimal \"%s\" is: %s%n", hexStrOri, binStr);
    }
}
