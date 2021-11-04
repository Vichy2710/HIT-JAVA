package Bai1;

import java.util.Scanner;

public class Sach {
    Scanner input = new Scanner(System.in);
    private String maSach;
    private String tensach;
    private String NXB;
    private int soTrang;
    private float giaTien;

    public void Nhap(){
        System.out.print("Nhap ma sach: ");
        maSach = input.nextLine();
        System.out.print("Nhap ten sach: ");
        tensach = input.nextLine();
        System.out.print("Nhap NXB: ");
        NXB = input.nextLine();
        System.out.print("Nhap so trang: ");
        soTrang = input.nextInt();
        System.out.print("Nhap gia tien: ");
        giaTien = input.nextFloat();
        String tmp = input.nextLine();
    }

    public void Xuat(){
        System.out.println(
                "maSach: " + maSach + '\n' +
                "tensach: " + tensach + '\n' +
                "NXB: " + NXB + '\n' +
                "soTrang: " + soTrang + '\n' +
                "giaTien: " + giaTien + '\n');
    }

}

