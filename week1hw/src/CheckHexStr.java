import java.util.Scanner;

public class CheckHexStr {
    public static boolean isHexStr(String hexStr) {
        hexStr = hexStr.toUpperCase();
        for (int charIdx = 0; charIdx < hexStr.length(); charIdx++) {
            char inChar = hexStr.charAt(charIdx);
            if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F'))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String hexStr;
        boolean isHex = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        hexStr = sc.nextLine();
        sc.close();

        if (isHexStr(hexStr)) {
            System.out.println("\"" + hexStr + "\" is a hex string");
        } else {
            System.out.println("\"" + hexStr + "\" is not a hex string");
        }
    }
}
