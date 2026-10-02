package Striver.Patterns;

import java.util.Scanner;

public class RightTriangleStar {
    static void Sol(int n){
        for(int i = 1;i<n;i++){
            for(int j = 1;j<n;j++){
                System.err.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        n = sc.nextInt();
        Sol(n);
    }
}
