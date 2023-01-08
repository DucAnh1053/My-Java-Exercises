public class TribonacciInt {
    public static void printIntTribonacci() {
        int f0 = 1;
        int f1 = 1;
        int f2 = 2;
        int fn = f0 + f1 + f2;
        System.out.printf("F(0) = %d%nF(1) = %d%nF(2) = %d%n", f0, f1, f2);
        int idx = 3;
        while (true) {
            System.out.printf("F(%d) = %d%n", idx, fn);
            f0 = f1;
            f1 = f2;
            f2 = fn;
            idx++;
            if (Integer.MAX_VALUE - f2 - f1 < f0) {
                System.out.printf("F(%d) is out of the range of int%n", idx);
                break;
            }
            fn = f0 + f1 + f2;
        }
    }

    public static void main(String[] args) {
        printIntTribonacci();
    }
}