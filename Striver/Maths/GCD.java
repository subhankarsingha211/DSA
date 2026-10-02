package Striver.Maths;
import java.util.*;

public class GCD {
    static int sol(int n,int m){
        int gcd = 1;
        for(int i=1;i<=(int)Math.min(n, m);i++){
            if(n%i==0 && m%i==0){
                gcd =i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        int a =10;
        int b=20;
        System.out.println(sol(a, b));
    }
}
