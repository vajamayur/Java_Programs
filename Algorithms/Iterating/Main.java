import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Yellow");
        colors.add("Red");
        colors.add("Pink");
        colors.add("Black");
        colors.add("White");

        // print loop through color
        for(String i : colors){
            System.out.println(i);
        }

        // print iterator
        System.out.println("--- Iterator ---");
        Iterator<String> it = colors.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
