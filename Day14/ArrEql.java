package Day14;
import java.util.*;

public class ArrEql {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        int n1 = z.nextInt();
        int n2 = z.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i = 0; i < n1; i++){
            arr1[i] = z.nextInt();
        }
        for(int i = 0; i < n2; i++){
            arr2[i] = z.nextInt();
        }

        if(n1 != n2){
            System.out.println("not equal");
            return;
        }

        // sort arr1
        for(int i = 0; i < n1; i++){
            for(int j = i + 1; j < n1; j++){
                if(arr1[i] < arr1[j]){
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

        // sort arr2
        for(int i = 0; i < n2; i++){
            for(int j = i + 1; j < n2; j++){
                if(arr2[i] < arr2[j]){
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        boolean equal = true;
        for(int i = 0; i < n1; i++){
            if(arr1[i] != arr2[i]){
                equal = false;
                break;
            }
        }
        //ternary operator
        System.out.println(equal ? "equal" : "not equal");
    }
}
