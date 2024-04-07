import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) 
    {
        ArrayList<String> storeItems = new ArrayList<>();
        
        storeItems.add("PCB");
        storeItems.add("CPU");
        storeItems.add("RAM");
        storeItems.add("GPU");
        storeItems.add("SSD");
        
        System.out.println("Computer store has those items: ");
        System.out.println(storeItems);
        
        System.out.println("A customer bought a CPU!");
        if(storeItems.contains("CPU")){
            storeItems.remove("CPU");
            System.out.println("CPU sold!");
        }else{
            System.out.println("Unfortunately no CPUs left :(");
        }
        
        System.out.println("Now, computer store has only these items: ");
        System.out.println(storeItems);
        
        System.out.println("Oh! A new customer wants to buy a CPU!");
        if(storeItems.contains("CPU")){
            storeItems.remove("CPU");
            System.out.println("One more CPU sold!");
        }else{
            System.out.println("Unfortunately no CPUs left :(");
        }
        
    }
}
