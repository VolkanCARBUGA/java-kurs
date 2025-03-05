package Polymorphism;

public class AskerKrediManager extends BaseKrediManager{
    public double  hesaspla(double tutar){ 
        System.out.println("Asker kredisi hesaplandı");
        return tutar*1.10;
    }
    
}
