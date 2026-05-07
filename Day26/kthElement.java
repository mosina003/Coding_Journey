package Day26;
import java.util.*;

public class kthElement {
    public static void main(String[] args) {
      Scanner z=new Scanner(System.in);
      int n1=z.nextInt();
      int n2=z.nextInt();
      
      int[] arr1=new int[n1];
      for(int i=0;i<n1;i++){
        arr1[i]=z.nextInt();
      }
      int[] arr2=new int[n2];
      for(int i=0;i<n2;i++){
        arr2[i]=z.nextInt();
      }
      int k=z.nextInt();
      
      ArrayList<Integer> list=new ArrayList<>();
      for(int x: arr1){
        list.add(x);
      }
      for(int y:arr2){
        list.add(y);
      }
      Collections.sort(list);
      
      int m=list.get(k-1);
      System.out.println(m);
    }
}
