package ex2;

import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        /* TODO */
        // Tạo một mảng các số tự nhiên, các số tự nhiên được sinh ngẫu nhiên
        // In ra mảng vừa tạo theo định dạng, ví dụ [1 2 3 4 5].
        // Sắp xếp mảng theo thứ tự tăng dần sử dụng các thuật toán sắp xếp khác nhau.
        // In ra mảng sau khi sắp xếp.
        // In ra số lần đổi vị trí trong thuật toán đang sử dụng.
        // Ví dụ:
        // Using Bubble Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Using Selection Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Kết quả chạy chương trình lưu vào file SortStrategy<Mã sinh viên>.txt và nộp cùng source code.
        Random generator = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(100);
        }
        int[] array1 = Arrays.copyOf(array, array.length);
        int[] array2 = Arrays.copyOf(array, array.length);
        int[] array3 = Arrays.copyOf(array, array.length);

        SortStrategy sortStrategy = SortStrategy.getInstance();

        System.out.println("Using Bubble Sort Algorithm");
        sortStrategy.setSortee(new BubbleSort());
        System.out.println("Before sorting: " + Arrays.toString(array1));
        int swap1 = sortStrategy.sort(array1);
        System.out.println("After sorting: " + Arrays.toString(array1));
        System.out.println("Number of swap: " + swap1);

        System.out.println("Using Selection Sort Algorithm");
        sortStrategy.setSortee(new SelectionSort());
        System.out.println("Before sorting: " + Arrays.toString(array2));
        int swap2 = sortStrategy.sort(array2);
        System.out.println("After sorting: " + Arrays.toString(array2));
        System.out.println("Number of swap: " + swap2);

        System.out.println("Using Insertion Sort Algorithm");
        sortStrategy.setSortee(new InsertionSort());
        System.out.println("Before sorting: " + Arrays.toString(array3));
        int swap3 = sortStrategy.sort(array3);
        System.out.println("After sorting: " + Arrays.toString(array3));
        System.out.println("Number of swap: " + swap3);
    }
}
