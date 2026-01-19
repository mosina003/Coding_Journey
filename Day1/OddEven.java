package Day1;

//	Find even or odd
import java.util.*;
public class OddEven{
    public static void main(String[] args) {
        try (Scanner z = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = z.nextInt();
            if(num % 2 == 0){
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }
        }
    }
}
