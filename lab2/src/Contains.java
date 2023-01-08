public class Contains {
    public static boolean contains(int[] array, int key) {
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 5};
        System.out.println(contains(array, 2));
        System.out.println(contains(array, 3));
    }
}
