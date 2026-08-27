
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStream {
    public static void main(String[] args) {

        String str = "This is a File Output Stream...";
        
        try(FileOutputStream output = new FileOutputStream("Demo.txt")){
            output.write(str.getBytes());
            System.out.println("Successfull Write to file..");
            
        } catch (IOException e) {
            System.err.println("Error Weiting file..");
            e.printStackTrace();
        }
    }
}
