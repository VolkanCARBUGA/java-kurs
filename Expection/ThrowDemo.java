package Expection;

public class ThrowDemo {

    public static void main(String[] args) {
        AccountManager accountManager=new AccountManager();
        accountManager.deposit(1000);
        try {
            accountManager.withdraw(900);
            System.out.println(accountManager.getBalance());
            accountManager.withdraw(1200);
            System.out.println(accountManager.getBalance());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
