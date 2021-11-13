package Bai3;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Scanner;

public class LopHoc {
    Scanner input= new Scanner(System.in);
    private String maLH, tenLH, ngayMo;
    private ArrayList<SinhVien> x= new ArrayList<>();
    private int n;
    private String giaoVien;

    public LopHoc(){
        maLH="";
        tenLH="";
        ngayMo="";
        x=null;
        n=0;
        giaoVien="";
    }


    public String getMaLH() {
        return maLH;
    }

    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public ArrayList<SinhVien> getX() {
        return x;
    }

    public void setX(ArrayList<SinhVien> x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }
}
