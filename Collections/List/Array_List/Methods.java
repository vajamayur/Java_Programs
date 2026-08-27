
import java.util.ArrayList;

public class Methods {
    public static void main(String[] args){
        
        ArrayList<String> bike = new ArrayList<String>();

        bike.add("Spendor");
        bike.add("Sp125");
        bike.add("CBShine");

        bike.set(0, "FZ-4.0");
        // bike.remove(1);
        // bike.clear();

        // System.err.println(bike.size());
        System.err.println(bike);

    }
}
