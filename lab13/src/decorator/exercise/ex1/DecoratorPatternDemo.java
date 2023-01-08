package decorator.exercise.ex1;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        System.out.println("Circle with normal border");
        Shape circle = new Circle();
        circle.draw();

        System.out.println("\nCircle of red border");
        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();

        System.out.println("\nRectangle of normal border");
        Shape rectangle = new Rectangle();
        rectangle.draw();

        System.out.println("\nRectangle of red border");
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        redRectangle.draw();
    }
}
