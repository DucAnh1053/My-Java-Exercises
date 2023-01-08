public class ArrayToString {
    public static String arrayToString(int[] array) {
        String inStr = "[";
        for (int idx = 0; idx < array.length; idx++) {
            if (idx == 0) {
                inStr += array[idx];
            } else inStr += ", " + array[idx];
        }
        return inStr += "]";
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 5};
        System.out.println(arrayToString(array));
    }
}
