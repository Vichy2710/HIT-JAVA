package Bai1;

import java.util.Scanner;

public class SanPham {
    Scanner input= new Scanner(System.in);
    protected String maSP;
    protected String tenSP;
    protected String tenHangSX;
    protected String ngayNhap;

//    public SanPham(String maSP, String tenSP, String tenHangSX, String ngayNhap){
//        this.maSP=maSP;
//        this.tenSP=tenSP;
//        this.tenHangSX=tenHangSX;
//        this.ngayNhap=ngayNhap;
//    }
    public void Nhap(){
        System.out.print("Nhap ma sp: "); maSP=input.nextLine();
        System.out.print("Nhap ten sp: "); tenSP=input.nextLine();
        System.out.print("Nhap ten hang sx: "); tenHangSX=input.nextLine();
        System.out.print("Nhap ngay nhap: "); ngayNhap=input.nextLine();
    }

    public void Xuat(){
        System.out.print(
                "maSP='" + maSP + '\n' +
                "tenSP='" + tenSP + '\n' +
                "tenHangSX='" + tenHangSX + '\n' +
                "ngayNhap='" + ngayNhap + '\n'
                );
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public String getTenHangSX() {
        return tenHangSX;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }
}
