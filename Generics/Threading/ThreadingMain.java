package Generics.Threading;


public class ThreadingMain {
    
    public static void main(String[] args) {
        KronometreThread kronometreThread1=new KronometreThread("Kronometre Thread1");
        KronometreThread kronometreThread2=new KronometreThread("Kronometre Thread2");
        KronometreThread kronometreThread3=new KronometreThread("Kronometre Thread3");
        kronometreThread1.start();
        kronometreThread2.start();
        kronometreThread3.start();
    }

}
