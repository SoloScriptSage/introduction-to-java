public class LargestNum {
    public static void main(String[] args) {
        int[] a = {10, 5, 20, 15, 8};
        System.out.println("Largest number is " + largest(a));
    }
    
    public static int largest(int[] a) {
        if (a==null || a.length==0) {
            throw new IllegalArgumentException("Empty array!!!");
        }
        int mx = a[0];
        for (int i=1; i<a.length; i++) {
            if (a[i] > mx) mx = a[i];
        }
        return mx;
    }
}
