package Generics;

public class Customer implements IEntity {
    
    int id;
    String firstName;
    String lastName;
    
    public Customer(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
   
}
