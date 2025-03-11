package statics;

public class ProductValidator {
    public ProductValidator(){
        
    }
    static {
        System.out.println("Static block calisti");
    }
    public static   boolean isValid(Product product){
        return product.price>0 && !product.name.isEmpty();
       
        
    }
    public void birSey(){
        System.out.println("Birsey");
        
    }
    public  class  BirSey{
        public static  void sil(){
            System.out.println("Silindi");
        }
    }
    
}
