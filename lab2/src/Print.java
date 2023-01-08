public class Print {
    public static void print(int[] array) {
        System.out.print("[");
        for (int idx = 0; idx < array.length; idx++) {
            if (idx == 0) {
                System.out.print(array[idx]);
            } else {
                System.out.print(" ," + array[idx]);
            }
        }
        System.out.println("]");
    }

    public static void print(double[] array) {
        System.out.print("[");
        for (int idx = 0; idx < array.length; idx++) {
            if (idx == 0) {
                System.out.print(array[idx]);
            } else {
                System.out.print(" ," + array[idx]);
            }
        }
        System.out.println("]");
    }

    public static void print(float[] array) {
        System.out.print("[");
        for (int idx = 0; idx < array.length; idx++) {
            if (idx == 0) {
                System.out.print(array[idx]);
            } else {
                System.out.print(" ," + array[idx]);
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 7, 99};
        int[] array2 = {};
        int[] array3 = {1};
        print(array1);
        print(array2);
        print(array3);
    }
}
