package Bai2;

import java.util.Scanner;

public class DateTime {
    Scanner input=new Scanner(System.in);
    private int ngay, thang, nam;
    public void InputDate(){
        System.out.print("Nhap ngay: "); ngay=input.nextInt();
        System.out.print("Nhap thang: "); thang=input.nextInt();
        System.out.print("Nhap nam: "); nam=input.nextInt();
    }
    public void OutputDate(){
        System.out.println(ngay+"-"+thang+"-"+nam);
    }
    @Override
    public String toString(){
        return ngay+"-"+thang+"-"+nam;
    }
}
