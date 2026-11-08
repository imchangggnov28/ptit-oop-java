package vn.ptit.oop.buoi04.Bai1;
public class Account {
    private double balance;
    public Account(double initialBalance) {
        if (initialBalance >= 0.0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
            System.out.println("Lỗi: Số dư khởi tạo không được âm. Đã đặt số dư mặc định về 0.0.");
        }
    }
    public boolean credit(double amount) {
        if (amount > 0.0) {
            this.balance += amount;
            return true;
        } else {
            System.out.println("Lỗi: Số tiền nạp phải lớn hơn 0.");
            return false;
        }
    }
    // Phương thức rút tiền (debit) - Kiểm tra ràng buộc tại đây
    public boolean debit(double amount) {
        if (amount <= 0.0) {
            System.out.println("Lỗi: Số tiền rút phải lớn hơn 0.");
            return false;
        }
        
        // Ràng buộc: Không được vượt quá số dư hiện tại
        if (amount > this.balance) {
            System.out.println("Lỗi: Số tiền rút vượt quá số dư tài khoản. Giao dịch thất bại.");
            return false; // Giữ nguyên số dư và trả về false
        }

        this.balance -= amount;
        return true;
    }
    // Phương thức lấy số dư hiện tại
    public double getBalance() {
        return this.balance;
    }
}

