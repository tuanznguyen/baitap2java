import java.util.Random;
import java.util.Scanner;
public class baitap2lec_5 {
    public static void main(String[] args) {

        Random random = new Random();

        double soThuc = random.nextDouble() * (8.0 - 1.8) + 1.8;

        System.out.println("so thuc ngau nhien tu 1.8 den 8.0 la: " + soThuc);
    }
}
