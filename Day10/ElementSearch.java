package Day10;
import java.util.*;
class ElementSearch {
    public int search(int arr[], int x) {
        // code here
        for(int i=0;i<=arr.length-1;i++){
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = z.nextInt();
        }
        int x = z.nextInt();
        ElementSearch es = new ElementSearch();
        int result = es.search(arr, x);
        System.out.print(result);
    }
}
