//Iterative Approach

import java.util.Scanner;

public class If_Array_Sorted{
    static boolean sortCheck(int[] arr){
        //declaring flag
        boolean flag = true;
        
        //iterating into the array
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag = false;
                break;
            }
        }

        //returning according to flag
        if (flag) {
            return true;
        }else{
            return false;
        }
        
    }
    public static void main(String[] args){
        //variable declaring
        int n,tmp;

        //input of total array size
        System.out.print("Total elements: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        //declaring array
        int[] num=new int[n];
        
        //user input
        for(int i=0;i<n;i++){
            System.out.print("Element "+(i+1)+": ");
            tmp = sc.nextInt();
            num[i] = tmp;
        }
        
        //using sortCheck function
        if(sortCheck(num)){
            System.out.println("Array is sorted!");
        }else{
            System.out.println("Array is not sorted!");
        }
    }
}