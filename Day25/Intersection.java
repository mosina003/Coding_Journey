package Day25;

import java.util.*;

public class Intersection {
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
      int[] ar1=Arrays.stream(arr1).distinct().toArray();
      int[] ar2=Arrays.stream(arr2).distinct().toArray();
      int count=0;
      for(int i=0;i<ar1.length;i++){
        for(int j=0;j<ar2.length;j++){
          if(ar1[i]==ar2[j]){
            count++;
          }
        }
      }
      System.out.println(count);
    }
}