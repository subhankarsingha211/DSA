import java.util.*;

class Main {
    static boolean sol(int[] nums){
        Set<Integer> uniques = new HashSet<Integer>();
        for(int i:nums){
            if(uniques.contains(i)){
                return true;
            }
            uniques.add(i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,12,13};
        System.out.println(sol(arr)==false?"No Duplicate":"There is a Duplicate");
    }
}