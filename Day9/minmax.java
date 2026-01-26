package Day9;

import java.util.*;

public class minmax{
  public static void main(String[] args){
    Scanner z=new Scanner(System.in);
    ArrayList<Integer> arr= new ArrayList<>();
    while(z.hasNextInt()){
      arr.add(z.nextInt());
    }
    
    int maxi=arr.get(0);
    int mini=arr.get(0);
    for(int i=0;i<arr.size();i++){
      if(arr.get(i)>maxi){
        maxi=arr.get(i);
      }
      if(arr.get(i)<mini){
        mini=arr.get(i);
      }
    }
    System.out.print("["+mini+","+maxi+"]");
  }
}
