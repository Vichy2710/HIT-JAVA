package Bai1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Scanner input= new Scanner(System.in);
        try{
            int n=input.nextInt();
            input.nextLine();
            for (int i=0;i<n;i++){
                Person personTmp= new Person();
                System.out.print("Input id: "); personTmp.setId(input.nextLine());
                System.out.print("Input name: "); personTmp.setName(input.nextLine());
                System.out.print("Input address: "); personTmp.setAddress(input.nextLine());
                people.add(personTmp);
            }
        } catch (Exception e){
            System.out.println("Loi nhap du lieu, moi thu lai !");
            return;
        }
        Collections.sort(people);
        System.out.println(people);
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int cmpName=o1.getName().compareTo(o2.getName())
                        , cmpAdd=o2.getAddress().compareTo(o1.getAddress());
                return cmpName!=0 ? cmpName : cmpAdd;

            }
        });
        System.out.println(people);
    }
}
