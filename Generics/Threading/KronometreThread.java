package Generics.Threading;

public class KronometreThread implements Runnable {
    private Thread thread;
    private  String threadName;

    public KronometreThread( String threadName) {
       
        this.threadName = threadName;
        System.out.println("Thread oluşturuluyor");
    }

    @Override
    public void run() {
        System.out.println("Thread çalıştırılıyor: "+threadName);
        try {
            for(int i=0;i<10;i++){
                System.out.println("Thread çalıştırılıyor: "+threadName+" "+i);
                Thread.sleep(i*1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread durduruldu"+threadName);
            throw new RuntimeException(e);
        } finally {
           
        }
        System.out.println("Thread sonlandırılıyor"+threadName);
        thread.run();
    }
    public void start(){
        System.out.println("Thread oluşturuluyor");
        if(thread==null){
            thread=new Thread(this,threadName);
            thread.start();
        }
    }
        
    
}
