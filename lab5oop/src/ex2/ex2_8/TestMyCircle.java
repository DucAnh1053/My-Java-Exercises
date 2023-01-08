package ex2.ex2_8;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(0, 1, 2);
        MyCircle circle2 = new MyCircle();
        System.out.println(circle1);
        System.out.println("Area = " + circle1.getArea());
        System.out.println("Circumference = " + circle1.getCircumference());
        System.out.println(circle2);
        System.out.println("Area = " + circle2.getArea());
        System.out.println("Circumference = " + circle2.getCircumference());
        System.out.println("Distance between c1 and c2 = " + circle1.distance(circle2));
    }
}
