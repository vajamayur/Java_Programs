import java.util.HashMap;

public class Std {
    public static void main(String[] args){
        HashMap<String, Integer> Student = new HashMap<String, Integer>();

        Student.put("Mayur", 22);
        Student.put("John", 32);
        Student.put("Roy", 20);

        System.out.println("--- Student Details ---");
        for(String i : Student.keySet()){
            System.out.println("Name :" + i + " Age: " + Student.get(i));
        }


    }    
}
