import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        
        File file = new File("Demo.txt");

        if(file.exists()){
            System.out.println("File Name: " + file.getName());
            System.out.println("Absoulte Path: " + file.getAbsolutePath());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File Size in Byte: " + file.length());
        }
        else{
            System.out.println("File Does not Exists..");
        }
    }
    
}
