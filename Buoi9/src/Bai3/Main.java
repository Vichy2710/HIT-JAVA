package Bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int choose=0;
        ArrayList<News> listNews = new ArrayList<>();
        while(true){
            System.out.println("---Menu---\n" +
                    "1. Insert news\n" +
                    "2. View list news\n" +
                    "3. Average rate\n" +
                    "4. Exit"
            );
            do{
                System.out.print("Choose your option: ");
                choose = input.nextInt();
            }while(choose!=1 && choose!=2 && choose!=3 && choose!=4);

            switch (choose){
                case 1:
                    String t= input.nextLine();
                    News tmp= new News();
                    System.out.print("Input title: "); tmp.setTitle(input.nextLine());
                    System.out.print("Input publish date: "); tmp.setPublishDate(input.nextLine());
                    System.out.print("Input author: "); tmp.setAuthor(input.nextLine());
                    System.out.print("Input content: "); tmp.setContent(input.nextLine());
                    System.out.print("Input 3 rates: "); tmp.setRateList(
                        input.nextInt(), input.nextInt(),input.nextInt()
                );
                    listNews.add(tmp);
                    break;
                case 2:
                    for (News i: listNews){
                        System.out.println("---");
                        i.Display();
                    }
                    break;

                case 3:
                    for (News i: listNews){
                        i.Calculate();
                        System.out.println("---");
                        i.Display();
                    }
                    break;
                case 4:
                    System.out.println("Thanks for using our services !!");
                    return;
            }
        }
    }
}
