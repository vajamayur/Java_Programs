import java.util.*;

public class Numbers {
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>();

        num.add(5);
        num.add(4);
        num.add(3);
        num.add(2);
        num.add(1);
        num.add(5);


        System.out.println("Max Value: " + Collections.max(num));
        System.out.println("Min Value: " + Collections.min(num));

        System.out.println("--- Shuffule Numbers ---");
        Collections.shuffle(num);
        Collections.sort(num);
        System.out.println(num);

        System.out.println("--- Swap the Number ---");
        Collections.swap(num, 0, 2);
        System.out.println(num);

        System.out.println("--- Frequency ---");
        int count  = Collections.frequency(num, 5);
        System.out.println("5 Number appears " + count + " times");


        
    }
    
}
