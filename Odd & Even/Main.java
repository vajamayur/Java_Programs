import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("--- OUTPUT ---");
            System.out.println(num + " Even Number..");
        }
        else{
            System.out.println("--- OUTPUT ---");
            System.out.println(num + " Odd Number..");
        }
    }
}