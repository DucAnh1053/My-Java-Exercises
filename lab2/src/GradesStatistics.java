import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        final int NUM_STUDENTS = sc.nextInt();
        int[] grades = new int[NUM_STUDENTS];
        int sumGrades = 0;
        int minGrades = 101;
        int maxGrades = -1;
        for (int idx = 0; idx < grades.length; idx++) {
            while (true) {
                System.out.print("Enter the grade for students " + (idx + 1) + ": ");
                grades[idx] = sc.nextInt();
                if (grades[idx] >= 0 && grades[idx] <= 100) {
                    break;
                }
                System.out.println("Invalid grade. Grade must be between 0 to 100");
            }
            sumGrades += grades[idx];
            if (grades[idx] < minGrades) minGrades = grades[idx];
            if (grades[idx] > maxGrades) maxGrades = grades[idx];
        }
        sc.close();
        System.out.printf("The average is: %.2f%n", (double) sumGrades/NUM_STUDENTS);
        System.out.printf("The minimum: %d%n", minGrades);
        System.out.printf("The maximum: %d%n", maxGrades);
    }
}
