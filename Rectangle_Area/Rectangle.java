
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rectangle Length: ");
        int length = sc.nextInt();

        System.out.println("Enter Rectangle Width: ");
        int width = sc.nextInt();

        int area = length * width;

        System.out.println("--- OUTPUT ---");
        System.err.println("Area of Rectangle: " + area);

    }
}
