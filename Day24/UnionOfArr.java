package Day24;
//Stream API usage
//the Stream API provides a concise way to filter duplicates using the distinct() method.  
import java.util.*;
import java.util.stream.*;
public class UnionOfArr {
    public static void main(String[] args) {
      Scanner z=new Scanner(System.in);
      int n=z.nextInt();
      int m=z.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=z.nextInt();
      }
      int[] arr1=new int[m];
      for(int i=0;i<m;i++){
        arr1[i]=z.nextInt();
      }
      int[] res=IntStream.concat(Arrays.stream(arr),Arrays.stream(arr1)).distinct().toArray();
      System.out.println(Arrays.toString(res));
    }
}

