import java.util.ArrayList;
import java.util.Iterator;

public class Cars {
    public static void main(String[] args){

        ArrayList<String> car = new ArrayList<String>();

        car.add("BMW");
        car.add("Audi");
        car.add("Thar");
        car.add("Swift");
        car.add("Honda City");

        // get iterator
        Iterator<String> it = car.iterator();

        // print first item
        System.out.println("--- Print First Item ---");
        System.out.println(it.next());

        // loop through a collection
        System.out.println("--- Print loop through items ---");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        


    }
}
