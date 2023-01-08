public class BinarySearch {
    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            return key == array[fromIdx];
        }
        int middleIdx = (fromIdx + toIdx) / 2;
        if (key == array[middleIdx]) {
            return true;
        } else if (key > array[middleIdx]) {
            fromIdx = middleIdx;
        } else {
            toIdx = middleIdx;
        }
        return binarySearch(array, key, fromIdx, toIdx);
    }

    public static boolean binarySearch(int[] arr, int key) {
        return binarySearch(arr, key, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7};
        System.out.println(binarySearch(arr, 11));
        System.out.println(binarySearch(arr, 3));
    }
}
