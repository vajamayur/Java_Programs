public class Con {
    public static void main(String[] args) {
        
        String FirstName = "Vaja";
        String LastName = "Mayur";
        String result = FirstName.concat(LastName);

        int x = 10;
        int y = 20;
        int z = x + y;

        String a = "10";
        int b = 20;
        String c = a + b;

        System.out.println("--- Result ---  ");
        System.out.println("My Name is " + FirstName + " " + LastName); 
        System.out.println(FirstName.concat( LastName));
        System.out.println(result);
        System.out.println("Sum of x and y is " + z);
        System.out.println("Sum of a and b is " + c);
    }
}