package Day12;
import java.util.*;
public class Repeat {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = z.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = z.nextInt();
        }
        HashMap<Integer, Integer> freq= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("Repeated elements and their counts:");
        for(int key:freq.keySet()){
            if(freq.get(key)>1){
                System.out.println(key + " is repeated " + freq.get(key) + " times");
            }
        }
        z.close();
    }
}
        