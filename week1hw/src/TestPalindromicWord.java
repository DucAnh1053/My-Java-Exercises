import java.util.Scanner;

public class TestPalindromicWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine().toLowerCase();
        sc.close();

        String revWord = "";
        for (int charIdx = word.length() - 1; charIdx >= 0; charIdx--) {
            revWord += word.charAt(charIdx);
        }
        if (word.equals(revWord)) {
            System.out.println("\"" + word + "\" is a palindrome");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome");
        }
    }
}
