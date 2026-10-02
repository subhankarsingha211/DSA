import java.util.*;

public class LC_Two_Sum {
    static int[] TwoSum(int[] arr, int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(i, arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            int more = target-arr[i];
            if(hm.containsValue(more)){
                return new int[] {i,hm};
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] arr = {1,3,6,9,10,13,2};
        int target = 10;
        System.out.println(Arrays.toString(TwoSum(arr, target)));
    }
}
