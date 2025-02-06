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

     // Сетери
    public boolean setID(int ID) {
        if (ID > 0) {
            this.ID = ID;
            return true;
        }
        return false;
    }

    public boolean setStatus(boolean isNew) {
        this.isNew = isNew;
        return true;
    }

    public boolean setTotal(double total) {
        if (total >= 0) {
            this.total = total;
            return true;
        }
        return false;
    }

}