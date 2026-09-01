//two pointer approach
import java.util.Arrays;

public class Array_Reverse {
    public static int[] reverse(int[] arr){
        //declaring the pointers
        int start = 0;
        int end = arr.length-1;
        
        //swaping loop
        while (start<end) {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            
            //increment and decrement of the pointers
            start = start+1;
            end = end-1;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2,6,8,9};
        System.out.println(Arrays.toString(reverse(arr)));
    }
}
