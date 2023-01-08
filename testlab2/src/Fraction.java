public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction f) {
        int lcm = lcm(this.denominator, f.denominator);
        int newNumerator = this.numerator * (lcm / f.denominator) + f.numerator * (lcm / this.denominator);
        return new Fraction(newNumerator, lcm);
    }

    public Fraction add(int num) {
        int newNumerator = this.numerator + num * this.denominator;
        return new Fraction(newNumerator, this.denominator);
    }

    public int compareTo(Fraction f) {
        if (this.numerator * f.denominator > f.numerator * this.denominator) {
            return 1;
        } else if (this.numerator * f.denominator == f.numerator * this.denominator) {
            return 0;
        } else {
            return -1;
        }
    }

    public boolean equals(Fraction f) {
        return this.numerator * f.denominator == f.numerator * this.denominator;
    }

    public float floatValue() {
        return (float) this.numerator / this.denominator;
    }

    private int gcd(int num1, int num2) {
        while (num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }

    private int lcm(int num1, int num2) {
        return num1 / gcd(num1, num2) * num2;
    }

    public void simplify() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    @Override
    public String toString() {
        return "Fraction[" + this.numerator + "/" + this.denominator + "]";
    }
}