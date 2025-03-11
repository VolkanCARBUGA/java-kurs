package classes;

public class ClassesAndAttributes {
    
    public static void main(String[] args) {
       Product  product=new Product();
     //  Product_Manager product_Manager=new Product_Manager();
       product.setName("Laptop");
       product.setDescription("çok iyi laptop");
       product.setPrice(12.500);
       product.setStockAmount(5);
      // product_Manager.Add(product);
      // product_Manager.Add2(1, "Laptop", "çok iyi laptop", 12.500, 5);
      Product product2=new Product();
       product2.setName("Laptop");
       product2.setDescription("çok iyi laptop");
       product2.setPrice(12.500);
       product2.setStockAmount(5);
      // product_Manager.Add(product2);
       Product product3=new Product(
        
           1, "Laptop", "çok iyi laptop", 12.500, 5
       );
    //    Product product4=new Product(
           
    //    );
      System.out.println(product3.getName());
    }
    
}
