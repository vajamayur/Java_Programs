import java.util.*;
public class Main{
    public static void main(String[] args){

        ArrayList<String> name = new ArrayList<>();

        name.add("Mayur");
        name.add("John");
        name.add("Alice");
        name.add("Bob");

        Collections.sort(name);
        int index = Collections.binarySearch(name, "Mayur");
        System.out.println("Mayur is at index: " + index);
    }
}