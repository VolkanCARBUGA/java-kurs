package ArrayList;

import java.util.ArrayList;

public class ArraylistWithClass {
    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<>();
        customers.add(new Customer(1, "Engin", "Demirog"));
        customers.add(new Customer(2, "Ahmet", "Demirog"));
        customers.add(new Customer(3, "Veli", "Demirog"));
        customers.add(new Customer(4, "Deli", "Demirog"));
        customers.add(new Customer(5, "Ayse", "Demirog"));
        customers.add(new Customer(6, "Fatma", "Demirog"));
        customers.add(new Customer(7, "Zeynep", "Demirog"));
        customers.remove(3);
        for(Customer customer:customers){
            System.out.println(customer.getFirstName());
        }
    }
    
}
