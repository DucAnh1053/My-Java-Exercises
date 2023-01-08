import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.nextLine();
        sc.close();

        String reverseStr = "";
        for (int charIdx = inStr.length() - 1; charIdx >= 0; charIdx--) {
            reverseStr += inStr.charAt(charIdx);
        }
        System.out.println("The reverse of the String \"" + inStr + "\" is \"" + reverseStr + "\"");
    }
}
