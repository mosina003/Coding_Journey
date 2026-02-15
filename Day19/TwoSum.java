package Day19;
import java.util.*;

public class TwoSum {
  public static boolean sum(int m,int[] arr,int target){
    HashSet<Integer> set=new HashSet<>();
    for(int n: arr){
      int req=target-n;
      if(set.contains(req)){
        return true;
      }
      set.add(n);
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
      
      System.out.println(sum(m,arr,target));
    }
}