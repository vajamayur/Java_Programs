import java.util.TreeMap;
public class Cars{
    public static void main(String[] args){

        TreeMap<String,String> car = new TreeMap<String, String>();

        car.put("Maruti Suzuki", "Swift");
        car.put("Toyota", "Fortuner");
        car.put("Mahindra", "Thar");
        car.put("Mahindra", "Scorpio");
        car.put("Mahindra", "Thar");

        System.out.println("--- Cars Details ---");
        System.out.println(car);
        System.out.println("Get Toyota Car: " + car.get("Toyota"));  
        System.out.println("Remove Car: " + car.remove("Toyota"));
        System.out.println("Size of Cars: " + car.size());
        // car.clear();
        System.out.println(car);
        
        System.out.println("--- Print Keys ----");
        for(String i : car.keySet()){
            System.out.println("Key: " + i);
        }

        System.out.println(" --- Print Key and Values ---");
        for(String i : car.keySet()){
            System.out.println("Cars Company Name: " + i + "Cars Model :" + car.get(i));
        }


        


    }
}