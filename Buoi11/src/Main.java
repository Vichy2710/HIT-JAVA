import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        int option=0;
        Pattern patUsername = Pattern.compile("^[\\w]{6,}$");
        Pattern patPassword = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^\\s\\w])([^\\s]){8,}$");
        Pattern patEmail = Pattern.compile("^[a-zA-Z]+[^\\s]*@\\w+mail\\.com$");
        Pattern patPhoneNumber = Pattern.compile("^(?:\\+84|0)\\d{9,15}$");
        System.out.println("===Welcome to the app===\n");
        while(option!=4){
            Thread.sleep(1000);
            System.out.println("\nChoose 1 option: \n" +
                    "1. Create a new account\n" +
                    "2. Login to an existing account\n" +
                    "3. Sort accounts by username\n" +
                    "4. Exit");
            try{
                option = input.nextInt(); input.nextLine();
            }catch (Exception ex){
                System.out.println("Invalid input");
            }
            switch (option){
                case 1: {
                    String name, password, email, phonenumber, rePassword;
                    FileWriter fileWriter = new FileWriter("ACC.DAT", true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    PrintWriter printWriter = new PrintWriter(bufferedWriter);
                    boolean check=true;
                    do {
                        System.out.print("Input username: ");
                        name = input.nextLine();
                        ArrayList<Users> users = new ArrayList<>();
                        Scanner file = new Scanner(Paths.get("ACC.DAT"));
                        while (file.hasNext()) {
                            String s = file.nextLine();
                            String[] a = s.split("\\|");
                            users.add(new Users(a[0], a[1], a[2], a[3], a[4]));
                        }
                        String nameTmp=name;
                        check=users.stream().anyMatch(n->n.getName().equals(nameTmp));
                        if(check)
                            System.out.println("Username already exists.");
                    } while (!patUsername.matcher(name).matches() || check);
                    do {
                        System.out.print("Input password: ");
                        password = input.nextLine();
                    } while (!patPassword.matcher(password).matches());
                    do {
                        System.out.print("Re-input password: ");
                        rePassword = input.nextLine();
                    } while (!password.equals(rePassword));
                    do {
                        System.out.print("Input email: ");
                        email = input.nextLine();
                    } while (!patEmail.matcher(email).matches());
                    do {
                        System.out.print("Input phone number: ");
                        phonenumber = input.nextLine();
                    } while (!patPhoneNumber.matcher(phonenumber).matches());

                    Date date = new Date();
                    SimpleDateFormat now = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
                    String time = now.format(date);

                    Users user = new Users(name, password, email, phonenumber, time);
                    printWriter.println(user);
                    printWriter.close();
                    bufferedWriter.close();
                    fileWriter.close();
                    break;
                }
                case 2: {
                    ArrayList<Users> users = new ArrayList<>();
                    Scanner file = new Scanner(Paths.get("ACC.DAT"));
                    while (file.hasNext()) {
                        String s = file.nextLine();
                        String[] a = s.split("\\|");
                        users.add(new Users(a[0], a[1], a[2], a[3], a[4]));
                    }
                    boolean check=false;
                    int remember;
                    String user = "";
                    do{
                        System.out.print("Enter username: "); String userName= input.nextLine();
                        System.out.print("Enter password: "); String password= input.nextLine();
                        check=users.stream().anyMatch(n->n.getName().equals(userName)&&n.getPassword().equals(password));
                        if(!check){
                            System.out.println("Usernam or password is incorrect or Account does not exist. ");
                            System.out.println("\n1. Continue loggin in\n" + "2. Back to menu");
                            remember=input.nextInt(); input.nextLine();
                            if(remember!=1)
                                break;
                        }
                        user=userName;
                    }while(!check);
                    if(check){
                        System.out.println("Login Successful !");
                        Thread.sleep(1000);

                        int option2;
                        int index=0;
                        for (int i=0;i<users.size();i++){
                            if(users.get(i).getName().equals(user))
                                index=i;
                        }
                        do{
                            Thread.sleep(1000);
                            System.out.println("\n1. Show infor\n" +
                                    "2. Change password\n" +
                                    "3. Back to menu\n");
                            option2=input.nextInt(); input.nextLine();
                            switch (option2){
                                case 1:
                                    System.out.println("- Username: "+ users.get(index).getName()+
                                            "\n- Email: "+ users.get(index).getEmail()+
                                            "\n- Phone: "+ users.get(index).getPhone()+
                                            "\n- Create at: "+ users.get(index).getTime());
                                    break;
                                case 2:
                                    boolean checkOldPW;
                                    do{
                                        System.out.print("Enter old password: ");
                                        checkOldPW=input.nextLine().equals(users.get(index).getPassword());
                                    }while(!checkOldPW);
                                    String newPassword,reNewPassword;
                                    do {
                                        System.out.print("Input new password: ");
                                        newPassword=input.nextLine();
                                        users.get(index).setPassword(newPassword);
                                    } while (!patPassword.matcher(newPassword).matches());
                                    do {
                                        System.out.print("Re-input password: ");
                                        reNewPassword = input.nextLine();
                                    } while (!newPassword.equals(reNewPassword));
                                    System.out.println("Change password successful. ");
                                    FileWriter fileWriter = new FileWriter("ACC.DAT", false);
                                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                                    PrintWriter printWriter = new PrintWriter(bufferedWriter);
                                    users.forEach(printWriter::println);
                                    printWriter.close();
                                    bufferedWriter.close();
                                    fileWriter.close();
                                    break;
                                case 3:
                                    break;
                            }
                        }while(option2!=3);

                    }
                    break;
                }
                case 3: {
                    ArrayList<Users> users = new ArrayList<>();
                    Scanner file = new Scanner(Paths.get("ACC.DAT"));
                    while (file.hasNext()) {
                        String s = file.nextLine();
                        String[] a = s.split("\\|");
                        users.add(new Users(a[0], a[1], a[2], a[3], a[4]));
                    }
                    Collections.sort(users);
                    users.forEach(n->
                            System.out.println(n.getName()+" | "+n.getEmail()+" | "+n.getPhone()+ " | "+n.getTime()));
                    break;
                }
                case 4: {
                    System.out.println("Thanks for using the app !!!");
                    break;
                }
                default:{
                    System.out.println("Invalid option !");
                }
            }
        }
    }
}
