/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Bài 8.1 - Bắt và xử lý ngoại lệ cơ bản (InputMismatchException, ArithmeticException) 
 *        với vòng lặp cho phép nhập lại đến khi hợp lệ[cite: 21].
 */
package vn.ptit.oop.buoi08;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Lớp thực hiện phép chia hai số từ bàn phím, kiểm soát lỗi nhập liệu và chia cho 0[cite: 21].
 * 
 * @author Hoàng Thị Huyền Trang - N24DCCN083
 */
public class DivisionCalculator {

    /**
     * Phương thức main chạy chương trình nhập số bị chia và số chia.
     * Sử dụng vòng lặp while(true) kết hợp scanner.nextLine() để xả bộ đệm khi gặp lỗi[cite: 21].
     * 
     * @param args Tham số dòng lệnh
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;

        System.out.println("=== CHƯƠNG TRÌNH CHIA HAI SỐ AN TOÀN (BÀI 8.1) ===");

        // Vòng lặp nhập số bị chia
        while (true) {
            try {
                System.out.print("Nhập số bị chia (số nguyên): ");
                numerator = scanner.nextInt();
                break; // Thành công thì thoát vòng lặp
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Bạn phải nhập một số nguyên hợp lệ! Vui lòng thử lại.");
                scanner.nextLine(); // Xả bộ đệm, tránh vòng lặp vô hạn[cite: 21]
            }
        }

        // Vòng lặp nhập số chia
        while (true) {
            try {
                System.out.print("Nhập số chia (khác 0): ");
                denominator = scanner.nextInt();
                
                if (denominator == 0) {
                    throw new ArithmeticException("Không thể chia một số cho số 0.");
                }
                
                break; // Thành công thì thoát vòng lặp
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Bạn phải nhập một số nguyên hợp lệ! Vui lòng thử lại.");
                scanner.nextLine(); // Xả bộ đệm, tránh vòng lặp vô hạn[cite: 21]
            } catch (ArithmeticException e) {
                System.out.println("Lỗi toán học: " + e.getMessage() + " Vui lòng nhập lại số chia.");
                // Lưu ý: với nextInt(), khi nhập số 0 thì giá trị 0 đã được tiêu thụ khỏi Scanner, 
                // nhưng nếu muốn an toàn tuyệt đối có thể gọi thêm scanner.nextLine() tuỳ cấu trúc.
            }
        }

        // Tính kết quả chính xác dạng số thực
        double result = (double) numerator / denominator;
        System.out.printf("Kết quả phép tính: %d / %d = %.4f%n", numerator, denominator, result);

        scanner.close();
    }
}