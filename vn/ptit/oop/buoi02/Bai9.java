/**
 * Họ và tên: Hoàng Thị Huyền Trang
 * Mã sinh viên: N24DCCN083
 * Lớp: D24CQCN01-N
 * Ngày nộp: 22/08/2026
*/
import java.util.Scanner;
import java.math.BigInteger;
public class Bai9 {
    public static void outFibonacci(int n){
        int a=0,b=1;
        for(int i = 0; i < n; i++){
            System.out.print(a+" ");
            a=b;
            int next=b;
            b=next+a;
        }
    }
    public static BigInteger giaiThua(int n){
        BigInteger kq = BigInteger.ONE;
        for(int i = 2; i<=n; i++){
             kq = kq.multiply(BigInteger.valueOf(i));
        }
        return kq;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = sc.nextInt();
        outFibonacci(n);
        System.out.print("\n"+n+"!= "+giaiThua(n));
        sc.close();
    }
}
