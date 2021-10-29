package LyThuyet;

import java.util.Scanner;

public class VD1 {
    public static void main(String[] args) {
//        int[] arr = new int[3];
//        int[] arr2= {1,2,3,43};
//        int[][] b= new int[5][6];
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a= new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.println(a[i]+ " ");
        }
    }
}
