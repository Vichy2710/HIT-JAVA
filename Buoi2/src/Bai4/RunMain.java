package Bai4;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String a= input.nextLine();
        a=a.replaceAll("\\d", "");
        a=a.replaceAll("\\s+"," " );
        a=a.trim();
        char[] tmp= a.toCharArray();
        tmp[0]=Character.toUpperCase(tmp[0]);
        for (int i=1;i<tmp.length;i++){
            if(tmp[i-1]==' '){
                tmp[i]=Character.toUpperCase(tmp[i]);
            }
        }
        a= new String(tmp);
        System.out.println(a);
    }
}
