public class LinearSearch {
    public static boolean linearSearch(int[] array, int key) {
        for (int ele : array) {
            if (ele == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7};
        System.out.println(linearSearch(arr, 7));
        System.out.println(linearSearchIndex(arr, 7));
        System.out.println(linearSearch(arr, 11));
        System.out.println(linearSearchIndex(arr, 11));
    }
}
