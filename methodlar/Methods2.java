package methodlar;

public class Methods2 {

    public static void main(String[] args) {
        String mesaj="Bugün hava çok güzel.";
    String newMassege=    mesaj.substring(0, 3);
   topla2(1,2,3,4,5,6,7,8,9,10);
    String sehir=sehirVer();


        // ekle();
        // sil();
        // guncelle();
        // System.out.println(sehir);
    

    }

    public static void ekle() {
        System.out.println("eklendi");
    }
    public static void sil() {
        System.out.println("silindi");
    }
    public static void guncelle() {
        System.out.println("guncellendi");
    }
    public  static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public  static String sehirVer(){
        return "Ankara";
    }
    public static int topla2(int... sayilar) {
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        System.out.println(toplam);
        return toplam;
       
    }

}