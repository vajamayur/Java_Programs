import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
    public static void main(String[] args) {
        
        try {
                FileWriter writer = new FileWriter("Demo.txt");
                writer.write("Hello, Mayur....");
                writer.close();
                System.out.println("Successfully Write to the file...");
        } catch (IOException e) {
            System.out.println("An Error..");
            e.printStackTrace();
        }
    }
}
