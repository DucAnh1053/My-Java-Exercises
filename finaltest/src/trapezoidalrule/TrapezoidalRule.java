package trapezoidalrule;
public class TrapezoidalRule {
    public static void main(String[] args) {
        /* TODO */
        System.out.println(integrate());
        
    }

    public static double f(double x) {
        /* TODO */
        return Math.sin(x) * Math.sin(x) * Math.cos(x);
    }

    public static double integrate(int n) {
        /* TODO */
        double h = (Math.PI / 2) / n;
        double sum = 0;
        for (int i = 1; i < n; i++) {
            sum += f(i * h);
        }
        sum += (f(0 * h) + f(n * h)) / 2;
        sum *= h;
        return sum;
    }

    public static double integrate() {
        /* TODO */
        int count = 0;
        int n = 2;
        double ln;
        double l2n = integrate(n);
        do {
            ln = l2n;
            n *= 2;
            l2n = integrate(n);
            count++;
        } while (Math.abs(l2n - ln) >= 1.0e-6);
        System.out.println(count);
        return l2n;
    }
}