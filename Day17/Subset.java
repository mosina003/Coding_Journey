package Day17;
import java.util.*;

/**
 * Day 17: Check if Array 2 is a Subset of Array 1
 * This program determines whether all elements of arr2 exist in arr1 
 * with sufficient frequency (considering duplicates)
 */
public class Subset {
    public static void main(String[] args) {
      Scanner z=new Scanner(System.in);
      
      // Read first array (arr1)
      int n=z.nextInt();  // Size of first array
      int[] arr1=new int[n];
      for(int i=0;i<n;i++){
        arr1[i]=z.nextInt();
      }
      
      // Read second array (arr2)
      int m=z.nextInt();  // Size of second array
      int[] arr2=new int[m];
      for(int i=0;i<m;i++){
        arr2[i]=z.nextInt();
      }
      
      // Create a frequency map to count occurrences of each element in arr1
      HashMap<Integer,Integer> map=new HashMap<>();
      
      // Store frequency of each element in arr1
      for(int num:arr1){
        map.put(num,map.getOrDefault(num,0)+1);
      }
      
      // Check if arr2 is a subset of arr1
      boolean subset=true;
      for(int num:arr2){
        // If element doesn't exist in arr1 or its count is exhausted, arr2 is not a subset
        if(!map.containsKey(num) || map.get(num)==0){
          subset=false;
          break;
        }
        // Decrement the count of the element in the map
        map.put(num,map.get(num)-1);
      }
      
      // Print the result: true if arr2 is a subset, false otherwise
      System.out.println(subset);
    }
}