package Abstractclasses;

public class AbstractsDemo {
    public static void main(String[] args) {
       
        CustomerManager customerManager=new CustomerManager();
        customerManager.databaseManager=new MySqlDatabaseManager();
        customerManager.getCustomers();
    }
}
