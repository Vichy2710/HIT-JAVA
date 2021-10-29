package Bai1;

import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        System.out.println("Max = " +Math.max(a,Math.max(b,c)));
    }
}
