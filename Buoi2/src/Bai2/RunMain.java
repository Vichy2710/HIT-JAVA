package Bai2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RunMain {
    public static void menu(){
        System.out.println("Moi nhap lua chon cua ban:");
        System.out.println("1. Tao va nhap mang voi n so nguyen");
        System.out.println("2. Hien thi mang vua tao");
        System.out.println("3. Them 1 phan tu vao vi tri k bat ky");
        System.out.println("4. Xoa 1 phan tu tai vi tri k bat ky");
        System.out.println("5. Dao nguoc mang");
        System.out.println("6. Hien thi phan tu a[1] va cac so chia het cho a[1]");
        System.out.println("7. Xuat ra man hinh tong cac so nguyen to co trong mang");
        System.out.println("8. Thoat");
    }
    public static void sleep(int miliSec){
        try {
            Thread.sleep(miliSec);
        } catch (Exception e){}
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        int[] x=new int[n];
        int opt =0;
        while(opt!=8){
            menu();
            opt = input.nextInt();
            switch (opt){
                case 1:
                    c1_taoVaNhapMang(x,n);
                    sleep(2000);
                    break;
                case 2:
                    c2_hienThiMang(x,n);
                    sleep(2000);
                    break;
                case 3:
                    ++n;
                    x=c3_themPhanTu(x,n,3,9);
                    c2_hienThiMang(x,n);
                    sleep(2000);
                    break;
                case 4:
                    --n;
                    x=c4_xoaPhanTu(x,n,2);
                    c2_hienThiMang(x,n);
                    sleep(2000);
                    break;
                case 5:
                    c2_hienThiMang(c5_daoNguocMang(x,n),n);
                    sleep(2000);
                    break;
                case 6:
                    c6_a1(x,n);
                    sleep(2000);
                    break;
                case 7:
                    System.out.println(c7_tongNguyenTo(x,n));
                    sleep(2000);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Yeu cau khong hop le!!!");
            }
        }
        System.out.println("Cam on ban da su dung cac tinh nang!!");


    }

    public static int[] c1_taoVaNhapMang(int[] a, int n){
        Scanner input= new Scanner(System.in);
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i=0;i<n;i++){
            a[i] = input.nextInt();
        }
        System.out.println("Tao mang thanh cong!!");
        return a;
    }
    public static void c2_hienThiMang(int[] a, int n){
        System.out.println("Mang: " + Arrays.toString(a));
    }
    public static int[] c3_themPhanTu(int[] a, int n, int viTri, int phanTuThem){
        if(viTri>n){
            System.out.println("Vi tri khong hop le!");
            return a;
        }
        else{
            int[] x= new int[n];
            for (int i=0;i<n;i++){
                if(i<viTri-1){
                    x[i]=a[i];
                }
                else if(i==viTri-1){
                    x[i]=phanTuThem;
                }
                else{
                    x[i]=a[i-1];
                }
            }
            return x;
        }
    }
    public static int[] c4_xoaPhanTu(int[] a, int n, int viTri){
        if(viTri>n){
            System.out.println("Vi tri khong hop le!");
            return a;
        }
        else{
            int[] x= new int[n];
            for (int i=0;i<n;i++){
                if(i<viTri-1){
                    x[i]=a[i];
                }
                else{
                    x[i]=a[i+1];
                }
            }
            return x;
        }
    }
    public static int[] c5_daoNguocMang(int[] a, int n){
        int[] x= new int[n];
        for (int i=0;i<n;i++){
            x[i]=a[n-1-i];
        }
        return x;
    }
    public static void c6_a1(int[] a, int n){
        if(n<2){
            System.out.println("Khong ton tai a[1] !!");
        }
        else{
            System.out.println("a[1] = " +a[1]);
            System.out.print("Cac so chia het cho a[1] la: ");
            for(int i=0;i<n;i++){
                if(i!=1){
                    if(a[i]%a[1]==0){
                        System.out.print(a[i]+" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static int c7_tongNguyenTo(int[] a, int n){
        int sum=0;
        for (int i=0;i<n;i++){
            int check=0;
            if(a[i]>=2){
                for (int j=2;j<=a[i]/2;j++){
                    if(a[i]%j==0){
                        check++;
                    }
                }
                if(check==0){
                    sum+=a[i];
                }
            }
        }
        return sum;
    }
}
