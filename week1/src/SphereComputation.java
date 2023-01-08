import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius;
        double surfaceArea;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scan.nextDouble();
        scan.close();

        surfaceArea = 4 * Math.PI * radius * radius;
        volume = (double) 4/3 * Math.PI * radius * radius * radius;

        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
    }
}
