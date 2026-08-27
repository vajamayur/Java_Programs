import java.io.FileInputStream;
import java.io.IOException;

public class FileInpStream{
    public static void main(String[] args){

        try(FileInputStream input = new FileInputStream("Demo.txt")){

            int i; // variable to store each byte that is read

            // Read one byte at a time until end of file (-1 means "no more data")
            while((i = input.read()) != -1){
                // Convert the byte to a character and print it to the console
                // System.out.println("--- File information ---");
                System.out.println((char) i);
            }

        }catch(IOException e){
            System.out.println("Error Reading File..");

        }
    }
}