import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minPos]) {
                    minPos = j;
                }
            }
            int temp = data[i];
            data[i] = data[minPos];
            data[minPos] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 0, 55, 43, 100, 99};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}