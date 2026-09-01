/**
 * Họ và tên: Hoàng Thị Huyền Trang
 * Mã sinh viên: N24DCCN083
 * Lớp: D24CQCN01-N
 * Ngày nộp: 22/08/2026
*/
public class Bai12 {
    public static int demSoBuocCollatz(long n) {
        int count = 0;
        while (n > 1) {
            if (n % 2 == 0) {//khi n chan
                n = n / 2;
            } else {//khi n le
                n = 3 * n + 1;
            }
            count++;//tang bien dem
        }
        return count;
    }
    public static void main(String[] args) {
        int maxBuoc = 0;
        int nMax = 1;
        for (int i = 1; i <= 10000; i++) {
            if (demSoBuocCollatz(i) > maxBuoc) {
                maxBuoc = demSoBuocCollatz(i);
                nMax = i;
            }
        }
        System.out.printf("Số n = %d có số bước Collatz lớn nhất: %d bước.\n", nMax, maxBuoc);
        }
}
