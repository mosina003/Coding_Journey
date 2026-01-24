package Day7;

import java.util.*;
class Sqrt {
    double floorSqrt(int n) {
        // code here
        double sqrt=Math.pow(n,0.5);
        return sqrt;
    }
    public static void main(String[] args){
        Scanner z = new Scanner(System.in);
        int n=z.nextInt();
        Sqrt s=new Sqrt();
        System.out.println(s.floorSqrt(n));
}
}
    