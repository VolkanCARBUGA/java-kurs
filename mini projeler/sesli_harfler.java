public class sesli_harfler {
    public static void main(String[] args) {
        char harf='c';
       switch (harf) {
           case 'a':
           case 'ı':
           case 'o':
           case 'u':
               System.out.println(harf+" kalın sesli harf");    
               break;
           default:
               System.out.println(harf+" ince sesli harf");
       }
    }
    
}
