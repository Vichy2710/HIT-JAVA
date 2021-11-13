package Bai4;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sum<Integer> exInt=new Sum(1,2);
        System.out.println(exInt.getSoA()+exInt.getSoB());

        Sum<Long> exLong=new Sum(100L,2000L);
        System.out.println(exLong.getSoA()+exLong.getSoB());

        Sum<Float> exFloat=new Sum(1.1f,2.21f);
        System.out.println(exFloat.getSoA()+exFloat.getSoB());

        Sum<Double> exDouble=new Sum(100.1,100.2);
        System.out.println(exDouble.getSoA()+exDouble.getSoB());


    }
}
