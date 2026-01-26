package Day9;

import java.util.*;

public class ThirdLargest{
  public static void main(String[] args){
    Scanner z=new Scanner(System.in);
    int n=z.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=z.nextInt();
    }
    int first=Integer.MIN_VALUE;
    int second=Integer.MIN_VALUE;
    int third=Integer.MIN_VALUE;
    
    for(int num:arr){
      if(num>first){
        third=second;
        second=first;
        first=num;
      }
      else if(num>second){
        third=second;
        second=num;
      }
      else if(num>third){
        third=num;
      }
    }
    System.out.print(third);
  }
}
