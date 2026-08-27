import java.util.ArrayList;
import java.util.Collections;


public class Fruit{
    public static void main(String[] args){
        
        ArrayList<String> al = new ArrayList<>();

        System.out.println("--- Fruit Details---");
        al.add("Apple");
        al.add("Banana");
        al.add("Mangoo");

        Collections.sort(al);   
        // Collections.reverse(al);
        // Collections.shuffle(al);
        System.out.println(al);
    }
}