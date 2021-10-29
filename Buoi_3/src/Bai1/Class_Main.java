package Bai1;

import java.util.Scanner;

public class Class_Main {
    public static void main(String[] args) {
        Class_Person Ps1= new Class_Person("Vichy",19,"Female","Out of deadline");

        System.out.println("Ps1 "+Ps1.toString());

        Class_Person Ps2 = new Class_Person();
        Scanner input= new Scanner(System.in);

        System.out.print("\nInput name: ");
        String tmp = input.nextLine();
        Ps2.setName(tmp);
        System.out.print("Input age: ");
        int x=input.nextInt();
        Ps2.setAge(x);
        System.out.print("Input gender: ");
        tmp = input.nextLine();
        tmp = input.nextLine();
        Ps2.setGender(tmp);
        System.out.print("Input hobby: ");
        tmp = input.nextLine();
        Ps2.setHobby(tmp);

        System.out.println("\nPs2: ");
        System.out.println("\tName: "+Ps2.getName());
        System.out.println("\tAge: "+Ps2.getAge());
        System.out.println("\tGender: "+Ps2.getGender());
        System.out.println("\tHobby: "+Ps2.getHobby());
    }
}
