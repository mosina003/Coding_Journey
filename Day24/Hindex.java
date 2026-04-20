package Day24;
import java.util.*;

public class Hindex {
    public static void main(String[] args) {
      /*
       * H-index problem:
       * Given citation counts of n papers, find the largest value h such that
       * at least h papers have citations >= h.
       *
       * Input format used here:
       * n
       * c1 c2 c3 ... cn
      *
      * Sample Input:
      * 5
      * 3 0 6 1 5
      *
      * Sample Output:
      * 3
       */
      Scanner z=new Scanner(System.in);
      int n=z.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=z.nextInt();
      }

      // Sort citations so we can count high-citation papers from the end.
      Arrays.sort(arr);
      
      int count=0;
      // Move from largest citation to smallest.
      // If current paper has at least (count + 1) citations, we can increase h.
      for(int i=n-1;i>=0;i--){
        if(arr[i]>=count+1){
          count++;
        }
        else{
          break;
        }      
      }

      // 'count' is the maximum valid h-index.
      System.out.println(count);
    }
}




    
