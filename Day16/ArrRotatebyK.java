package Day16;

import java.util.*;

public class ArrRotatebyK{

    static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;
        int n = arr.length;

        k = k % n;

        // Step 1: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 2: Reverse remaining elements
        reverse(arr, k, n - 1);

        // Step 3: Reverse whole array
        reverse(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }
}
