import java.util.Arrays;

public class Swap {
    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int idx = 0; idx < array1.length; idx++) {
            int temp = array1[idx];
            array1[idx] = array2[idx];
            array2[idx] = temp;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 7, 8, 9, 11};
        swap(array1, array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
