import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class baitap2java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        System.out.print("Enter fullname: ");
        String fullname = sc.nextLine();
        System.out.print("Enter student ID: ");
        int studentId = Integer.parseInt(sc.nextLine()); 
        System.out.print("Enter hometown: ");
        String hometown = sc.nextLine();
        System.out.print("Enter major: ");
        String major = sc.nextLine();
        System.out.print("Enter gpa: ");
        float gpa = Float.parseFloat(sc.nextLine());
        System.out.print("Enter scholarship (true/false): ");
        boolean scholarship = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Enter day of birth (dd/MM/yyyy): ");
        String dobString = sc.nextLine();     
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dob = sdf.parse(dobString);
            System.out.println("\n--- RESULT ---");
            System.out.println("Fullname: " + fullname);
            System.out.println("Student ID: " + studentId);
            System.out.println("Hometown: " + hometown);
            System.out.println("GPA: " + gpa);
            System.out.println("Major: " + major);
            System.out.println("Scholarship: " + scholarship);
            System.out.println("Date of birth: " + sdf.format(dob));
        } catch (Exception e) {
            System.out.println("Error: Ngay thang nhap sai dinh dang!");
        }
    }

}
