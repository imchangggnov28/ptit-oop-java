/**
 * Họ và tên: Hoàng Thị Huyền Trang
 * Mã sinh viên: N24DCCN083
 * Lớp: D24CQCN01-N
 * Ngày nộp: 22/08/2026
*/
import java.util.Scanner;
public class StudentCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String studentId = sc.nextLine();
        String className = sc.nextLine();
        String email = sc.nextLine();
        String hobby = sc.nextLine();
    String cardTemplate = """
            ====================================================
            |                    THẺ SINH VIÊN                 |
            ====================================================
            |Họ tên: %-40s  |
            |MSSV: %-40s    |
            |Lớp: %-40s     |
            |Email: %-40s   |
            |Sở thích: %-40s|
            ====================================================
            """.formatted(name, studentId, className, email, hobby);
    System.out.print(cardTemplate);
    sc.close();
}
}
