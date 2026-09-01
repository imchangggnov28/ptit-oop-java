/**
 * Họ và tên: Hoàng Thị Huyền Trang
 * Mã sinh viên: N24DCCN083
 * Lớp: D24CQCN01-N
 * Ngày nộp: 22/08/2026
*/
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Fahrenheit: ");
       float fahrenheit = sc. nextFloat();
       System.out.printf("Celsius= %.2f\n",(fahrenheit-32)*5.0/9.0); 
       sc.close(); 
}
}
