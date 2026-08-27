import java.util.HashSet;
public class Numbers {
    public static void main(String[] args) {
        
        HashSet<Integer> num = new HashSet<Integer>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        for(int i=1; i<=10; i++){
            if(num.contains(i)){
                System.out.println(i + " was found in the set.");
            }
            else{
                System.out.println(" was not found in the set.");
            }
        }
    }
}
