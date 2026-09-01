/**
 * Họ và tên: Hoàng Thị Huyền Trang
 * Mã sinh viên: N24DCCN083
 * Lớp: D24CQCN01-N
 * Ngày nộp: 22/08/2026
*/
import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int[] counter = new int[10];
        for(int i=0; i<10;i++){
            counter[i] = sc.nextInt();
        }
        for(int number:counter){
            if(number>largest){
                largest = number;
            }
        }
        System.out.printf("So lon nhat la: %d",largest);
sc.close();
    }
}
