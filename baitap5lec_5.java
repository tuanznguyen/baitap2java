import java.util.Random;
import java.util.Scanner;
public class baitap5lec_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int soNgauNhien = random.nextInt(10) + 1; // 1 den 10
        int soNguoiDungNhap;
        int dem=0;
        do {
            System.out.print("Nhap so nguyen tu 1 den 10: ");
            soNguoiDungNhap = scanner.nextInt();
            dem++;
        } while (soNguoiDungNhap != soNgauNhien);
        System.out.println("Ban da nhap dung so ngau nhien");
        System.out.println("So ngau nhien la: " + soNgauNhien);
        System.out.println("So lan nhap: " + dem);
    }
}
