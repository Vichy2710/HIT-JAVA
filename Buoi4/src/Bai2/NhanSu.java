package Bai2;

import java.util.Scanner;

public class NhanSu {
    Scanner input = new Scanner(System.in);
    private String maNhanSu;
    private String hoTen;
    private Date NS = new Date();

    public void Nhap(){
        System.out.print("Nhap ma nhan su: ");
        maNhanSu= input.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen= input.nextLine();
        NS.Nhap();
    }
    public void Xuat(){
        System.out.print(
                "maNhanSu: " + maNhanSu + '\n' +
                "hoTen: " + hoTen + '\n' +
                "NS: ");
        NS.Xuat();
    }
}
