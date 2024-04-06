public class Fibonacci {
    public static void main(String[] args) {
        int f=0;
        int s=1;
        
        System.out.println("First 10 numbers Fibonacci:");
        System.out.print(f+" "+s+" ");
        for (int i = 2; i < 10; i++) {
            int n = f+s;
            System.out.print(n+" ");
            f=s;
            s=n;
        }
    }
}
