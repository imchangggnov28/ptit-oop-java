/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Lớp SavingsAccount quản lý tài khoản tiết kiệm sử dụng lãi suất tĩnh dùng chung.
 */
package vn.ptit.oop.buoi04;

/**
 * Biểu diễn tài khoản tiết kiệm ngân hàng.
 */
public class SavingsAccount {
    private static double annualInterestRate = 0.0;
    private static int accountCount = 0;

    private double savingsBalance;

    /**
     * Khởi tạo tài khoản tiết kiệm với số tiền ban đầu.
     * @param savingsBalance Số dư tài khoản tiết kiệm
     */
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = Math.max(0.0, savingsBalance);
        accountCount++;
    }

    /**
     * Tính tiền lãi hàng tháng và cộng dồn vào số dư tài khoản.
     * @return Tiền lãi phát sinh trong tháng
     */
    public double calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12.0;
        savingsBalance += monthlyInterest;
        return monthlyInterest;
    }

    /**
     * Thay đổi lãi suất năm chung cho tất cả tài khoản tiết kiệm.
     * @param newRate Lãi suất năm mới (VD: 0.05 nghĩa là 5%)
     */
    public static void modifyInterestRate(double newRate) {
        if (newRate >= 0.0) {
            annualInterestRate = newRate;
        }
    }

    /**
     * Lấy tổng số tài khoản tiết kiệm đã khởi tạo.
     * @return Số lượng tài khoản đã tạo
     */
    public static int getAccountCount() {
        return accountCount;
    }

    /**
     * Lấy số dư hiện tại của tài khoản tiết kiệm.
     * @return Số dư tiền gửi
     */
    public double getSavingsBalance() {
        return savingsBalance;
    }
}