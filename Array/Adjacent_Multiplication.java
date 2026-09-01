public class Adjacent_Multiplication {
    public static int[] Adjacent_Multiply(int[] arr){
        int[] newArr= new int[arr.length];
        int num;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                num = arr[i]*arr[i+1];
            }
            else if(i==arr.length-1){
                num = arr[i]*arr[i-1];
            }
            else{
                num = arr[i-1]*arr[i]*arr[i+1];
            }
            newArr[i] = num;
        }
        return newArr;
    }
    public static void main(String[] args){
        int[] arr = {2,4,5};
        for(int i:Adjacent_Multiply(arr)){
            System.out.print(i+" ");
        }
    }
}
