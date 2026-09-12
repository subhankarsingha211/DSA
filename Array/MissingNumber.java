import java.util.*;

public class MissingNumber {
    
    static int sol(int[] nums){
        int actual_sum = 0;
        int nums_sum=0;
        for(int i:nums){
            nums_sum=nums_sum+i;
        }
        for(int i=1;i<=nums.length;i++){
            actual_sum = actual_sum + i;
        }
        return actual_sum-nums_sum;
    }
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(sol(arr));
    }
}

