package Generics;

import ArrayList.Customer;

public class GenericsMain {
    public static void main(String[] args) {
        MyList<ArrayList.Customer> list=new MyList<ArrayList.Customer>();
        list.add(new Customer(
                1,
                "Engin",
                "Demirog"
        ));
        for(Customer customer:list){
            System.out.println(customer.getFirstName());
        }
        
    }
    
}
