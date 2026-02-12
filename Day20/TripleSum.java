package Day20;
import java.util.*;

/*
 * 🔎 Problem:
 * Given: arr[] and target
 * Find whether: arr[i] + arr[j] + arr[k] == target (where i ≠ j ≠ k)
 * Return: true if exists, false otherwise
 * 
 * ✅ Optimal Approach (Most Expected in Interviews):
 * We'll solve it optimally using:
 * ✅ Sorting + Two Pointer inside a loop
 * 
 * 💡 Idea:
 * 1. Sort the array
 * 2. Fix one element
 * 3. Use two-pointer for the remaining part
 * 
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */
public class TripleSum {
  public static boolean Triple(int arr[], int target){
    int n=arr.length;
    Arrays.sort(arr);
    for(int i=0;i<n-2;i++){
      int left=i+1;
      int right=n-1;
      
      while(left<right){
        int sum=arr[i]+arr[left]+arr[right];
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
    }
    return false;
  }
    public static void main(String[] args) {
       Scanner z = new Scanner(System.in);

        int n = z.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = z.nextInt();
        }

        int target = z.nextInt();

        System.out.println(Triple(arr, target));
    }
}