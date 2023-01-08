package ex1.ex1_1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The circle has the radius of " + circle1.getRadius() + " and area of " + circle1.getArea());

        Circle circle2 = new Circle(2.0);
        System.out.println("The circle has the radius of " + circle2.getRadius() + " and area of " + circle2.getArea());

        Circle circle3 = new Circle(3.0, "black");
        System.out.println("Color is " + circle3.getColor());

        Circle circle4 = new Circle();
        circle4.setRadius(5.5);
        System.out.println("Radius is " + circle4.getRadius());
        circle4.setColor("green");
        System.out.println("Color is " + circle4.getColor());

        System.out.println(circle4.toString());
        System.out.println(circle4);
    }
}
