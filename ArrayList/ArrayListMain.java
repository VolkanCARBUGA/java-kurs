package ArrayList;

import java.util.ArrayList;

public class ArrayListMain {

    public static void main(String[] args) {
       
       ArrayList list=new ArrayList();
       list.add("Engin");
       list.add("Demirog");
       list.add(1);
       list.set(1, "Yılmaz");
    //    System.out.println(list.get(1));
    //    list.remove(1);
    //    System.out.println(list.get(1));
    //    list.clone();
    for(Object item:list){
        System.out.println(item);
    }

    }
    
}
