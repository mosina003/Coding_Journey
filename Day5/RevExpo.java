package Day5;

import java.util.*;

public class RevExpo {
     public int reverseExponentiation(int n) {
        // code here
        int num=n;
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        int power=(int) Math.pow(num,rev);
        return power;
        
    }
    public static void main(String[] args){
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        RevExpo obj=new RevExpo();
        System.out.print(obj.reverseExponentiation(n));
        z.close();
    }
}
