/**
 * Họ và tên: Hoàng Thị Huyền Trang
 * Mã sinh viên: N24DCCN083
 * Lớp: D24CQCN01-N
 * Ngày nộp: 22/08/2026
*/
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Bai9 {
    public static void main(String[] args){
       System.out.println(0.1+0.2);//Double k phu hop vi se in ra nhieu chu so thap phan sau dau phay->Du thua
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap tong hoa don(VND): ");
       BigDecimal totalBill = new BigDecimal(sc.nextLine().trim());
       System.out.print("Nhap so nguoi: ");
       BigDecimal numberOfPerson = new BigDecimal(sc.nextLine().trim());
       System.out.print("Nhap phan tram tip: ");
       BigDecimal tipPercent = new BigDecimal(sc.nextLine().trim());

       BigDecimal multiPercent = tipPercent.divide(new BigDecimal("100"), 10, RoundingMode.HALF_UP).add(BigDecimal.ONE);
       BigDecimal totalWithTip = totalBill.multiply(multiPercent);

       BigDecimal moneyOfPerPerson = totalWithTip.divide(numberOfPerson, 10, RoundingMode.HALF_UP);
       
       BigDecimal roundedPerPerson = moneyOfPerPerson.divide(new BigDecimal("1000"), 0, RoundingMode.CEILING).multiply(new BigDecimal("1000"));
       
       System.out.println("So tien moi nguoi phai tra (lam tron den 1000VND) la: "+roundedPerPerson);
       sc.close();
    }  
}
