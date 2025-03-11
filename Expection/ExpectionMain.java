package Expection;

public class ExpectionMain {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[] { 1, 2, 3 };
            System.out.println(numbers[7]);
        } catch (Exception e) {
           System.out.println(e.getMessage());
           throw e;
        } finally {
        }

    }

}
