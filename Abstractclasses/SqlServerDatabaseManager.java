package Abstractclasses;

public class SqlServerDatabaseManager  extends BaseDatabaseManager{

    @Override
    public void getData() {
        System.out.println("Veriler SqlServer'dan getirildi"); 
    }
    
}
