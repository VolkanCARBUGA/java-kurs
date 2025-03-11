package Expection;

public class AccountManager {
  private  double balance;

    public AccountManager(double balance) {
        this.balance = balance;
    }
    public AccountManager() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance=getBalance()+amount;
        }else{
            throw new IllegalArgumentException("Tutar 0'dan büyük olmalıdır");
        }
    }
    public void withdraw(double amount){
        if(balance>=amount){
            balance=getBalance()-amount;
        }else{
            throw new IllegalArgumentException("Yetersiz bakiye");
        }
    }

    
}
