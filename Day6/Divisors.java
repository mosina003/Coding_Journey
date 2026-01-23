package Day6;
import java.util.*;
public class Divisors{
    public static List< Integer > printDivisors(int n) {
        List<Integer> div=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                div.add(i);
            }
            
        }
        return div;
        // Write your code here
    }
    public static void main(String[] args){
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        System.out.println(printDivisors(n));
    }
}
