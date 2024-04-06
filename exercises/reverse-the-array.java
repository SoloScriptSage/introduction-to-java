import java.util.*;

public class ReverseTheArray {
    public static void main(String[] args){
        int[] initialArray = {1, 2, 3, 4, 5, 6};
        System.out.println("| -- Function sorting algorithm -- |");
        System.out.println("Before sorting: ");
        print(initialArray);

        ReverseArray(initialArray);
        System.out.println("After sorting sorting: ");
        print(initialArray);
    }

    public static void print(int[] array){
        for (int number : array){
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void ReverseArray(int[] array){
        int FIRST = 0;
        int LAST = array.length -1;
        while (FIRST < LAST){
            int temp = array[FIRST];
            array[FIRST] = array[LAST];
            array[LAST] = temp;

            FIRST++;
            LAST--;
        }
    }
}
