package Inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.firstName="Engin";
        customer.lastName="Demirog";
        customer.email="lRq8g@example.com";
        Employee employee=new Employee();
        employee.firstName="Engin";
        employee.lastName="Demirog";
        employee.salary=5000;
        Person person=new Person();
        person.firstName="Engin";
        person.lastName="Demirog";
        person.age=35;
        EmployeeManager employeeManager=new EmployeeManager();
        employeeManager.Add();
        employeeManager.List();
        employeeManager.BestEmployee();
        CustomerManager customerManager=new CustomerManager();
        customerManager.Add();
        customerManager.List();
        
       
    }
    
}
