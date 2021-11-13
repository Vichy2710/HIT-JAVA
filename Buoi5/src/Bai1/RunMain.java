package Bai1;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class RunMain {
    public static void check(ArrayList<DieuHoa> a){
        int c=0;
        for(DieuHoa i : a){
            if(i.getTenHangSX().equals("Electrolux")){
                System.out.println(i);
                ++c;
            }
        }
        if(c==0){
            System.out.println("Khong ton tai!!");
        }
    }
    public static void minCost(ArrayList<DieuHoa> a){
        double m=a.get(0).getGiaBan();
        for (DieuHoa i: a){
            if(i.getGiaBan()<m){
                m=i.getGiaBan();
            }
        }
        for (DieuHoa i: a){
            if(i.getGiaBan()==m){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap n: ");
            n=input.nextInt();
        }while (n<=0);

        ArrayList<DieuHoa> dsDieuHoa = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            System.out.println(i+1);
            DieuHoa a= new DieuHoa();
            a.Nhap();
            dsDieuHoa.add(a);
        }
        for (int i=0;i<n;i++){
            System.out.println(i+1);
            System.out.println(dsDieuHoa.get(i));
        }

        System.out.println("\n--Cac dieu hoa cua hang Electrolux:");
        check(dsDieuHoa);

        System.out.println("\n--Cac dieu hoa co gia ban thap nhat:");
        minCost(dsDieuHoa);

    }
}
