package Day3;
import java.util.*;

public class CountDividingDigits {
    public static void main(String[] args) {
      Scanner z=new Scanner(System.in);
      int n=z.nextInt();
      int count=0;
      int num=n;
      
      while(n>0){
        int digit=n%10;
        if( digit!=0 && num%digit==0){
          count++;
        }
         n=n/10;
      }
      System.out.println(count);
  }
}