public class Search {
    public static int search(int[] array, int key) {
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] == key) {
                return idx;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 5};
        System.out.println(search(array, 2));
        System.out.println(search(array, 3));
    }
}
