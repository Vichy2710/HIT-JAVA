package Bai4;

import java.util.Scanner;

public class PhongMay {
    Scanner input= new Scanner(System.in);
    private String maPhong;
    private String tenPhong;
    private float dienTich;
    private QuanLy x = new QuanLy();
    private May[] y;
    private int n;

    public void nhap(){
        System.out.print("Nhap ma phong: "); maPhong=input.nextLine();
        System.out.print("Nhap ten phong: "); tenPhong=input.nextLine();
        System.out.print("Nhap dien tich: "); dienTich=input.nextFloat();
        x.nhap();
        System.out.print("Nhap so may: "); n=input.nextInt();
        y= new May[n];
        for (int i=0;i<n;i++){
            y[i]= new May();
            System.out.println(i+1);
            y[i].nhap();
        }
    }
    public void xuat(){
        System.out.println("Ma phong: "+maPhong);
        System.out.println("Ten phong: "+tenPhong);
        System.out.println("Dien tich: "+dienTich);
        x.xuat();
        for (int i=0;i<n;i++){
            System.out.println(i+1);
            y[i].xuat();
        }
    }
}
