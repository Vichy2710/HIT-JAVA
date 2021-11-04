package Bai4;

import java.util.Scanner;

public class May {
    Scanner input= new Scanner(System.in);
    private String maMay;
    private String kieuMay;
    private String tinhTrang;

    public void nhap(){
        System.out.print("Nhap ma may: "); maMay=input.nextLine();
        System.out.print("Nhap kieu may: "); kieuMay=input.nextLine();
        System.out.print("Nhap tinh trang: "); tinhTrang=input.nextLine();

    }
    public void xuat(){
        System.out.println(
                "Ma may: " + maMay + '\n' +
                "Kieu may: " + kieuMay + '\n' +
                 "Tinh trang: " + tinhTrang + '\n');
    }
}
