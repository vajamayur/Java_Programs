
import java.util.Scanner;

public class Num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("The Value is a Positive Number..");
        }
        else if(num < 0){
            System.out.println("The Value is a Negative Number..");
        }
        else{
            System.out.println("The Value is 0..");
        }
    }
}
