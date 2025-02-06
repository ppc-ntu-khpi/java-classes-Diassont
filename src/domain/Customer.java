package domain;

public class Customer {
    private int ID = 1;
    private boolean isNew = true;
    private double total = 1000.0;


    public Customer(){
        this.ID = 1;
        this.isNew = true;
        this.total = 1000.0;
    }

    public void DisplayCustomerInfo(){
        System.out.println("ID: " + ID);
        System.out.println("Is new: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
}