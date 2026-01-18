//	Find even or odd
import java.util.*;
public class Day1{
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = z.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        z.close();
    }
}
