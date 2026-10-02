package Striver.Maths;

public class All_divisors {
    static void sol(int n){
        if(n==0){
            System.out.println(0);
        }
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int n = 10;
        sol(n);
    }
}
