package Inheritance;

public class InhertanceDemo {
    public static void main(String[] args) {
    //    OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
    //    ogretmenKrediManager.Hesaspla();
    //    TarimKrediManager tarimKrediManager=new TarimKrediManager();
    //    tarimKrediManager.Hesaspla();
    KrediUI krediUI=new KrediUI();
    krediUI.KrediHesapla(new AskerKrediManager());
    
        
    }
    
}
