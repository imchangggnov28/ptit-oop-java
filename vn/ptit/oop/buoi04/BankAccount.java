/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Sửa lỗi thiết kế BankAccount vi phạm tính đóng gói.
 */
package vn.ptit.oop.buoi04;

/**
 * Lớp BankAccount đã được chuẩn hóa thiết kế hướng đối tượng.
 */
public class BankAccount {
    private double balance;
    private String ownerName;
    private static double interestRate = 0.05;

    /**
     * Khởi tạo tài khoản ngân hàng.
     * @param ownerName Tên chủ tài khoản
     * @param initialBalance Số dư ban đầu
     */
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = Math.max(0.0, initialBalance);
    }

    /**
     * Đặt lãi suất ngân hàng dùng chung.
     * @param rate Lãi suất mới
     */
    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    /**
     * Rút tiền an toàn từ tài khoản.
     * @param amount Số tiền rút
     * @return {@code true} nếu rút thành công
     */
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    /** @return Số dư tài khoản */
    public double getBalance() { return balance; }
    /** @return Tên chủ tài khoản */
    public String getOwnerName() { return ownerName; }
}