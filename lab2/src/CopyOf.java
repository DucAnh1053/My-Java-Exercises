import java.util.Arrays;

public class CopyOf {
    public static int[] copyOf(int[] array) {
        int[] copyArray = new int[array.length];
        for (int idx = 0; idx < array.length; idx++) {
            copyArray[idx] = array[idx];
        }
        return copyArray;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] copyArray = new int[newLength];
        for (int idx = 0; idx < newLength; idx++) {
            copyArray[idx] = array[idx];
        }
        return copyArray;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 4};
        int[] array2 = copyOf(array1);
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(copyOf(array1, 1)));
    }
}
