package Bai4;

import java.util.Scanner;

public class QuanLy {
    Scanner input= new Scanner(System.in);
    private String maQL;
    private String hoTen;

    public void nhap(){
        System.out.print("Nhap ma quan ly: "); maQL=input.nextLine();
        System.out.print("Nhap ho ten: "); hoTen=input.nextLine();

    }
    public void xuat(){
        System.out.println(
                "maQL: " + maQL + '\n' +
                "hoTen: " + hoTen + '\n');
    }

}
