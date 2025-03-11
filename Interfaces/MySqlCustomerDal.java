package Interfaces;

public class MySqlCustomerDal  implements ICustomerDal,IRepository {

    @Override
    public void add() {
      System.out.println("MySql  eklendi");
    }

    @Override
    public void update() {
       System.out.println("MySql güncellendi");
    }

    @Override
    public void delete() {
        System.out.println("MySql silindi");
    }
    
}
