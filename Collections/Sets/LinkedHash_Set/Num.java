import java.util.LinkedHashSet;
public class Num{
    public static void main(String[] args) {
        
        LinkedHashSet<Integer> nums = new LinkedHashSet<>();
        LinkedHashSet<String> cars = new LinkedHashSet<>();

        nums.add(10);
        nums.add(30);
        nums.add(40);
        nums.add(20);
        nums.add(50);


        cars.add("BMW");
        cars.add("Audi");
        cars.add("Ford");
        cars.add("Thar");

        System.out.println("--- Numbers ---");
        for(int num : nums){
            System.out.println(num);
        }

        System.out.println("--- Car Details ---");
        for(String i : cars){
            System.out.println(i);
        }
    }
}