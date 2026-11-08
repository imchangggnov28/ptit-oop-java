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
        System.out.print("Nhap diem: ");
        double score = sc.nextDouble();
        int band = (int) score;
        String rank = switch (band){
            case 9,10 ->  "Xuat sac";
            case 8 -> "Gioi";
            case 7 -> "Kha";
            case 5,6 ->"Trung binh";
            default ->"Yeu";
        };
        System.out.print(rank);
        sc.close();
    }
}
