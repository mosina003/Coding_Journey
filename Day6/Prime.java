package Day6;
import java.util.*;
class Prime {
    static boolean isPrime(int n) {
        // code here
        if(n==1){
            return false;
        }
        // Start checking divisors from 2 because 1 divides every number.
        
        // Loop runs only until i*i <= n, which means i <= sqrt(n).
        // We check divisors only up to sqrt(n) because:
        // If n has a divisor greater than sqrt(n),
        // it must also have a corresponding divisor smaller than sqrt(n).
        for(int i=2;i*i<=n;i++){

            if (n%i==0){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args){
        Scanner z = new Scanner(System.in);
        int n=z.nextInt();
        System.out.println(isPrime(n));
    }
}

