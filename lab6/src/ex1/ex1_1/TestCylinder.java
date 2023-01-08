package ex1.ex1_1;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Radius is " + cylinder1.getRadius()
                + ", Height is " + cylinder1.getHeight()
                + ", Color is " + cylinder1.getColor()
                + ", Base area is " + cylinder1.getArea()
                + ", Volume is " + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(10.0);
        System.out.println("Radius is " + cylinder2.getRadius()
                + ", Height is " + cylinder2.getHeight()
                + ", Color is " + cylinder2.getColor()
                + ", Base area is " + cylinder2.getArea()
                + ", Volume is " + cylinder2.getVolume());

        Cylinder cylinder3 = new Cylinder(2.0, 10.0);
        System.out.println("Radius is " + cylinder3.getRadius()
                + ", Height is " + cylinder3.getHeight()
                + ", Color is " + cylinder3.getColor()
                + ", Base area is " + cylinder3.getArea()
                + ", Volume is " + cylinder3.getVolume());

        System.out.println(cylinder3);
    }
}
