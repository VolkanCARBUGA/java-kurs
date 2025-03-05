public class sesli_harfler {
    public static void main(String[] args) {
        char harf='c';
       switch (harf) {
           case 'a', 'ı', 'o', 'u' -> System.out.println(harf+" kalın sesli harf");
           default -> System.out.println(harf+" ince sesli harf");
       }
    }
    
}
