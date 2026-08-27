import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWrite {
    
    public static void main(String[] args) {
        try(BufferedWriter br = new BufferedWriter(new FileWriter("Demo.txt"))) {
            br.write("Frist Line");
            br.newLine();
            br.write("Second Line");
            System.out.println("Successfully write to file...");
            
        } catch (IOException e) {
            System.out.println("Error..");
        }
    }
}
