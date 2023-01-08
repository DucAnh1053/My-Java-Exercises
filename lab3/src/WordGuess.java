import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordGuess {
    public static String getRandomWord(String path) {
        try {
            List<String> lines = new ArrayList<String>();
            Scanner file = new Scanner(new File(path));
            while (file.hasNextLine()) {
                lines.add(file.nextLine());
            }
            Random r = new Random();
            return lines.get(r.nextInt(lines.size()));

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }
    }

    public static boolean isWin(String[] board) {
        return Arrays.toString(board).contains("-");
    }

    public static boolean updateBoard(String[] board, String secret, String guess) {
        if (guess.length() == secret.length()) {
            board = secret.split("");
            return false;
        }
        if (guess.length() == 1) {
            for (int charIdx = 0; charIdx < secret.length(); charIdx++) {
                String letter = Character.toString(secret.charAt(charIdx));
                if (guess.equals(letter)) {
                    board[charIdx] = letter;
                }
            }
            if (Arrays.toString(board).contains("-")) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(String[] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i] + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        final String SECRET_WORD = getRandomWord("word.txt");
        String[] gameBoard = new String[SECRET_WORD.length()];
        Arrays.fill(gameBoard, "-");
        int count = 0;
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        System.out.println(SECRET_WORD);
        printBoard(gameBoard);
        while (true) {
            count++;
            System.out.print("Key in one character of your guess word: ");
            String guess = sc.nextLine().toLowerCase();
            isRunning = updateBoard(gameBoard, SECRET_WORD, guess);
            if (isRunning) {
                System.out.print("Trial " + count + ": ");
                printBoard(gameBoard);
            } else {
                System.out.println("Congratulation!");
                System.out.printf("You got in %d trials", count);
                break;
            }
        }
    }
}
