public class GCD {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(15, 5));
        System.out.println(gcd(5, 0));
        System.out.println(gcd(3456, 1233));
    }
}
