package ex2.ex2_10;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rectangle = new MyRectangle(0, 5, 5, 0);
        System.out.println(rectangle);
        System.out.println("Diagonal = " + rectangle.getDiagonal());
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());
    }
}
