import java.util.Scanner;

public class NumberSystemConversion {
    public static int convertToDecimal(String number, int inRadix) {
        number = number.toUpperCase();
        char firstChar = number.charAt(0);
        int inDecimal = ((firstChar >= '0') && (firstChar <= '9')) ? (firstChar - '0') : firstChar - 'A' + 10;

        for (int charIdx = 1; charIdx < number.length(); charIdx++) {
            char inChar = number.charAt(charIdx);
            if (inChar >= '0' && inChar <= '9') {
                inDecimal = inDecimal * inRadix + (inChar - '0');
            } else {
                inDecimal = inDecimal * inRadix + (inChar - 'A' + 10);
            }
        }
        return inDecimal;
    }

    public static String convert(String inStr, int radix, int targetRadix) {
        int decimal = convertToDecimal(inStr, radix);
        if (targetRadix == 10) {
            return String.valueOf(decimal);
        }
        String result = "";
        while (decimal != 0) {
            int remainder = decimal % targetRadix;
            if (remainder < 10) {
                result = remainder + result;
            } else {
                result = (char) ('A' - 10 + remainder) + result;
            }
            decimal /= targetRadix;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inStr = sc.nextLine();
        System.out.print("Enter the input radix: ");
        int base = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the output radix: ");
        int targetBase = Integer.parseInt(sc.nextLine());
        sc.close();
        System.out.printf("%s in radix %d is %s in radix %d", inStr, base, convert(inStr, base, targetBase), targetBase);
    }
}
