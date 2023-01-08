package ex1.ex1_4;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println("color: " + s1.getColor());
        System.out.println("filled: " + s1.isFilled());

        s1.setColor("blue");
        s1.setFilled(false);
        System.out.println(s1);

        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println("Area = " + circle.getArea());
        System.out.println("Perimeter = " + circle.getPerimeter());

        Rectangle rec = new Rectangle();
        System.out.println(rec);
        System.out.println("Area = " + rec.getArea());
        System.out.println("Perimeter = " + rec.getPerimeter());

        Square square = new Square();
        System.out.println(square);
        System.out.println("Area = " + square.getArea());
        System.out.println("Perimeter = " + square.getPerimeter());
        square.setWidth(5);
        System.out.println(square);
    }
}
