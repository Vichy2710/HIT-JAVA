package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        ArrayList<Book> books= new ArrayList<>();
        String tmp;
        int choose=0;
        while (choose != 7){
            System.out.println("---Menu Chuong Trinh---");
            System.out.println("1. Add book\n" +
                    "2. Edit book by id\n" +
                    "3. Delete book by id\n" +
                    "4. Sort books by name (ascending)\n" +
                    "5. Sort books by price (descending)\n" +
                    "6. Show all books\n" +
                    "7. Exit");
            System.out.print("\n--Moi nhap yeu cau: ");
            choose= input.nextInt();
            tmp=input.nextLine();
            switch (choose){
                case 1:
                    Book aNewOne = new Book();
                    System.out.println("Nhap thong tin sach muon them:");
                    System.out.print("Nhap id: "); aNewOne.setId(input.nextLine());
                    System.out.print("Nhap ten: "); aNewOne.setName(input.nextLine());
                    System.out.print("Nhap nxb: "); aNewOne.setAuthor(input.nextLine());
                    System.out.print("Nhap gia: "); aNewOne.setPrice(input.nextDouble());
                    System.out.print("Nhap so trang: "); aNewOne.setNumberOfPage(input.nextLong());tmp=input.nextLine();
                    System.out.print("Nhap tac gia: "); aNewOne.setId(input.nextLine());

                    books.add(aNewOne);
                    break;
                case 2:
                    System.out.print("Nhap id sach can sua: ");
                    String idForEditing = input.nextLine();
                    for (int i=0;i<books.size();i++){
                        if (books.get(i).getId().compareTo(idForEditing)==0){
                            System.out.println("1. id +\n" +
                                    "2. name+\n" +
                                    "3. publisher +\n" +
                                    "4. price+\n" +
                                    "5. numberOfPage+\n" +
                                    "6. author+\n");
                            System.out.print("Nhap thuoc tinh can sua: ");
                            Integer numOfAtt = input.nextInt();tmp=input.nextLine();
                            switch (numOfAtt){
                                case 1:
                                    System.out.print("Nhap id: "); books.get(i).setId(input.nextLine());
                                    break;
                                case 2:
                                    System.out.print("Nhap ten: "); books.get(i).setName(input.nextLine());
                                    break;
                                case 3:
                                    System.out.print("Nhap nxb: "); books.get(i).setAuthor(input.nextLine());

                                    break;
                                case 4:
                                    System.out.print("Nhap gia: "); books.get(i).setPrice(input.nextDouble());tmp=input.nextLine();

                                    break;
                                case 5:
                                    System.out.print("Nhap so trang: "); books.get(i).setNumberOfPage(input.nextLong());tmp=input.nextLine();

                                    break;
                                case 6:
                                    System.out.print("Nhap tac gia: "); books.get(i).setId(input.nextLine());

                                    break;

                            }
                            break;
                        }

                    }
                    break;
                case 3:
                    Integer delPos;
                    do{
                        System.out.print("Nhap vi tri cua cuon sach muon xoa: ");
                        delPos= input.nextInt();
                    }while(delPos>books.size() || delPos<=0);
                    books.remove(delPos-1);

                    break;
                case 4:
                    Integer x=books.size();
                    for (int i=0;i<x-1;i++){
                        for (int j=i+1;j<x;j++){
                            if(books.get(i).getName().compareTo(books.get(j).getName())>0){
                                Collections.swap(books,i,j);
                            }
                        }
                    }
                    break;
                case 5:
                    for (int i=0;i<books.size()-1;i++){
                        for (int j=i+1;j<books.size();j++){
                            if(books.get(i).getPrice()<books.get(j).getPrice()){
                                Collections.swap(books,i,j);
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println(books);
                    break;
                case 7:
                    System.out.println("cam on quy khach da su dung dich vu :3");
                    break;
            }
        }



    }
}
