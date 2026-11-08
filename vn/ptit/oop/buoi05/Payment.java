/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Mô hình đa hình các hình thức thanh toán (Cash, Card, EWallet, BankTransfer) để tính doanh thu thực nhận.
 */
package vn.ptit.oop.buoi05;

/**
 * Lớp trừu tượng hình thức thanh toán chung.
 */
public abstract class Payment {
    private double amount;

    /**
     * Khởi tạo giao dịch thanh toán.
     * @param amount Số tiền thanh toán ban đầu
     */
    public Payment(double amount) {
        this.amount = Math.max(0.0, amount);
    }

    /**
     * Lấy số tiền giao dịch gốc.
     * @return Số tiền ban đầu
     */
    public double getAmount() { return amount; }

    /**
     * Tính số tiền thực tế khách phải trả sau khi áp dụng phí hoặc ưu đãi.
     * @return Số tiền thực trả
     */
    public abstract double finalAmount();
}

/** Thanh toán bằng tiền mặt (không phát sinh phí) */
class CashPayment extends Payment {
    public CashPayment(double amount) { super(amount); }
    @Override public double finalAmount() { return getAmount(); }
}

/** Thanh toán qua thẻ (phí 2%) */
class CardPayment extends Payment {
    public CardPayment(double amount) { super(amount); }
    @Override public double finalAmount() { return getAmount() * 1.02; }
}

/** Thanh toán qua ví điện tử (giảm 5% tối đa 20.000đ) */
class EWalletPayment extends Payment {
    public EWalletPayment(double amount) { super(amount); }
    @Override public double finalAmount() {
        double discount = Math.min(getAmount() * 0.05, 20000.0);
        return getAmount() - discount;
    }
}

/** Thanh toán bằng chuyển khoản ngân hàng (không phát sinh phí) */
class BankTransferPayment extends Payment {
    public BankTransferPayment(double amount) { super(amount); }
    @Override public double finalAmount() { return getAmount(); }
}