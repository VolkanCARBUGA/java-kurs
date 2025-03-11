package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTypeDemo {
    public static void main(String[] args) {
       ArrayList<String> cities=new ArrayList<>();
       cities.add("Ankara");
       cities.add("İstanbul");
       cities.add("İzmir");
       cities.add("Bursa");
       cities.add("Antalya");
       cities.add("Mersin");
       cities.add("çanakkale");
      cities.remove(2);
    Collections.sort(cities);
    cities.add("Denizli");
       for(String city:cities){
           System.out.println(city);
       }
    }
    
}
