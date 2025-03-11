package Packages.matematik;

public class DortIslem {
    
    public  int Topla(int... sayilar){  
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    
}
