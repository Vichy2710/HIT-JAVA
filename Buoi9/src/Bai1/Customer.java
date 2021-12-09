package Bai1;

public class Customer extends Person{

    private int balance;
    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance=balance;
    }

    @Override
    public void display() {
        System.out.println("Employee name: "+getName());
        System.out.println("Employee address: "+getAddress());
        System.out.println("Employee salary: "+balance);
    }
}
