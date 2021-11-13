package Bai3;

import java.util.Scanner;

public class Nguoi {
    Scanner input= new Scanner(System.in);
    protected String hoTen, ngaySinh, queQuan;

    public void Nhap(){
        System.out.print("Nhap ho ten: "); hoTen=input.nextLine();
        System.out.print("Nhap ngay sinh: "); ngaySinh=input.nextLine();
        System.out.print("Nhap que quan: "); queQuan=input.nextLine();
    }
    public void Xuat(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Ngay sinh: "+ngaySinh);
        System.out.println("Que quan: "+queQuan);
    }

}
