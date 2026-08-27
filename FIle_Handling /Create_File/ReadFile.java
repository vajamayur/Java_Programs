import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        
        File file = new File("Demo.txt");

        try(Scanner myReader = new Scanner(file)) {

            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("An Error..");
            e.printStackTrace();
        }
    }
}
