package Day18;
import java.util.*;

public class Frequency {
  public List<Integer> frequencyCount(int[] arr,int n) {
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int num:arr){
      map.put(num,map.getOrDefault(num,0)+1);
    }
    List<Integer> lis=new ArrayList<>();
    
    for(int i=1;i<=n;i++){
      lis.add(map.getOrDefault(i,0));
    }
    return lis;
    
  }
    
    public static void main(String[] args) {
      Scanner z=new Scanner(System.in);
      int n=z.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=z.nextInt();
      }
      Frequency obj=new Frequency();
      System.out.println(obj.frequencyCount(arr,n));
    }
}

