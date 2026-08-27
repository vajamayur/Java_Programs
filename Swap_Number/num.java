import java.util.Scanner;

public class num{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num 1: ");
        int a = sc.nextInt();

        System.out.println("Enter num 2: ");
        int b = sc.nextInt();

        int temp = a;
        a = b ;
        b = temp;

        System.out.println("--- OUTPUT ---");
        System.out.println("a: " + a + "b: " + b);
        sc.close();

    }
}