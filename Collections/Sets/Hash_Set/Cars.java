
import java.util.HashSet;

public class Cars{
    public static void main(String[] args){

        HashSet<String> car = new HashSet<String>();

        car.add("BMW");
        car.add("Volvo");
        car.add("Audi");
        car.add("BMW"); // Duplicate
        car.add("Swift");
        car.add("Thar");
        car.add("Honda City");
        
            // System.err.println(car);
            System.err.println(car.contains("Thar"));

            for(String i: car){
                System.err.println(i);
            }

    }
}