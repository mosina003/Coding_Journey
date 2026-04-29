package Day27;
// Prefix sum pattern - Find longest subarray with sum equal to k
import java.util.*;

public class LongestSubarray {
    public static void main(String[] args) {
      // Read input: array size and elements
      Scanner z=new Scanner(System.in);
      int n=z.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=z.nextInt();
      }
      // Read target sum
      int k=z.nextInt();
      
      // HashMap to store the first occurrence of each prefix sum
      HashMap<Integer,Integer> map=new HashMap<>();
      int sum=0;          // Current prefix sum
      int maxlen=0;       // Length of longest subarray with sum = k
      
      // Iterate through the array using prefix sum approach
      for(int i=0;i<n;i++){
        // Add current element to prefix sum
        sum+=arr[i];
        
        // If prefix sum equals k, the subarray from index 0 to i has sum k
        if(sum==k){
          maxlen=i+1;
        }
        
        // If (sum - k) exists in map, we found a subarray with sum k
        // Length = current index - index where (sum - k) was first seen
        if(map.containsKey(sum-k)){
          int len=i-map.get(sum-k);
          maxlen=Math.max(len,maxlen);
        }
        
        // Store the first occurrence of this prefix sum
        if(!map.containsKey(sum)){
          map.put(sum,i);
        }
      }
      // Output the maximum length of subarray with sum = k
      System.out.println("Length="+maxlen);
    }
}