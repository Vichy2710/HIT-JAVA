package Bai3;

public class Class_Main {
    public static void main(String[] args) {
        Class_Guns Diep=new Class_Guns("AK", 20);
        Class_Guns Doan=new Class_Guns("CZ", 21);


        int check1=0, check2=0;
       do {
            int x1=(int)(Math.random()*10+1);
            int x2=(int)(Math.random()*10+1);
            Diep.Shoot(x1);
            Doan.Shoot(x2);
            if(Diep.getAmmoNumber()<x1 && Doan.getAmmoNumber()<x2){
                Diep.Load((int)(Math.random()*10+1));
                Doan.Load((int)(Math.random()*10+1));

            }else if(Diep.getAmmoNumber()<x1){
                check1=1;
            }else if(Doan.getAmmoNumber()<x2){
                check2=1;
            }
            System.out.println(Diep.getAmmoNumber() + " "+x1);
            System.out.println(Doan.getAmmoNumber() + " "+x2);


        } while(check1==0 && check2==0);
       if(check1==1){
            System.out.println("Doan thang!");
        }else{
            System.out.println("Diep thang!");
        }

    }
}
