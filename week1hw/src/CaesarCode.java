import java.util.Scanner;

public class CaesarCode {
    public static String encodeCaesar(String inStr, int key) {
        String result = "";
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char inChar = inStr.charAt(charIdx);
            if (Character.isLetter(inChar)) {
                char encodingChar = (char)((inChar + key - 39)%26 + 65);
                result += encodingChar;
            } else {
                result += inChar;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int key = 3;
        String inStr;
        String encodingStr = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        inStr = sc.nextLine().toUpperCase();
        sc.close();

        System.out.println("The ciphertext string is: " + encodeCaesar(inStr, key));
    }
}
