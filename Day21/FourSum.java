package Day21;
import java.util.*;
public class FourSum {
  public static List<List<Integer>> foursum(int[] arr,int target){
    List<List<Integer>> res=new ArrayList<>();
    int n=arr.length;
    
    Arrays.sort(arr);
    for(int i=0;i<n-3;i++){
      if(i>0 && arr[i]==arr[i-1]) continue;
      // Pruning for i
      if((long) arr[i]+arr[i+1]+arr[i+2]+arr[i+3]>target) break; // Minimum sum is greater than target
      if((long) arr[i]+arr[n-1]+arr[n-2]+arr[n-3]<target) continue; // Maximum sum is less than target
      
      for(int j=i+1;j<n-2;j++){
        if(j>i+1 && arr[j]==arr[j-1]) continue;
        // Pruning for j
        if((long) arr[i]+arr[j]+arr[j+1]+arr[j+2]>target) break; // Minimum sum is greater than target
        if((long) arr[i]+arr[j]+arr[n-1]+arr[n-2]<target) continue; // Maximum sum is less than target
        int left=j+1;
        int right=n-1;
        
        while(left<right){
          long sum=(long) arr[left]+arr[right]+arr[i]+arr[j];
          if(sum==target){
            res.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
            left++;
            right--;
            while(left<right && arr[left]==arr[left-1]) left++;
            while(left<right && arr[right]==arr[right-1]) right--;
          }
          else if(sum<target){
            left++;
          }
          else{
            right--;
          }
          
        }
      }
    }
    return res;
  }
    public static void main(String[] args) {
      Scanner z=new Scanner(System.in);
      int m=z.nextInt();
        int[] arr=new int[m];
        for(int i=0;i<m;i++){
          arr[i]=z.nextInt();
        }
        int target=z.nextInt();
        List<List<Integer>> result=foursum(arr,target);
      
      System.out.println(result);
    }
}