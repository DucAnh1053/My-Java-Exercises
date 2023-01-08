import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Key in your guess: ");
        while (true) {
            count++;
            int guess = sc.nextInt();
            if (guess > SECRET_NUMBER) {
                System.out.println("Try lower");
            } else if (guess < SECRET_NUMBER) {
                System.out.println("Try higher");
            } else {
                System.out.printf("You got it in %d trials!", count);
                break;
            }
        }
        sc.close();
    }
}
