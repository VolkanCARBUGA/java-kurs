package statics;

public  class DatabaseHelper {
    
    public static class  Crud{
        public static void delete(){
            System.out.println("Silindi");
        }
        public static void update(){
            System.out.println("Güncellendi");
        }

    }
    public  static  class  Connection{
        public static void createConnection(){
            System.out.println("Bağlantı kuruldu");
        }
    }

    
}
