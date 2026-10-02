// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class PlusOne {
    public static int plusOne(int[] digits) {
        int a = 0;
        int[] arr = new int[digits.length];
        for(int i=0;i<digits.length;i++){
            a=a+digits[i];
            if(i==digits.length-1){
                break;
            }
            a=a*10;
        }
        a=a+1;
        for(int i=digits.length-1;i>=0;i--){
            if(a>=0){
                arr[i]=a%10;
                a=a/10;
            }
            else{
                break;
            }
            
        }
        return a;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2};
        //System.out.print(Arrays.toString(plusOne(arr)));
        System.out.print(plusOne(arr));
    }
}