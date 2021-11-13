package Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RunMain {
    public static int dem15(LopHoc a){
        int dem=0;
        for (SinhVien i: a.getX()){
            if(i.getKhoaHoc()==15)
                dem++;
        }
        return dem;
    }
    public static void SapXep(LopHoc a){
        int i,j;
        for (i=0;i<a.getN()-1;i++)
            for (j=i+1;j<a.getN();j++)
                if(a.getX().get(i).getKhoaHoc()>a.getX().get(j).getKhoaHoc()){
                    Collections.swap(a.getX(),i,j);
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        LopHoc a=new LopHoc();
        String tmp;
        System.out.print("Nhap ma lop hoc: ");
        tmp=input.nextLine();
        a.setMaLH(tmp);
        System.out.print("Nhap ma ten hoc: ");
        tmp=input.nextLine();
        a.setTenLH(tmp);
        System.out.print("Nhap ngay mo: ");
        tmp=input.nextLine();
        a.setNgayMo(tmp);
        System.out.print("Nhap giao vien: ");
        tmp=input.nextLine();
        a.setGiaoVien(tmp);
        System.out.print("Nhap so sinh vien: ");
        int tmpn=input.nextInt();
        a.setN(tmpn);

        ArrayList<SinhVien> tmpSV=new ArrayList<>(tmpn);
        for (int i=0;i<tmpn;i++){
            System.out.println(i+1);
            String tmpInFor=input.nextLine();

            SinhVien t= new SinhVien();
            System.out.print("Nhap ho ten: ");
            tmpInFor= input.nextLine();
            t.setHoTen(tmpInFor);
            System.out.print("Nhap ngay sinh: ");
            tmpInFor= input.nextLine();
            t.setNgaySinh(tmpInFor);
            System.out.print("Nhap que quan: ");
            tmpInFor= input.nextLine();
            t.setQueQuan(tmpInFor);
            System.out.print("Nhap ma sinh vien: ");
            tmpInFor= input.nextLine();
            t.setMaSV(tmpInFor);
            System.out.print("Nhap nganh: ");
            tmpInFor= input.nextLine();
            t.setNganh(tmpInFor);
            System.out.print("Nhap khoa hoc: ");
            int so=input.nextInt();
            t.setKhoaHoc(so);

            tmpSV.add(t);
        }
        a.setX(tmpSV);
        System.out.println("Ma lop hoc: "+a.getMaLH());
        System.out.println("Ten lop hoc: "+a.getTenLH());
        System.out.println("Ngay mo: "+a.getNgayMo());
        System.out.println("Giao vien: "+a.getGiaoVien());
        System.out.println("\n---Danh sach sinh vien---");
        for (SinhVien i: a.getX()){
            System.out.println(i);
        }

        System.out.println("So sinh vien khoa 15: "+dem15(a));

        SapXep(a);
        System.out.println("\n--Danh sach sinh vien sau khi sap xep:");
        for (SinhVien i: a.getX()){
            System.out.println(i);
        }
    }
}
