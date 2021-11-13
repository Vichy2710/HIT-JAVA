package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    Scanner input=new Scanner(System.in);
    private String maPhieu, tenPhieu;
    private DateTime a=new DateTime();
    ArrayList<SanPham> x= new ArrayList<>();
    private int n;

    public void InputPhieu(){
        System.out.print("Nhap ma phieu: "); maPhieu=input.nextLine();
        System.out.print("Nhap ten phieu: "); tenPhieu=input.nextLine();
        a.InputDate();
        System.out.print("Nhap n: "); n=input.nextInt();
        for (int i=0;i<n;i++){
            System.out.println(i+1);
            SanPham tmp= new SanPham();
            tmp.InputSP();
            x.add(tmp);
        }
    }
    public void OutputPhieu(){
        System.out.println("Ma phieu: "+maPhieu);
        System.out.println("Ten phieu: "+tenPhieu);
        System.out.print("Ngay: "); a.OutputDate();
        System.out.println("--Danh sach san pham: ");
        for (SanPham i: x){
            System.out.println(x.indexOf(i)+1);
            System.out.print(i);
            System.out.println(", thanh tien="+i.getSoLuong()*i.getDonGia());
        }
    }
}
