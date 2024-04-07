import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileClass {
    public static void main(String[] args) {
        try {
            File file = new File("filename.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String FileRead = myReader.nextLine();
                System.out.println(FileRead);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File Not found!");
            e.printStackTrace();
        }
    }
}
