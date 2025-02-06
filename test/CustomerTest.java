package test;

import domain.Customer;

public class CustomerTest{
    public static void main(String[] args){
        Customer customer = new Customer();
        customer.DisplayCustomerInfo();
        
        // Використання сеттерів для зміни значень
        customer.setID(2);
        customer.setStatus(false);
        customer.setTotal(2000.0);

        System.out.println("\nОновлена ​​інформація про клієнта:");
        customer.DisplayCustomerInfo();
    }
}