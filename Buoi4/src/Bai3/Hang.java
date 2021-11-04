package Bai3;

import java.util.Scanner;

public class Hang {
    Scanner input = new Scanner(System.in);
    private String maHang;
    private String tenHang;
    private float donGia;

    public void nhap(){

        System.out.print("Nhap ma hang: "); maHang=input.nextLine();
        System.out.print("Nhap ten hang: "); tenHang=input.nextLine();
        System.out.print("Nhap don gia: "); donGia=input.nextFloat();

    }
    public void xuat(){
        System.out.println(
                "maHang: " + maHang + '\n' +
                "tenHang: " + tenHang + '\n' +
                "donGia: " + donGia + '\n' );
    }

}
