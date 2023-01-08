import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics211 {
    public static int[] grades;

    public static void readGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberStudents = sc.nextInt();
        grades = new int[numberStudents];
        for (int idx = 0; idx < grades.length; idx++) {
            while (true) {
                System.out.print("Enter the grade for students " + (idx + 1) + ": ");
                grades[idx] = sc.nextInt();
                if (grades[idx] >= 0 && grades[idx] <= 100) {
                    break;
                }
                System.out.println("Invalid grade. Grade must be between 0 to 100");
            }
        }
        sc.close();
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int idx = 0; idx < array.length; idx++) {
            if (idx == 0) {
                System.out.print(array[idx]);
            } else {
                System.out.print(" ," + array[idx]);
            }
        }
        System.out.println("]");
    }

    public static double average(int[] array) {
        int sumGrades = 0;
        for (int idx = 0; idx < array.length; idx++) {
            sumGrades += array[idx];
        }
        return (double) sumGrades / array.length;
    }

    public static double median(int[] array) {
        Arrays.sort(array);
        int lenArr = array.length;
        if (lenArr % 2 == 0) {
            return (array[lenArr / 2 - 1] + array[lenArr / 2]) / 2.0;
        } else {
            return array[lenArr / 2];
        }
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int idx = 1; idx < array.length; idx++) {
            if (array[idx] > max) {
                max = array[idx];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int idx = 1; idx < array.length; idx++) {
            if (array[idx] < min) {
                min = array[idx];
            }
        }
        return min;
    }

    public static double stdDev(int[] array) {
        double mean = average(array);
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Math.pow(array[i], 2.0) - Math.pow(mean, 2.0);
        }
        return Math.sqrt(sum / array.length);
    }

    public static void main(String[] args) {
        readGrades();
        System.out.print("The grade are: ");
        print(grades);
        System.out.printf("The average is %.2f%n", average(grades));
        System.out.printf("The median is %.2f%n", median(grades));
        System.out.println("The minimum is " + min(grades));
        System.out.println("The maximum is " + max(grades));
        System.out.printf("The standard deviation is %.2f%n", stdDev(grades));
    }
}
