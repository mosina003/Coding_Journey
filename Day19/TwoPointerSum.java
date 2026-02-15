package Day19;

import java.util.*;

public class TwoPointerSum {
  public boolean Twosum(int m,int arr[], int target){
    
    int left=0;
    int right=m-1;
    
    Arrays.sort(arr);
    while(left<right){
      int sum=arr[left]+arr[right];
      if(sum==target){
        return true;
      }
      else if(sum<target){
        left++;
      }
      else{
        right--;
      }
    }
    return false;
  }
  
    public static void main(String[] args) {
      Scanner z=new Scanner(System.in);
      int m=z.nextInt();
      int[] arr=new int[m];
      for(int i=0;i<m;i++){
        arr[i]=z.nextInt();
      }
      int target=z.nextInt();
      TwoPointerSum obj=new TwoPointerSum();
      System.out.println(obj.Twosum(m,arr,target));
    }
}