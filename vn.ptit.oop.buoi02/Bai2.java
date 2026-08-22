/**
 * Họ và tên: Hoàng Thị Huyền Trang
 * Mã sinh viên: N24DCCN083
 * Lớp: D24CQCN01-N
 * Ngày nộp: 22/08/2026
*/
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 3 so nguyen a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        double avg = sum/3;
        long sub = a*b*c;
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        String inKq = """
                Tong a+b+c = %d
                Trung binh (a+b+c)/3 = %.2f
                Tich a*b*c = %d
                So nho nhat la: %d
                So lon nhat la: %d
                """.formatted(sum, avg, sub, min, max);
        System.out.print(inKq);
        sc.close();
    }
}
