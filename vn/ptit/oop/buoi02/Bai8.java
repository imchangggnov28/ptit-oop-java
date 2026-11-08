/**
 * Họ và tên: Hoàng Thị Huyền Trang
 * Mã sinh viên: N24DCCN083
 * Lớp: D24CQCN01-N
 * Ngày nộp: 22/08/2026
*/
import java.util.Scanner;
public class Bai8 {
    public static boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
    }
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap so N: ");
    int n = sc.nextInt();
    long start1 = System.nanoTime();
    if (isPrime(n)){
        System.out.printf("%d la so nguyen to\n",n);
    }
    else {
        System.out.printf("%d khong phai la so nguyen to\n",n);
    }
    for(int i=0;i<n;i++){
        if(isPrime(i)){System.out.print(i+" ");}
    }
    long time1 = System.nanoTime() - start1;
    System.out.printf("\nThoi gian do duoc la: %d 1/(10^9)giay",time1);
    sc.close();
    }
}
