package Bai2;

import java.util.Scanner;

public class SanPham {
     Scanner input=new Scanner(System.in);
     private String maSP, tenSP;
     private int soLuong;
     private double donGia;

     public void InputSP(){
         System.out.print("Nhap ma sp: "); maSP=input.nextLine();
         System.out.print("Nhap ten sp: "); tenSP=input.nextLine();
         System.out.print("Nhap so luong: "); soLuong=input.nextInt();
         System.out.print("Nhap don gia: "); donGia=input.nextDouble();
     }
    public void OutputSP(){
        System.out.println("maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia);
    }
    @Override
    public String toString() {
        return "maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia ;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getDonGia() {
        return donGia;
    }
}
