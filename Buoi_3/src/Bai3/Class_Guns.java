package Bai3;

public class Class_Guns {
    private String weaponName;
    private int ammoNumber;

    public void Load(int x){
        ammoNumber+=x;
    }
    public void Shoot(int x){
        if(ammoNumber-x>=0){
            ammoNumber-=x;
        }
        else{
            System.out.println("Het dan!");
        }
    }
    public Class_Guns(){
        ammoNumber=100;
        weaponName="";
    }
    public Class_Guns(String weaponName, int ammoNumber){
        this.weaponName=weaponName;
        this.ammoNumber=ammoNumber;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }
}
