package methodlar;
public class Methods {
    public static void main(String[] args) {
        sayi_bulma();
    }
    public  static  void sayi_bulma(){
        int[] numbers={1,2,3,4,5};
        int aranacak=3;
        boolean varMi=false;
        for(int number:numbers){
            if(number==aranacak){
                varMi=true;
                break;
            }
        }
        if(varMi){
            System.out.println(aranacak+" sayisi var");
        }else{
            System.out.println(aranacak+" sayisi yok");
        }
    }
    
}
