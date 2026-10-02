package Striver.Maths;

public class prime {
    
    static boolean sol(int n){
        int count =0;
        if(n==2){
            return true;
        }
        for(int i=1;i*i<=n;i++){
            if (n%i==0) {
                count++;
                if(n/i!=i){
                    count++;
                }
            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 17;
        String str = sol(n)==true?"Number is prime!":"Number is not prime!";
        System.out.println(str);
    }
}
