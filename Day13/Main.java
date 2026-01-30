import java.util.*;

public class Main {
    public static void main(String[] args) {
      
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

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
