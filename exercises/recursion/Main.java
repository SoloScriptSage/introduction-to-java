public class Main{
   public static void main(String[] args){
    int num = 4;
    long res = factorialCounter(num);
     System.out.println("Factorial of number " + num + " = " + res);
   }
 
   public static long factorialCounter(int _num){
     if(_num == 0){
       return 1;
     }
     else{
       return _num * factorialCounter(_num-1);
     }
   }
}
