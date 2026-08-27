import java.util.Collections;
import java.util.LinkedList;


public class Cars{
    public static void main(String[] args){

        LinkedList<String> car = new LinkedList<String>();

        car.add("Volvo");
        car.add("BMW");
        car.add("Thar");
        car.add("Swift");

        car.addFirst("Bugati");
        car.addLast("Honda City");
        // car.removeFirst();
        // car.removeLast();

        // System.out.println(car.getFirst());
        // System.err.println(car.getLast());

        Collections.sort(car);

        System.err.println(car);ø
    }
}