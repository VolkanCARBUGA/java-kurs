package Expection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileDemo {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        int total = 0;

        try {
            // Dosya yolunu doğru şekilde belirtiyoruz
            bufferedReader = new BufferedReader(
                    new FileReader("/Users/volkancarbuga/Desktop/java kurs/Expection/sayilar.txt"));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                total += Integer.parseInt(line);
               
            }
            System.out.println("Toplam : " + total);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                bufferedReader.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }

    }

}
