import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        int key = 3;
        String inStr;
        String decodingStr = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        inStr = sc.nextLine().toUpperCase();
        sc.close();

        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char inChar = inStr.charAt(charIdx);
            if (Character.isLetter(inChar)) {
                char decodingChar = (char) ((inChar - key - 39) % 26 + 65);
                decodingStr += decodingChar;
            } else {
                decodingStr += inChar;
            }
        }

        System.out.println("The plaintext string is: " + decodingStr);
    }
}
