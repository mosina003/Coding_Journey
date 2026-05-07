package Day28;

public import java.util.*;

public class TrappingWater{
    public static void main(String[] args) {
      Scanner z=new Scanner(System.in);
      int n=z.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=z.nextInt();
      }
      int[] leftmax=new int[n];
      int[] rightmax=new int[n];
      
      leftmax[0]=arr[0];
      for(int i=1;i<n;i++){
        leftmax[i]=Math.max(arr[i],leftmax[i-1]);
      }
       
      rightmax[n-1]=arr[n-1];
      for(int i=n-2;i>=0;i--){
        rightmax[i]=Math.max(arr[i],rightmax[i+1]);
      }
      int units=0;
      for(int i=0;i<n;i++){
        int m=Math.min(leftmax[i],rightmax[i]);
        units+=m-arr[i];
      }
     
      System.out.println(units);
      
    }
}
 {
    
}
