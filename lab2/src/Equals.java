public class Equals {
    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int idx = 0; idx < array1.length; idx++) {
            if (array1[idx] != array2[idx]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 4};
        int[] array2 = {1, 3};
        int[] array3 = {};
        System.out.println(equals(array1, array1));
        System.out.println(equals(array1, array2));
        System.out.println(equals(array1, array3));
    }
}
