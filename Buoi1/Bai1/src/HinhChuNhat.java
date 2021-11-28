import java.util.Scanner;

public class HinhChuNhat{
    public static void main(String[] args) {

        int n=4,m=12;
        for(int i=0;i<m;i++){
            System.out.print("* ");
        }
        System.out.println(" ");
        for(int i=1;i<n-1;i++){
            System.out.print("*");
            for (int j=1;j<m-1;j++){
                System.out.print("  ");
            }
            System.out.println(" *");
        }
        for(int i=0;i<m;i++){
            System.out.print("* ");
        }

    }
}
