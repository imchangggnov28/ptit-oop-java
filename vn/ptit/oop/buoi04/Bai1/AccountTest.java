package vn.ptit.oop.buoi04.Bai1;
public class AccountTest {
    public static void main(String[] args) {
        System.out.println("--- 1. KIỂM THỬ KHỞI TẠO TÀI KHOẢN ---");
        // Kiểm thử khởi tạo hợp lệ
        Account account1 = new Account(150.0);
        System.out.printf("Số dư account1 ban đầu: $%.2f%n", account1.getBalance());

        // Kiểm thử khởi tạo KHÔNG hợp lệ (số dư âm)
        Account account2 = new Account(-50.0);
        System.out.printf("Số dư account2 ban đầu: $%.2f%n", account2.getBalance());


        System.out.println("--- 2. KIỂM THỬ NẠP TIỀN (CREDIT) ---");
        System.out.println("Nạp thêm $50.0 vào account1...");
        if (account1.credit(50.0)) {
            System.out.printf("Nạp tiền thành công! Số dư mới: $%.2f%n", account1.getBalance());
        }


        System.out.println("--- 3. KIỂM THỬ RÚT TIỀN HỢP LỆ (DEBIT) ---");
        System.out.println("Rút $70.0 từ account1...");
        if (account1.debit(70.0)) {
            System.out.printf("Rút tiền thành công! Số dư mới: $%.2f%n", account1.getBalance());
        }


        System.out.println("--- 4. KIỂM THỬ RÚT TIỀN QUÁ SỐ DƯ (VI PHẠM RÀNG BUỘC) ---");
        // Hiện tại account1 còn: 150 + 50 - 70 = 130. Thử rút hẳn 200.
        System.out.printf("Số dư hiện tại của account1 trước khi rút lỗi: $%.2f%n", account1.getBalance());
        System.out.println("Thử rút $200.0 từ account1...");
        
        if (account1.debit(200.0)) {
            System.out.println("Giao dịch thành công (Lỗi logic nghiêm trọng!)");
        } else {
            System.out.println("--> [Thành công] Lớp Account đã tự chặn giao dịch vi phạm này.");
        }
        System.out.printf("Số dư account1 sau khi chặn giao dịch: $%.2f%n", account1.getBalance());
    }
}
