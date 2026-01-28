package Day11;
public class MissingNumber {
    
    // Method to find the missing number using sum formula
    public static int findMissing(int[] arr) {
        int n = arr.length + 1; // since one element is missing
        
        // Sum of first n natural numbers: n * (n + 1) / 2
        int totalSum = n * (n + 1) / 2;
        
        // Calculate sum of array elements
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        
        // The difference is the missing number
        return totalSum - arraySum;
    }
    
    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {1, 2, 3, 5};
        System.out.println("Array: [1, 2, 3, 5]");
        System.out.println("Missing number: " + findMissing(arr1));
        System.out.println();
        
        // Test case 2
        int[] arr2 = {1, 2, 4, 5, 6};
        System.out.println("Array: [1, 2, 4, 5, 6]");
        System.out.println("Missing number: " + findMissing(arr2));
        System.out.println();
        
        // Test case 3
        int[] arr3 = {2, 3, 4, 5};
        System.out.println("Array: [2, 3, 4, 5]");
        System.out.println("Missing number: " + findMissing(arr3));
        System.out.println();
        
        // Test case 4
        int[] arr4 = {1};
        System.out.println("Array: [1]");
        System.out.println("Missing number: " + findMissing(arr4));
    }
}
