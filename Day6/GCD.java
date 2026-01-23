package Day6;
import java.util.*;
public class GCD {
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
        
    }
    public static void main(String[] args){
        Scanner z=new Scanner(System.in);
        int a=z.nextInt();
        int b=z.nextInt();
        System.out.println(gcd(a,b));
    }
}
