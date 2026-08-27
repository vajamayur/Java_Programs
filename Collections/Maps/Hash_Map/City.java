
import java.util.HashMap;

public class City{
    public static void main(String[] agrs){

        HashMap<String, String> CapitalCity = new HashMap<String, String>();

        CapitalCity.put("India", "New Dehli");
        CapitalCity.put("England", "London");
        CapitalCity.put("Austria", "Wien");
        CapitalCity.put("Norway", "Oslo");
        CapitalCity.put("India", "New Dehli"); // Duplicate Data
        CapitalCity.put("USA", "Washington DC");


        System.out.println("--- Capital City Details ---");
        System.out.println("India Capital City is: " + CapitalCity.get("India"));
        System.out.println("Size of Capital City: " + CapitalCity.size());
        // CapitalCity.remove("Norway");
        // CapitalCity.clear();
        System.out.println(CapitalCity);

        // Loop Through a HashMap
        // Print Keys
        System.out.println("--- Print the Keys of Capital City ---");

        for(String i : CapitalCity.keySet()){
            System.out.println(i);
        }

        // print values 
        System.out.println("--- Print the Values of Capital City ---");

        for(String i : CapitalCity.values()){
            System.out.println(i);
        }

        // Print Keys ans Values

        System.out.println("--- Print Keys and Value of capital City ---");

        for(String i: CapitalCity.keySet()){
            System.out.println("Keys :" + i + "Values: " + CapitalCity.get(i));
        }


    }
}