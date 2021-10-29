package Bai2;

import Bai1.Class_Person;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Class_Array {
    private int[] a;
    private int n;

    Scanner input = new Scanner(System.in);
    public void InputData(){
        do{
            System.out.print("Input n=");
            n=input.nextInt();
        }while(n<0);
        a= new int[n];
        for (int i=0;i<n;i++){
            System.out.print("a["+i+"]=");
            a[i]=input.nextInt();
        }
    }


    public void Show(){
        System.out.println("Array: "+ Arrays.toString(a));
    }

    public int Sum(){
        int s=0;
        for(int i=0;i<n;i++){
            s+=a[i];
        }
        return s;
    }

    public void Filter(Boolean flag){
        if(flag){
            for(int i=0;i<n;i++){
                if(a[i]%2==0){
                    System.out.println(a[i]+" ");
                }
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(a[i]%2==1){
                    System.out.println(a[i]+" ");
                }
            }
        }
    }

    public Class_Array(){
        a=null;
        n=0;
    };
    public Class_Array(int[] a, int n){
        this.a=a;
        this.n=n;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
