package Bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s= input.nextLine();
        long sum=0, cnt=0, mul=1;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)<='9' && s.charAt(i)>='0'){
                cnt++;
                sum+=Character.getNumericValue(s.charAt(i));
            }
        }

        for (int i=0;i<s.length();i++){
            if(s.charAt(i)<='9' && s.charAt(i)>='1' && sum%Character.getNumericValue(s.charAt(i))==0){
                mul*=Character.getNumericValue(s.charAt(i));
            }
        }

        System.out.println("Co "+cnt+" ky tu so");
        System.out.println("Tich: "+mul);
    }
}
