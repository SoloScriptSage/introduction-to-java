import java.util.Scanner;

public class CircleRadius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius: ");
        
        double r = scanner.nextDouble();
        double a = Math.PI * r * r;
        
        System.out.println("The area of the circle with radius " + r + " -> " + a);
        scanner.close();
    }
}
