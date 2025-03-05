package Polymorphism;

public class Filelogger extends BaseLogger{
    public void Log(String message){
        System.out.println("Logged to file: "+message);
    }
    
}
