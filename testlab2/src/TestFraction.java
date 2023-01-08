import java.util.ArrayList;
import java.util.List;

public class TestFraction {
    public static void print(List<Fraction> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                System.out.print(list.get(i));
            } else {
                System.out.print(", " + list.get(i));
            }
        }
        System.out.println();
    }

    public static Fraction getSecondLargestValue(List<Fraction> list){
        return null;
    }

    public static void sortByValue(List<Fraction> list){


    }

    public static void main(String[] args) {
        List<Fraction> fractions = new ArrayList<Fraction>();
        for (int i = 0; i < 30; i++) {
            int numerator = (int) (Math.random() * 1000 + 1);
            int denominator = (int) (Math.random() * 1000 + 1);
            fractions.add(new Fraction(numerator, denominator));
        }
        print(fractions);
        sortByValue(fractions);
        print(fractions);
    }
}
