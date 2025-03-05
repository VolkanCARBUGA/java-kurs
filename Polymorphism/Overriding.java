package Polymorphism;

public class Overriding {
    public static void main(String[] args) {
        BaseKrediManager[] krediler=new BaseKrediManager[]{new OgretmenKrediManager(),new TarimKrediManager(),new AskerKrediManager()};
        for (BaseKrediManager kredi:krediler) {
           double tutar=   kredi.hesaspla(1000);
           System.out.println(tutar);
        }
    //     BaseKrediManager baseKrediManager=new OgretmenKrediManager();
    //  double tutar=   baseKrediManager.hesaspla(1000);
    //  System.out.println(tutar);
        
    }
    
}
