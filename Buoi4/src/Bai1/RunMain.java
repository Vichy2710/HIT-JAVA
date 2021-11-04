package Bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n;
        System.out.print("Nhap so sach: ");
        n = input.nextInt();
        Sach[] sach = new Sach[n];
        for (int i=0;i<n;i++){
            sach[i] = new Sach();
            System.out.println(i+1);
            sach[i].Nhap();
        }

        System.out.println("Thong tin cac cuon sach!!");

        for (int i=0;i<n;i++){
            System.out.println(i+1);
            sach[i].Xuat();
        }
    }
}
