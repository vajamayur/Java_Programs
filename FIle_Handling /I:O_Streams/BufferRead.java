import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferRead{
    public static void main(String[] args) {
        
        try(BufferedReader br = new BufferedReader(new FileReader("Demo.txt"))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error Reading file..");
            e.printStackTrace();
        }
    }
}