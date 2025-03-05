package Polymorphism;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }
    
    public void Add(){
      System.out.println("Müşteri eklendi");
     this.logger.Log("Log mesajı");
    }
    
}
