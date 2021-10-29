package Bai3;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String s = input.nextLine();
        int sum=0, check=0;
        for (int i=0;i< s.length();i++){
            if('9'>=s.charAt(i) && s.charAt(i)>='0'){
                sum+=Character.getNumericValue(s.charAt(i));
                check++;
            }
        }
        if(check==0){
            System.out.println("false");
        }
        else{
            System.out.println("true");
            System.out.println(1.0*sum/check);
        }
    }
}
