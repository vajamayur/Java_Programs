import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        
        File file = new File("Demo.text");

        if(file.delete()){
            System.out.println("Deleted the File: " + file.getName());
        }else{
            System.out.println("Failed to Delete the File..");
        }
    }
}
