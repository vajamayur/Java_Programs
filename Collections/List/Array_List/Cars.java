import java.util.ArrayList;
import java.util.Scanner;
public class Cars{
    public static void main(String[] args){

        ArrayList<String> cars = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter your car name 1: ");
        String car1 = sc.nextLine();
        cars.add(car1);

        System.err.println("Enter your car name 1: ");
        String car2 = sc.nextLine();
        cars.add(car2);

        System.err.println("Enter your car name 1: ");
        String car3 = sc.nextLine();
        cars.add(car3);

        // cars.add("Audi");
        // cars.add("BMW");
        // cars.add("Ford");   
        System.err.println("--- Cars Details ---");
        System.err.println(cars);
    }
}