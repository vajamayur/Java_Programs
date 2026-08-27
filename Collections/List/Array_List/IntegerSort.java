import java.util.ArrayList;
import java.util.Collections;

public class IntegerSort {
    public static void main(String[] args){

        ArrayList<Integer> myNum = new ArrayList<Integer>();

        myNum.add(5);
        myNum.add(4);
        myNum.add(3);
        myNum.add(2);
        myNum.add(1);   

        Collections.sort(myNum);

            for(int i : myNum){
                System.err.println(i);
            }
    }
}
