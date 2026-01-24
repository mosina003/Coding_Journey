package Day7;
import java.util.*;
class Palindrome {
    public boolean isPalindrome(int n) {
        // code here
        int num=n;
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        return num==rev;
    }
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n=z.nextInt();
        Palindrome p=new Palindrome();
        System.out.println(p.isPalindrome(n));
    }
}