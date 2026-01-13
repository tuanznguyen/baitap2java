import java.util.Random;
public class baitap3lec_5 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(80-3+1) + 3;   
        System.out.println("So ngau nhien: " + n);
        if (n % 2 == 0) {
            System.out.println(n + " la so chan");
        } else {
            System.out.println(n + " la so le");
        }
    }
}
