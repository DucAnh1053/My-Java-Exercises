import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.nextLine().toLowerCase();
        sc.close();

        int inStrLen = inStr.length();
        int numOfVowels = 0;
        int numOfDigits = 0;

        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            char ch = inStr.charAt(charIdx);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                numOfVowels++;
            }
            if (Character.isDigit(ch)) {
                numOfDigits++;
            }
        }
        System.out.printf("%s%d (%.2f%%)%n", "Number of vowels: ", numOfVowels, (double) numOfVowels / inStrLen * 100);
        System.out.printf("%s%d (%.2f%%)%n", "Number of digits: ", numOfDigits, (double) numOfDigits / inStrLen * 100);
    }
}
