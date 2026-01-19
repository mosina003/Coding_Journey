package Day2;

import java.util.*;
public class PowLD {
    public static void main(String[] args) {
        try (Scanner z = new Scanner(System.in)) {
            int a = z.nextInt();
            int b = z.nextInt();

            if (b == 0) {
                System.out.println("Last digit is 1");
                return;
            }

            int LastA = a % 10;
            int LastB = b % 4;
            if (LastB == 0) {
                LastB = 4;
            }

            int result = (int)Math.pow(LastA, LastB);
            System.out.println("Last digit is " + (result%10));
        }
    }
}

/*
 * Input:
 * - Integer a (base)
 * - Integer b (exponent)
 * 
 * Steps:
 * 1. If b == 0, print 1 and stop.
 * 2. Compute lastA = a % 10 to get the last digit of the base.
 * 3. Compute lastB = b % 4 since last digits repeat every 4 powers.
 * 4. If lastB == 0, set lastB = 4.
 * 5. Compute result = lastA ^ lastB.
 * 6. Print result % 10 as the last digit.
 * 
 * Output:
 * - The last digit of a^b
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
