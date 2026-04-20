package Day23;
import java.util.*;

public class countsoftriplet {
    public static void main(String[] args) {
      Scanner z=new Scanner(System.in);
      int n=z.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=z.nextInt();
      }
      Arrays.sort(arr);
      int count=0;
      for (int j=n-1;j>=2;j--){
        int left=0;
        int right=j-1;
        
        
        while(left<right){
          int sum=arr[left]+arr[right];
          if(sum==arr[j]){
            count++;
            left++;
            right--;
          }
          else if(sum<arr[j]){
            left++;
          }
          else{
            right--;
          }
        }
      }
      System.out.print(count);
    }
}