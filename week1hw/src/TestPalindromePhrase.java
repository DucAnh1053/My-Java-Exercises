import java.util.Scanner;

public class TestPalindromePhrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String oriPhrase = sc.nextLine();
        sc.close();

        String revPhrase = "";
        String phrase = oriPhrase.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        for (int charIdx = phrase.length() - 1; charIdx >= 0; charIdx--) {
            revPhrase += phrase.charAt(charIdx);
        }
        if (phrase.equals(revPhrase)) {
            System.out.println("\"" + oriPhrase + "\" is a palindrome");
        } else {
            System.out.println("\"" + oriPhrase + "\" is not a palindrome");
        }
    }
}
