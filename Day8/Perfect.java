package Day8;
import java.util.*;
public class Perfect {
    boolean isPerfectNumber(int n) {
        int sum = 1;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                sum += i;

                if(i != n/i) {
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Perfect perfect = new Perfect();
        if (perfect.isPerfectNumber(n)) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    }
}
