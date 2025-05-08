package domain;

public class Customer{
    private int ID = 1;
    private boolean isNew = true;
    private doubleS total = 1000.0;

    public void displayCustomerInfo(){
        System.out.println("ID: " + ID);
        System.out.println("Client status: " + isNew);
        System.out.println("Total: " + total);
    }
}