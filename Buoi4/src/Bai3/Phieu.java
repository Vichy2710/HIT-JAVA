package Bai3;

import java.util.Scanner;

public class Phieu {
    Scanner input= new Scanner(System.in);
    private String maPhieu;
    private Hang[] x;
    private int n;

    public void nhap(){
        System.out.print("Nhap ma phieu: "); maPhieu=input.nextLine();
        System.out.print("Nhap so hang: "); n=input.nextInt();
        x= new Hang[n];
        for (int i=0;i<n;i++){
            x[i]=new Hang();
            System.out.println(i+1);
            x[i].nhap();
        }
    }
    public void xuat(){
        System.out.println("Ma phieu: " +maPhieu);
        for (int i=0;i<n;i++){
            System.out.println(i+1);
            x[i].xuat();
        }
    }

}
