package Day13;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=z.nextInt();
        }
        // Sorting logic
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Convert array to List
        List<Integer> list = new ArrayList<>();
        for(int num : arr){
            list.add(num);
        }
        // Print as List
        System.out.println(list);
    }
}
