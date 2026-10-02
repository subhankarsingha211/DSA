import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String a ="Subhankar";
        String b = "Singha";

        char[] arr = a.toCharArray();
        char[] arr2 = b.toCharArray();
        ArrayList<Character> alpha = new ArrayList<>();
        
        for(int i=0; i<arr.length+arr2.length;i++){
            if(i+1<=arr.length){
                alpha.add(arr[i]);
            }
            if(i+1<=arr2.length){
                alpha.add(arr2[i]);    
            }
        }
        StringBuilder str = new StringBuilder();

        for(char s: alpha){
            str.append(s);
        }

        String result = str.toString();
        System.out.println(result);
    }
} 
