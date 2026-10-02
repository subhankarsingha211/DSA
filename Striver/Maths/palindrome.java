package Striver.Maths;

public class palindrome {
    public static boolean sol(int n){
        int n_copy = n;
        int reverse=0;
        while(n!=0){
            int last_digit = n%10;
            n=n/10;
            reverse = (reverse*10)+last_digit;
        }
        return reverse==n_copy;
    }
    public static void main(String[] args) {
        int n = 121;
        String str = sol(n)==true?"It is palindrome":"It is not palindrome";
        
        System.out.println(str);
    }
}
