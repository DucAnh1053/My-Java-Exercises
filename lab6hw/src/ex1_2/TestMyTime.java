package ex1_2;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime t1 = new MyTime(23, 59, 0);
        System.out.println(t1);
        System.out.println("one second before: " + t1.previousSecond());
        System.out.println("one minute before: " + t1.previousMinute());
        System.out.println("one hour before: " + t1.previousHour());

        MyTime t2 = new MyTime();
        t2.setTime(1, 2, 59);
        System.out.println(t2);
        System.out.println("one second later: " + t1.nextSecond());
        System.out.println("one minute later: " + t1.nextMinute());
        System.out.println("one hour later: " + t1.nextHour());

        try {
            MyTime t3 = new MyTime(25, 5, 3);
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid hour, minute, or second!");
        }
    }
}
