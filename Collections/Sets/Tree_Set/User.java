
import java.util.TreeSet;

public class User{
    public static void main(String[] args){

        TreeSet<String> user = new TreeSet<>();

        user.add("Mayur");
        user.add("Ravi");
        user.add("Mayur"); // Duplicate name
        user.add("Chirag");
        user.add("Tanay");

        System.out.println("--- User Deatils ---");
        System.out.println(user);
        System.out.println("Size of Array: " + user.size());
        System.out.println(user.contains("Mayur"));
        user.remove("Tanay"); // remove from user tanay
        // user.clear(); // Clean your array
        System.out.println(user);

        // for(String i : user){
        //     System.out.println(i);
        // }

        
    }
}