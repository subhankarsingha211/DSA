package Striver.Maths;

public class armstrong_num {
    static boolean sol(int n){
        int n_copy = n;
        int count = 0;
        if(n==0){
            return true;
        }
        int total_digits= (int)Math.log10(n)+1;
        while (n_copy!=0) {
            int last_digit = n_copy%10;
            count = count+ (int)Math.pow(last_digit, total_digits);
            n_copy=n_copy/10;
        }
        
        return count==n;
    }
    public static void main(String[] args) {
        int a = 12;
        String str = sol(a)==true?"It is a Armstrong Number":"It is not a Armstrong Number";
        System.out.println(str);
    }
}
