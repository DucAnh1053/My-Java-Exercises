import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            for (int j = i - 1; j >= 0; j--) {
                if (data[j] > key) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 0, 55, 43, 100, 99};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
