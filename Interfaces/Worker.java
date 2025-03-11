package Interfaces;
//bizim kendi çalışanımız
public class Worker  implements IWorkable,IEatable,IPayable{
    @Override
    public void work() {
        System.out.println(" Çalışan Çalışıyor");
    }

    @Override
    public void eat() {
        System.out.println(" Çalışan Yemek Yiyor");
    }

    @Override
    public void pay() {
        System.out.println(" Çalışan Maaş Alıyor");
    }
    
}
