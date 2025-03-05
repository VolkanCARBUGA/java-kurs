package Polymorphism;

public class PolymorphismMain {
    public static void main(String[] args) {
    //    BaseLogger logger=new DatabaseLogger();
    //    logger.Log("log mesajı");
    // BaseLogger[] loggers=new BaseLogger[]{new DatabaseLogger(),new EmailLogger(),new ConsoleLogger()};
    // for(BaseLogger logger:loggers){
    //     logger.Log("log mesajı");

    // }

    CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
    customerManager.Add();

    }
    
}
