package Day13;
import java.util.*;

/*
 * DUTCH NATIONAL FLAG ALGORITHM
 * ==============================
 * An efficient algorithm to sort an array containing only 0s, 1s, and 2s
 * Time Complexity: O(n) | Space Complexity: O(1)
 * 
 * 🔹 Rules of the Algorithm:
 * 
 * We only look at arr[mid] and decide what to do.
 * 
 * ✅ Case 1: arr[mid] == 0
 * A 0 belongs to the left side.
 * Action:
 *   - Swap arr[mid] with arr[low]
 *   - Move both low and mid forward
 * Why?
 *   - We placed a 0 in its correct region
 *   - Everything before low is already sorted
 * 
 * ✅ Case 2: arr[mid] == 1
 * A 1 belongs in the middle.
 * Action:
 *   - Just move mid forward
 * Why?
 *   - 1 is already in the correct position
 *   - No swapping needed
 * 
 * ✅ Case 3: arr[mid] == 2
 * A 2 belongs to the right side.
 * Action:
 *   - Swap arr[mid] with arr[high]
 *   - Move high backward
 *   - Do NOT move mid
 * Why?
 *   - The swapped value from the right is unknown
 *   - It must be checked again
 * 
 * 🔚 When Does It Stop?
 * The algorithm continues until: mid > high
 * 
 * At this point:
 *   - No unknown elements remain
 *   - All values are sorted correctly
 */

class Sort012 {
    public void sort(int[] arr) {
        // code here
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
    public static void main(String[] args){
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=z.nextInt();
        }
        Sort012 sorter=new Sort012();
        sorter.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}