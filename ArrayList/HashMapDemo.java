package ArrayList;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("tr","Türkçe");
        map.put("en","İngilizce");
        map.put("de","Almanca");
        map.put("fr","Fransızca");
        map.put("it","İtalyanca");
        map.put("sp","İspanyolca");
        System.out.println(map.get("tr"));
        map.size();
        map.remove("fr");
        System.out.println(map.size());
        for(String key:map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
    }
    
}
