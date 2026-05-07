package Day29;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
      Scanner z=new Scanner(System.in);
      int n=z.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=z.nextInt();
      }
      Arrays.sort(arr);
      
      System.out.println(arr[n/2]);
    }
}
