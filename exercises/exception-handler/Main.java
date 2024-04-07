import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter numerator: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter denominator: ");
        int num2 = scanner.nextInt();
        
        try{
            int res = num1 / num2;
            System.out.println("Result: " + res);
        }catch (ArithmeticException e) {
            System.out.println("Division by zero isn't allowed!");
            System.out.println("Exception: " + e.getMessage());
        }finally {
            scanner.close();
        }
    }
}
