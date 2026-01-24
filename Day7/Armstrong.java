package Day7;
import java.util.*;

public class Armstrong{
    public static void main(String[] args) {
      Scanner z=new Scanner(System.in);
      int n=z.nextInt();
      
      int num=n;
      int temp=n;
      int digits=0;
      
      while(temp>0){
        digits++;
        temp=temp/10;
      }
      
      temp=n;
      int arm=0;
      
      while(temp>0){
        int d=temp%10;
        arm+=Math.pow(d,digits);
        temp=temp/10;
      }
      
      if (arm==num){
        System.out.println("true");
      }
      else{
        System.out.println("false");
      }
  }
}