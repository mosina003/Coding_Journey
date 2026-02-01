package Day11;

import java.util.Scanner;

public class MissingNumber {
    
    public static int findMissing(int[] arr) {
        long n = arr.length + 1; // since one element is missing
        
        // Sum of first n natural numbers: n * (n + 1) / 2
        long totalSum = n * (n + 1) / 2;
        
        // Calculate sum of array elements
        long arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        
        // The difference is the missing number
        return (int)(totalSum - arraySum);
    }
    
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);   
        int m = z.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = z.nextInt();
        } 
        System.out.println(findMissing(arr));
    }
}
