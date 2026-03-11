package Day22;
import java.util.*;

public class triple0 {
  public static boolean tripletzero(int[] arr){
    int m=arr.length;
    Arrays.sort(arr);
    for(int i=0;i<m-2;i++){
      int left=i+1;
      int right=m-1;
  
      while(left<right){
        int sum=arr[i]+arr[left]+arr[right];
        if(sum==0){
          return true;
        }
        else if(sum<0){
          left++;
        }
        else{
          right--;
        }
      }
    }
    return false;
  }
    public static void main(String[] args) {
      Scanner z=new Scanner(System.in);
      int n=z.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=z.nextInt();
      }
      System.out.println(tripletzero(arr));
    }
}