import java.util.*;

public class rev {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = z.nextInt();
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        System.out.println("Reverse: " + rev);
        z.close();
    }
}
