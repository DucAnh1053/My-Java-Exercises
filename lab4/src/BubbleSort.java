import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swap = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 0, 55, 43, 100, 99};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
