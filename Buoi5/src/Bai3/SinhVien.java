package Bai3;

import java.util.Scanner;

public class SinhVien extends Nguoi{
    Scanner input= new Scanner(System.in);
    private String maSV, nganh;
    private int khoaHoc;

    public SinhVien(){
        maSV="";
        nganh="";
        khoaHoc=0;
        hoTen="";
        ngaySinh="";
        queQuan="";
    }


    @Override
    public String toString() {
        return
                " hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", queQuan='" + queQuan + '\'' +
                ", maSV='" + maSV + '\'' +
                ", nganh='" + nganh + '\'' +
                ", khoaHoc=" + khoaHoc ;
    }
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }


    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }
}
