public class FibonacciInt {
    public static void printIntFibonacci() {
        int f0 = 1;
        int f1 = 1;
        int fn = f0 + f1;
        System.out.printf("F(0) = %d%nF(1) = %d%n", f0, f1);
        int idx = 2;
        while (true) {
            System.out.printf("F(%d) = %d%n", idx, fn);
            f0 = f1;
            f1 = fn;
            idx++;
            if (Integer.MAX_VALUE - f1 < f0) {
                System.out.printf("F(%d) is out of the range of int%n", idx);
                break;
            }
            fn = f0 + f1;
        }
    }

    public static void main(String[] args) {
        printIntFibonacci();
    }
}
