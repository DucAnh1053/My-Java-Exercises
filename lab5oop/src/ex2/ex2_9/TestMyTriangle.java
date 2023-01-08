package ex2.ex2_9;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle triangle = new MyTriangle(0, 0, 1, 1, 0, 2);
        System.out.println(triangle);
        System.out.println("Perimeter = " + triangle.getPerimeter());
        System.out.println(triangle + " is " + triangle.getType());
    }
}
