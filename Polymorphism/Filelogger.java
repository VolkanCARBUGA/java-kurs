package Polymorphism;

public class Filelogger extends BaseLogger{
    @Override
    public void Log(String message){
        System.out.println("Logged to file: "+message);
    }
    
}
