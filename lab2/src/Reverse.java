import java.util.Arrays;

public class Reverse {
    public static void reverse(int[] array) {
        for (int idx = 0; idx < array.length / 2; idx++) {
            int temp = array[idx];
            array[idx] = array[array.length - idx - 1];
            array[array.length - idx - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5, 6};
        reverse(array1);
        reverse(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
