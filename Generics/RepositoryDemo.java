package Generics;

public class RepositoryDemo {
    public static void main(String[] args) {
      
        Validator validator=new Validator();
        Customer customer=new Customer(1,"Engin","Demirog");
        validator.validate(customer);
    }
    
}
