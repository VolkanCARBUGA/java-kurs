package WorkingWithFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WorkingWithFiles {
   
    public static  void main(String[] args) {
      readFile();
      writeFile();
      readFile();
        // createFile();
        // getFileInfo();
    }
    public static   void createFile() {
    File   file = new File("/Users/volkancarbuga/Desktop/java kurs/files/students.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("Dosya olusturuldu");
            }else {
                System.out.println("Dosya zaten var");
            }
         } catch (IOException e) {
           // TODO Auto-generated catch block

         }
    }
    public static  void getFileInfo() {
    File  file = new File("/Users/volkancarbuga/Desktop/java kurs/files/students.txt");
        if(file.exists()) {
            System.out.println("Dosya adi : " + file.getName());
            System.out.println("Dosya yolunu : " + file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi : " + file.canWrite());
            System.out.println("Dosya okunabilir mi : " + file.canRead());
            System.out.println("Dosya boyutu : "+file.length());
        }
    }
    public static   void readFile() {
        File  file = new File("/Users/volkancarbuga/Desktop/java kurs/files/students.txt");
        try {
            Scanner reader=new Scanner(file);
            while(reader.hasNextLine()) {
                String line=reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            
        }
    }
    public static void writeFile() {
      
        try {
         
            BufferedWriter writer=new BufferedWriter(new FileWriter("/Users/volkancarbuga/Desktop/java kurs/files/students.txt",true));
            writer.newLine();
            writer.write("Volkan\t");
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
   
}
