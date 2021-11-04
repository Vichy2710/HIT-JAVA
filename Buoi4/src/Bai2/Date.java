package Bai2;

import java.util.Scanner;

public class Date {
    Scanner input = new Scanner(System.in);
    private int ngay;
    private int thang;
    private int nam;

    public void Nhap(){
        System.out.print("Nhap ngay: ");
        ngay = input.nextInt();
        System.out.print("Nhap thang: ");
        thang = input.nextInt();
        System.out.print("Nhap nam: ");
        nam = input.nextInt();
    }
    public void Xuat(){
        System.out.println(ngay+"-"+thang+"-"+nam);
    }
}
