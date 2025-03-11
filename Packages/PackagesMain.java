package Packages;

import Packages.matematik.DortIslem;
import Packages.matematik.Logaritma;
import java.util.Scanner;



public class PackagesMain {

    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
           System.out.println("Lütfen bir sayı giriniz");
        int sayi=scanner.nextInt();
        //    int faktoriyel=1;
        //    for (int i = 1; i <= sayi; i++) {
        //        faktoriyel*=i;
        //    }
        //    System.out.println(faktoriyel);
          DortIslem dortIslem=new DortIslem();
          System.out.println(dortIslem.Topla(2,3));
          Logaritma logaritma=new Logaritma();
          System.out.println(logaritma.logaritma(sayi));
    }
    }
    
}
