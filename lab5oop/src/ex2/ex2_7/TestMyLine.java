package ex2.ex2_7;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine line = new MyLine(0, 0, 5, 5);
        System.out.println(line);
        System.out.println("Length = " + line.getLength());
        System.out.println("Gradient = " + line.getGradient());
    }
}
