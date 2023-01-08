import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        String inStr;
        String encodingStr = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        inStr = sc.nextLine().toUpperCase();
        sc.close();

        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char inChar = inStr.charAt(charIdx);
            if (Character.isLetter(inChar)) {
                char encodingChar = (char) ('A' + 'Z' - inChar);
                encodingStr += encodingChar;
            } else {
                encodingStr += inChar;
            }
        }
        System.out.println("The ciphertext string is: " + encodingStr);
    }
}
